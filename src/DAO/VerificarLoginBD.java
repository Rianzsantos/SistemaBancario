/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.UsuarioLogado;
import Model.VerificarLoginModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class VerificarLoginBD {
    
     public String VerificarUsuarioBD(VerificarLoginModel Login){
         
        String sqlCPF = "SELECT nome FROM cadastro_pessoa WHERE cpf = ?";
        String sqlSenha = "SELECT nome FROM cadastro_pessoa WHERE cpf = ? AND senha = ?";
         
        Connection connection = null;
        PreparedStatement stmt = null; 
        ResultSet rs = null;
        
         try {
             connection = new conexaoBD().getConnection();
             
             // verificar se cpf existe
             stmt = connection.prepareStatement(sqlCPF);
             stmt.setString(1, Login.getCpf());
             rs = stmt.executeQuery();
             
             if(!rs.next()){
                 return "CPF NÃO CADASTRADO";
             } 
             rs.close();
             stmt.close();
             
             // verificar se a senha esta correta
             
             stmt = connection.prepareStatement(sqlSenha);
             stmt.setString(1, Login.getCpf());
             stmt.setString(2, new String (Login.getSenha()));
             rs = stmt.executeQuery();
             
             if(rs.next()){
                 String nomeUsuario = rs.getString("nome");
                 Login.setNome(nomeUsuario);
                 
                 
                 UsuarioLogado.getInstance().setNome(nomeUsuario);
                 return "LOGIN CORRETO";
             }else{
                 return "SENHA ERRADA";
             }
             
         } catch (Exception e) {
             e.printStackTrace();
             return "ERRO";
             
         }finally{
             try {
                 if(rs != null)rs.close();
                 if(stmt != null)stmt.close();
                 if(connection != null) connection.close();
             } catch (Exception e) {
                 e.printStackTrace();// identifica bugs 
             }
         
         }
     
     }

}
    
   
                
        
       
    
    
    
    

