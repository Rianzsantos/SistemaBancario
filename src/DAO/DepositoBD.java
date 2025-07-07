package DAO;

import Model.DepositoModel;
import Model.PixModel;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DepositoBD {
    
    public void VerificarDepositoBD(DepositoModel deposito){
        
String sqlDeposito = "INSERT INTO deposito (origem, valor, data, cpf) VALUES(?,?,?,?)";    
    Connection connection = null;
    PreparedStatement stmt = null;
    
        try {
            connection = new conexaoBD().getConnection();
            stmt = connection.prepareStatement(sqlDeposito);
            
            stmt.setInt(1, deposito.getOrigem());
            stmt.setDouble(2, deposito.getValor());
            stmt.setTimestamp(3,  new java.sql.Timestamp(deposito.getData().getTime()));
            stmt.setString(4, deposito.getCpf());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deposito enviado com sucesso.");
            
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao enviar o Deposito ");
                              
        } finally {
            try {
                if (stmt != null) stmt.close();
                if(connection != null) connection.close();
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão");
            } 
            
        
        }
        
        
        
        
        
    
    }
    
    public List<DepositoModel> buscarExtrato() {
    List<DepositoModel> lista = new ArrayList<>();
    String sql = "SELECT origem, valor, data, cpf, tipo FROM deposito";

    try (Connection con = new conexaoBD().getConnection();
         PreparedStatement stmt = con.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            DepositoModel deposito = new DepositoModel(
            rs.getInt("origem"),         // correto para "Destino"
            rs.getString("tipo"),
            rs.getString("cpf"),
            rs.getDouble("valor"),
            rs.getTimestamp("data")
            );
            lista.add(deposito);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return lista;
}
}