/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import objetos.Funcionario;
import objetos.Listas;

/**
 *
 * @author 104935
 */
public class Login {
    
    public static String autenticaUsuario(JTextField usuario, JPasswordField senha){
        if(usuario.getText().equals("") || new String(senha.getPassword()).trim().equals("")){
            return "ERRO";
        }else if(usuario.getText().equals("joao") && new String(senha.getPassword()).trim().equals("gasolina")){
            return "GERENTE";
        }else{
            for(Funcionario f : Listas.equipe){
                if(f.getLoginFuncionario().equals(usuario.getText()) && f.getSenhaFuncionario().equals(new String(senha.getPassword()).trim())){
                   return "FUNCIONARIO";
                }
            }
        }
        return "";
    }
}
