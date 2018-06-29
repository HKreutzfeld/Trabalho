/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VendasBean;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 104935
 */
public class VendasDao {
    private Connection conexao;
    
    public VendasDao(){
        ConnectionFactory cf = new ConnectionFactory();
        this.conexao= cf.obterConexao();
    }
    public void RealizarVenda(VendasBean objeto){
        String sql = "INSER INTO vendas (litrosCombustivel,totalAPagar,tipoCombustivel,"
                + "marcaVeiculo, idFuncionario)";
        
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
             pstmt.setDouble(1,objeto.getLitrosCombustivel());
             pstmt.setDouble(2,objeto.getTotalAPagar());
             pstmt.setString(3,objeto.getTipoCombustivel());
             pstmt.setString(4,objeto.getMarcaVeiculo());
             pstmt.setInt(5,objeto.getIdFuncionario());
             
             pstmt.execute();
             
             pstmt.close();
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro "+e.getMessage());
        }       
    }
    public DefaultTableModel listarVendas(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Total combustivel vendido");
        modelo.addColumn("Total a pagar");
        modelo.addColumn("Tipo de combustivel");
        modelo.addColumn("Marca do veículo");
        modelo.addColumn("ID Funcionario");
        
        String sql = "SELECT * FROM vendas";
        
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                modelo.addRow(new Object[]{
                    rs.getDouble("litrosCombustivel"),
                    rs.getDouble("totalAPagar"),
                    rs.getString("tipoCombustivel"),
                    rs.getString("marcaVeiculo"),
                    rs.getInt("idFuncionario")
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro "+e.getMessage());
        }       
        return modelo;
    }
}
