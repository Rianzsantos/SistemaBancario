/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class UsuarioLogado {
    
    private static UsuarioLogado instance;
    private String nome;
    private String cpf;
    
    private UsuarioLogado() {}

    public static UsuarioLogado getInstance() {
        if (instance == null) {
            instance = new UsuarioLogado();
        }
        return instance;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
