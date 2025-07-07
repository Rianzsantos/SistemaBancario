
package Model;

import DAO.PixBD;
import java.sql.Timestamp;

public class PixModel {
    //private int idPagamento;
    private String chave;
    private double valor;
    private Timestamp data;
    private String tipo;
    
    
    //construtor

    public PixModel( String chave, double valor, Timestamp data, String tipo) {
        //this.idPagamento = idPagamento;
        this.chave = chave;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
        
    }
    // getter e setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }


    
    
    public void CadastrarPessoaDAO(PixModel pix){
        PixBD novoPix = new PixBD();
        novoPix.VerificarPixBD(pix);
        System.out.println("Dados enviados para o banco de dados!");
       
    
    }
}