
package Model;

import DAO.DepositoBD;
import java.sql.Timestamp;

public class DepositoModel {
    private int origem;
    private String tipo;
    private String cpf;
    private double valor;
    private Timestamp data;

    public DepositoModel(int origem, String tipo, String cpf, double valor, Timestamp data) {
        this.origem = origem;
        this.tipo = tipo;
        this.cpf = cpf;
        this.valor = valor;
        this.data = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   

    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        this.origem = origem;
    }

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    public void CadastrarPessoaDAO(DepositoModel deposito){
        DepositoBD novoDeposito = new DepositoBD();
        novoDeposito.VerificarDepositoBD(deposito);
        System.out.println("Dados enviados para o banco de dados!");
       
    
    }
    
}
