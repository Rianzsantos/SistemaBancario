
package Teste;
import DAO.conexaoBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TesteConexao {
    
    public static void main(String[] args) throws SQLException {
        
        conexaoBD conex = new conexaoBD();
        conex.getConnection();
       
    }
    
}
