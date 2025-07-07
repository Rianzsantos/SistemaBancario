package DAO;

import Model.PixModel;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PixBD {
    
    public void VerificarPixBD(PixModel pix){
        
    String sqlPix = "INSERT INTO  pix (chave, valor, data) VALUES(?,?,?)";
    
    Connection connection = null;
    PreparedStatement stmt = null;
    
        try {
            connection = new conexaoBD().getConnection();
            stmt = connection.prepareStatement(sqlPix);
            
            stmt.setString(1, pix.getChave());
            stmt.setDouble(2, pix.getValor());
            stmt.setTimestamp(3,  new java.sql.Timestamp(pix.getData().getTime()));
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Pix enviado sucesso.");
            
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao enviar o Pix ");
                              
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
    
    public List<PixModel> buscarExtrato() {
    List<PixModel> lista = new ArrayList<>();
    String sql = "SELECT chave, valor, tipo, data FROM pix";

    try (Connection con = new conexaoBD().getConnection();
         PreparedStatement stmt = con.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            PixModel pix = new PixModel(
                rs.getString("chave"),
                rs.getDouble("valor"),
                rs.getTimestamp("data"), // para manter a hora
                rs.getString("tipo")
            );
            lista.add(pix);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return lista;
}
}