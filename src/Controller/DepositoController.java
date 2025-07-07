

package Controller;

import DAO.DepositoBD;
import Model.DepositoModel;
import java.util.Date;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

public class DepositoController {
    
    public void salvarDeposito(String cpf, double valor){
        
        
        if ( valor <= 0) {
            JOptionPane.showMessageDialog(null, "Informe um valor válido");
            return;
            
        }
        String tipo = "DEPOSITO";
        Timestamp data = new Timestamp(System.currentTimeMillis());
        // cria o objeto do model com os dados informados
        
        int origem = (int)(Math.random() * 20) + 1; 
        DepositoModel deposito = new DepositoModel(origem, tipo, cpf, valor, data);
        deposito.getData();
        deposito.getTipo();
        deposito.getCpf();
        deposito.getOrigem();
        //deposito.getValor();
      
        // criar o objeto DAO e faz a verificação
        DepositoBD dao = new DepositoBD();
        dao.VerificarDepositoBD(deposito);
        
        
        
        
    
    
    }
    
}
