
package controles;

import javax.swing.JOptionPane;
import objetos.Funcionario;
import objetos.Listas;


public class DemitirFuncionario {
    
    public static boolean demitirFuncionario(String funcionario){
            for(Funcionario cadastrado : Listas.equipe){
                if(cadastrado.getNome().equals(funcionario)){
                    Listas.equipe.remove(cadastrado);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Funcionario demitido");
        return false;
    
}
  
}
     
    
    

    