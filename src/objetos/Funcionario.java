
package objetos;


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
