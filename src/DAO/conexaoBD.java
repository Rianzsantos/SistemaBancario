
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBD {
    public Connection getConnection() throws SQLException{
        Connection conn = null;
        String className = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/sistemaBancario";
        String user = "postgres";
        String password = "admin";
        try {
            Class.forName(className);
            System.out.println("Driver de conexão encontrado!");
        } catch (Exception e ) {
            e.printStackTrace();
            System.out.println("Driver banco de dados não encontrado!");
        }
        try {
             conn = DriverManager.getConnection(url, user, password);
             System.out.println("Conexão com banco de dados realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar banco de dados!");
        }
        return conn;
    }    
        
    
    
    

}
    
