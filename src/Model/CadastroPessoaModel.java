
package Model;

import DAO.CadastroPessoaBancoDados;


public class CadastroPessoaModel {
    //private int id;
    private String nome;
    private String cpf;
    private char [] senha;
    
    // construtor 
    public CadastroPessoaModel( String nome, String cpf, char[] senha){
        //this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha; 
              
    }
    // getter e setters
    
    // int id comentado pois não será necessário neste momento, ficarlizar depois

    //public int getId() {
        //return id;
    //}

    //public void setId(int id) {
        //this.id = id;
    //}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }
    // criar um método que faz o envio do as infos do objeto criado para conectar ao banco de dados 
    
    public void CadastrarPessoaDAO(CadastroPessoaModel Cadastro){
        CadastroPessoaBancoDados novoCadastro = new CadastroPessoaBancoDados();
        novoCadastro.inserirCadastroPessoaBD(Cadastro);
        System.out.println("Dados enviados para o banco de dados!");
       
    
    }
    
    
                
}
    
    
    
    
