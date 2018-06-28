package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    private final String url = "jdbc:mysql://localhost:3306/trabalho";
    private final String user = "root";
    private final String password = "proway";
    
    public Connection obterConexao(){
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return conexao;
    }
}
