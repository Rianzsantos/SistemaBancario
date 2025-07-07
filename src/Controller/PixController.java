package Controller;

import DAO.PixBD;
import Model.PixModel;
import java.util.Date;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
public class PixController {
    
    public void salvarPix(String chave, double valor){
        
        
        if ( valor <= 0) {
            JOptionPane.showMessageDialog(null, "Informe um valor válido");
            return;
            
        }
        String tipo = "PIX";
        Timestamp data = new Timestamp(System.currentTimeMillis());
        // cria o objeto do model com os dados informados
        PixModel pix = new PixModel(chave, valor, data, tipo);
        pix.getChave();
        pix.getValor();
        pix.getData();
        pix.getTipo();
        
        // criar o objeto DAO e faz a verificação
        PixBD dao = new PixBD();
        dao.VerificarPixBD(pix);
        
        
        
        
    
    
    }
    
}