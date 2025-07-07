
package Controller;

import Model.CadastroPessoaModel;
import javax.swing.JOptionPane;

public class CadastroPessoaController {
    
    public void cadastrarPessoaController(String nome, String cpf, char [] senha){
        // se esse if for inválido o método para aqui até o usuário inserir um cpf válido!
        if (cpf == null || cpf.length()!= 11) {
            JOptionPane.showMessageDialog(null, "O CPF deve conter 11 caracteres e não pode ser nulo. Por favor, tente novamente!");
            return;
        }
        //if nome != null && nome.length()>0
        // validação do no e da senha
        if ((nome != null && nome.length()>0) &&
         (senha != null && senha.length>0)){
         
          //instânciar um funcionario
          CadastroPessoaModel novoCadastro = new CadastroPessoaModel(nome, cpf, senha);
          JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) ao CypherBank, " + nome + "!" +  "\n" + "Dados registrados com sucesso!");
          //JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) ao CypherBank, " + nome + "!");
          novoCadastro.CadastrarPessoaDAO(novoCadastro);

      // caso o nome e a senha sejam inválidos 
      } else{
          JOptionPane.showMessageDialog(null, "Digite os dados corretamente! O nome e a senha não podem estar vazios.");
      }
    
    
    }
    
    
}
