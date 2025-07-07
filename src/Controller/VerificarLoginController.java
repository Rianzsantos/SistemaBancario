
package Controller;

import DAO.VerificarLoginBD;
import Model.UsuarioLogado;
import Model.VerificarLoginModel;
import View.ContaView;
import View.LoginView;
import View.PixView;

import javax.swing.JOptionPane;

public class VerificarLoginController {
    
                                                                                  
    public void VerificarUsuarioController(String nome, String cpf, char[] senha, LoginView loginView){
        
        // cria o objeto do Model com os dados informados
        VerificarLoginModel login = new VerificarLoginModel(nome, cpf, new String(senha));
        login.setCpf(cpf);
        login.setNome(nome);
        
        // cria o objeto DAO e faz a verificação 
        VerificarLoginBD dao = new VerificarLoginBD();
        String resposta = dao.VerificarUsuarioBD(login);
        
        switch (resposta) {
            case "LOGIN CORRETO":
             UsuarioLogado.getInstance().getNome();
                JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) novamente, " + UsuarioLogado.getInstance().getNome() + "!");
                
                // se o login estiver correto a interface ContaView abrirá automaticamente. 
                ContaView ContaViewFrame = new ContaView();
                ContaViewFrame.setVisible(true);
                ContaViewFrame.pack();
                ContaViewFrame.setLocationRelativeTo(null);
                loginView.dispose();
                
             
                
                break;

                
            case "SENHA ERRADA":
                JOptionPane.showMessageDialog(null, "Senha inválida, tente novamente!");
                
                break;
            
            case "CPF NÃO CADASTRADO":
                JOptionPane.showMessageDialog(null, "CPF não possui cadastro no sistema. Por favor, realize o cadastro!");
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro ao verificar o login. Tente novamente mais tarde.");
        }
        
    
    }
}
