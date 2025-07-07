
package DAO;

import Model.CadastroPessoaModel;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroPessoaBancoDados {
                                      // Cadastro será importante para usar o get.Nome, cpf, senha.
    public void inserirCadastroPessoaBD(CadastroPessoaModel Cadastro){
        // essa string carrega o comando sql 
        String sql = "INSERT INTO cadastro_pessoa(nome, cpf, senha) values(?,?,?)";
        Connection connection = null;
        PreparedStatement stmt = null; 
        
        try {
            // faz a conexão com o banco de dados postgresql
            connection = new conexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, Cadastro.getNome());
            stmt.setString(2, Cadastro.getCpf());
            //new String(Cadastro.getSenha()) --> converte char para String
            // o método stmt.set não possui setChar. Apenas setString 
            stmt.setString(3, new String(Cadastro.getSenha()));
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos no banco de dados com sucesso!");            
        } catch (Exception e) {
            // e.printStackTrace(); mostra o erro que pode acontecer 
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar o banco de dados!");
        } finally{
            
            try {
                if(stmt != null){
                stmt.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt!");
            } 
            
            try {
                if(connection != null){
                    connection.close();
                }
        
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão!");
            } 
        
        }

    }
    
}
