
package Model;

import DAO.VerificarLoginBD;

public class VerificarLoginModel {
    private String nome;
    private String cpf;
    private String senha; 
    
    public VerificarLoginModel(String nome, String cpf, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    
    }
    
    // getter e setter

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
        public void CadastrarPessoaDAO(VerificarLoginModel Login){
        VerificarLoginBD novoLogin = new VerificarLoginBD();
        novoLogin.VerificarUsuarioBD(Login);
        System.out.println("Dados enviados para o banco de dados!");
       
        
        UsuarioLogado.getInstance().setNome(nome);
        UsuarioLogado.getInstance().setCpf(cpf);
    
    }
            
}
