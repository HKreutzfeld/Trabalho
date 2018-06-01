/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import javax.swing.table.DefaultTableModel;
import objetos.Listas;

/**
 *
 * @author 104935
 */
public class DefinePrecoCombustivel {
 
    
    public static void alteraPrecos(double valor1, double valor2, double valor3){
        Listas.valorGasolina = valor1;
        Listas.valorEtanol = valor2;
        Listas.valorDiesel = valor3;
    }
    
    public static void carregaPrecos(DefaultTableModel tabela){
        
        tabela.setValueAt(Listas.valorGasolina, 0, 1);
        tabela.setValueAt(Listas.valorEtanol, 1, 1);
        tabela.setValueAt(Listas.valorDiesel, 2, 1);
        tabela.setValueAt(Listas.valorGasolina, 0, 2);
        tabela.setValueAt(Listas.valorEtanol, 1, 2);
        tabela.setValueAt(Listas.valorDiesel, 2, 2);
        
    }
    
    
}
