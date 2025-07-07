
package Model;

public class Conta {
    private int numero;
    private double saldo;
    private double extrato;
    
    //construtor
    public Conta(int numero, double saldo, double extrato) {
        this.numero = numero;
        this.saldo = saldo;
        this.extrato = extrato;
    }
    
    // getter e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getExtrato() {
        return extrato;
    }

    public void setExtrato(double extrato) {
        this.extrato = extrato;
    }
    
    
   
}
