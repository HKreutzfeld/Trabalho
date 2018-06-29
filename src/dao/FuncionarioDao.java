package dao;

import bean.FuncionarioBean;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FuncionarioDao {
    private Connection conexao; 
    
    public FuncionarioDao(){
        ConnectionFactory cf = new ConnectionFactory();
        this.conexao = cf.obterConexao();
    }
    public void cadastrarFuncionario(FuncionarioBean objeto){
        String sql = "INSERT INTO clientes(nomeFuncionario, "
                + "lginFuncionario,senhaFuncionario)VALUES(?,?,?)";
        
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
         
            pstmt.setString(1,objeto.getNomeFuncionario());
            pstmt.setString(2,objeto.getloginFuncionario());
            pstmt.setString(3,objeto.getSenhaFuncionario());
            //Executar 
            pstmt.execute();
            //Fechar a conexão
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha! O erro foi: "+e.getMessage());
        }
    }
    public DefaultTableModel listarFuncionario(){
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("Nome");
            modelo.addColumn("Login");
            modelo.addColumn("Senha");
            
            String sql = "SELECT * FROM CadastrarFuncionarios";
            
            try {
                Statement stmt = conexao.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()) {                    
                    modelo.addRow(new Object[]{
                        rs.getString("nomeFuncionario"),
                        rs.getString("loginFuncionario"),
                        rs.getString("senhaFuncionario")
                    });
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha!");
        }
          return modelo;  
        }
}
