/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

public class ContaBD {

    public int buscarIdPorCpf(String cpf) {
    int id = -1;
    String sql = "SELECT numero FROM conta WHERE cpf = ?";
    
    try (Connection conn = new conexaoBD().getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, cpf);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            id = rs.getInt("id");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return id;
}
 }
