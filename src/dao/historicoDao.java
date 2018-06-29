/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.HistoricoBean;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Henrique Kreutzfeld Marcondes Cezar
 */
public class historicoDao {
    private Connection conexao;
    
    public historicoDao(){
        ConnectionFactory cf = new ConnectionFactory();
        this.conexao = cf.obterConexao();
    }
    public void gerarHistorico(HistoricoBean objeto){
        String sql = "INSET INTO historico(totalDeCarrosAbastecidos,valorTotalArrecadado,totalLitrosGasolina,"
                + "totalLitrosEtanol,totalLitrosDiesel) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            pstmt.setInt(1,objeto.getTotalCarrosAbastecidos());
            pstmt.setDouble(2,objeto.getValorTotalArrecadado());
            pstmt.setDouble(3,objeto.getTotalLitrosGasolina());
            pstmt.setDouble(4,objeto.getTotalLitrosEtanol());
            pstmt.setDouble(5,objeto.getTotalLitrosDiesel());

            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! "+e.getMessage());
        }
    }
    public DefaultTableModel listarHistorico(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Total de carros abastecidos");
        modelo.addColumn("Valor total arrecadado");
        modelo.addColumn("Total litros Gasolina");
        modelo.addColumn("Total litros Etanol");
        modelo.addColumn("Total litros Diesel");
        
        String sql = "SELECT * FROM historico";
        
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("totalDeCarrosAbastecidos"),
                    rs.getDouble("valorTotalArrecadado"),
                    rs.getDouble("totalLitrosGasolina"),
                    rs.getDouble("totalLitrosEtanol"),
                    rs.getDouble("totalLitrosDiesel")
                });
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Falha" +e);
        }
    
        return modelo;
} 
}
