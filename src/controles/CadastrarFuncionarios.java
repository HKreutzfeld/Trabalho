
package controles;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import objetos.Funcionario;
import objetos.Listas;


public class CadastrarFuncionarios {
    
   
    private static boolean existeLoginFuncionario(String login){
        boolean existe = false;
        for(Funcionario f : Listas.equipe){
            if(f.getLoginFuncionario().equals(login)){
                existe = true;
                break;
            }
        }
        return existe;
    }
    private static boolean existeNomeFuncionario(String funcionario){
        boolean ret = false;
        for(Funcionario f : Listas.equipe){
            if(f.getNome().equals(funcionario)){
                 JOptionPane.showMessageDialog(null, "Funcionario ja está cadastrado");
                //ret = true;
                break;
            }
        }
        return ret;
    }
    private static boolean campoVazio(JTextField texto){
        return texto.getText().trim().equals("");
    }
    private static boolean senhaVazia(JPasswordField pwd){
        return new String(pwd.getPassword()).equals("");
    }
    public static void cadastraFuncionario(JTextField campoNome, JTextField campoUsuario, JPasswordField campoSenha){
        if(campoVazio(campoNome)){
            campoNome.requestFocus();
        }else if(campoVazio(campoUsuario)){
            campoUsuario.requestFocus();
        }else if(senhaVazia(campoSenha)){
            campoSenha.requestFocus();
        }else if(existeNomeFuncionario(campoNome.getText().trim())){
            campoNome.requestFocus();
        }else if(existeLoginFuncionario(campoUsuario.getText().trim())){
            campoUsuario.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado!");
            Funcionario f = new Funcionario(campoUsuario.getText().trim(), new String(campoSenha.getPassword()).trim(), campoNome.getText().trim());
            Listas.equipe.add(f);
            
            campoNome.setText("");
            campoUsuario.setText("");
            campoSenha.setText("");
        }
    }
}
    
