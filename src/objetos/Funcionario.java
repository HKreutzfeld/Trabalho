/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author 104935
 */
public class Funcionario {
    private String nome;
    private String senhaFuncionario;
    private String loginFuncionario;

    public Funcionario(String nome, String senhaFuncionario, String loginFuncionario) {
        this.nome = nome;
        this.senhaFuncionario = senhaFuncionario;
        this.loginFuncionario = loginFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
    }
    
}
