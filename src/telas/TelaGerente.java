
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
        BotaoaDemitir = new javax.swing.JButton();
        BotaoVoltar = new javax.swing.JToggleButton();
        labelBoss = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Gerente");
        setResizable(false);

        BotaoHistorico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money.png"))); // NOI18N
        BotaoHistorico.setText("Histórico");
        BotaoHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHistoricoActionPerformed(evt);
            }
        });

        BotaoAlterarValores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoAlterarValores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrows.png"))); // NOI18N
        BotaoAlterarValores.setText(" Alterar valores");
        BotaoAlterarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarValoresActionPerformed(evt);
            }
        });

        botaoCadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user-add.png"))); // NOI18N
        botaoCadastrarFuncionario.setText("Cadastrar funcionario");
        botaoCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFuncionarioActionPerformed(evt);
            }
        });

        BotaoaDemitir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoaDemitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        BotaoaDemitir.setText("Demitir funcionario");
        BotaoaDemitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoaDemitirActionPerformed(evt);
            }
        });

        BotaoVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        labelBoss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBoss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Boss.png"))); // NOI18N
        labelBoss.setText("Tela do Gerente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoaDemitir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoAlterarValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(labelBoss)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBoss)
                .addGap(18, 18, 18)
                .addComponent(BotaoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoAlterarValores, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoaDemitir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botaoCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFuncionarioActionPerformed
        this.dispose();
        TelaCadastrarFuncionario tela = new TelaCadastrarFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarFuncionarioActionPerformed

    private void BotaoaDemitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoaDemitirActionPerformed
        
        this.dispose();
        TelaDemitirFuncionario tela = new TelaDemitirFuncionario();
        tela.setVisible(true);
       String nome = "";
        for(Funcionario f : Listas.equipe){
            if(f.getNome().equals(nome)){
                Listas.equipe.remove(f);
                break;
            }
        }
        
    }//GEN-LAST:event_BotaoaDemitirActionPerformed

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
    private javax.swing.JButton BotaoaDemitir;
    private javax.swing.JButton botaoCadastrarFuncionario;
    private javax.swing.JLabel labelBoss;
    // End of variables declaration//GEN-END:variables
}
