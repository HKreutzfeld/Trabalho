
package telas;

import javax.swing.JOptionPane;
import objetos.Funcionario;
import objetos.Listas;

public class TelaGerente extends javax.swing.JFrame {

    
    public TelaGerente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoHistorico = new javax.swing.JButton();
        BotaoAlterarValores = new javax.swing.JButton();
        botaoCadastrarFuncionario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BotaoVoltar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoHistorico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoHistorico.setText("Histórico");
        BotaoHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHistoricoActionPerformed(evt);
            }
        });

        BotaoAlterarValores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoAlterarValores.setText("Alterar valores");
        BotaoAlterarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarValoresActionPerformed(evt);
            }
        });

        botaoCadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoCadastrarFuncionario.setText("Cadastrar funcionario");
        botaoCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFuncionarioActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Demitir funcionario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BotaoVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BotaoHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoAlterarValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(BotaoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoAlterarValores, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botaoCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFuncionarioActionPerformed
        this.dispose();
        TelaCadastrarFuncionario tela = new TelaCadastrarFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarFuncionarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String nome = "";
        for(Funcionario f : Listas.equipe){
            if(f.getNome().equals(nome)){
                Listas.equipe.remove(f);
                break;
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotaoHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHistoricoActionPerformed
    if(Listas.historicoVendas.isEmpty()){
        JOptionPane.showMessageDialog(null, "Nenhum carro abastecido");
    }else{
        this.dispose();
        TelaHistorico tela = new TelaHistorico();
        tela.setVisible(true);
    }
    }//GEN-LAST:event_BotaoHistoricoActionPerformed

    private void BotaoAlterarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarValoresActionPerformed
        this.dispose();
        TelaAlterarValor tela = new TelaAlterarValor();
        tela.setVisible(true);
        
    }//GEN-LAST:event_BotaoAlterarValoresActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        this.dispose();
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
    }//GEN-LAST:event_BotaoVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterarValores;
    private javax.swing.JButton BotaoHistorico;
    private javax.swing.JToggleButton BotaoVoltar;
    private javax.swing.JButton botaoCadastrarFuncionario;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
