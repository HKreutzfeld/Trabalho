package dao;

import bean.ClienteBean;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteDao {
    private Connection conexao; 
    
    public ClienteDao(){
        ConnectionFactory cf = new ConnectionFactory();
        this.conexao = cf.obterConexao();
    }
    public void cadastrarCliente(ClienteBean objeto){
        String sql = "INSERT INTO clientes(idCliente, nomeCliente, nomeCombustivel, valor)VALUES(?,?,?,?)";
        
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setInt(1,objeto.getIdCliente());
            pstmt.setString(2,objeto.getNomeCliente());
            pstmt.setString(3,objeto.getNomeCombustivel());
            pstmt.setDouble(4,objeto.getValor());
            //Executar 
            pstmt.execute();
            //Fechar a conexão
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha! O erro foi: "+e.getMessage());
        }
    }
    public DefaultTableModel listarClientes(){
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID");
            modelo.addColumn("Nome");
            modelo.addColumn("Combustivel");
            modelo.addColumn("Valor");
            
            String sql = "SELECT * FROM clientes";
            
            try {
                Statement stmt = conexao.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()) {                    
                    modelo.addRow(new Object[]{
                        rs.getInt("idCliente"),
                        rs.getString("nomeCliente"),
                        rs.getString("nomeCombustivel"),
                        rs.getDouble("valor")
                    });
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha!");
        }
          return modelo;  
        }
}
