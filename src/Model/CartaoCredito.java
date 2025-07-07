
package Model;

public class CartaoCredito {
    private int idPagamento;
    private String numero;
    private String validade;
    private double limite;
    private double valor;
    
    
    // construtores

    public CartaoCredito(int idPagamento, String numero, String validade, double limite, double valor) {
        this.idPagamento = idPagamento;
        this.numero = numero;
        this.validade = validade;
        this.limite = limite;
        this.valor = valor;
    }
    // getter e setters

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
  
}
