
package view;

import controles.CadastrarFuncionarios;


public class TelaDemitirFuncionario extends javax.swing.JFrame {

    
    public TelaDemitirFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloNome = new javax.swing.JLabel();
        CampoDemitirNome = new javax.swing.JTextField();
        TituloLogin = new javax.swing.JLabel();
        CampoDemitirLogin = new javax.swing.JTextField();
        TituloSenha = new javax.swing.JLabel();
        CampoDemitirSenha = new javax.swing.JTextField();
        BotaoDemitir = new javax.swing.JButton();
        BotoaoVoltar = new javax.swing.JButton();
        LabelDemitir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demitir Funcionarios");
        setResizable(false);

        TituloNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TituloNome.setText("Nome");

        CampoDemitirNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDemitirNomeActionPerformed(evt);
            }
        });

        TituloLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TituloLogin.setText("Login");

        TituloSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TituloSenha.setText("Senha");

        CampoDemitirSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDemitirSenhaActionPerformed(evt);
            }
        });

        BotaoDemitir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoDemitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        BotaoDemitir.setText(" Demitir");
        BotaoDemitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDemitirActionPerformed(evt);
            }
        });

        BotoaoVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotoaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        BotoaoVoltar.setText("Voltar");
        BotoaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoaoVoltarActionPerformed(evt);
            }
        });

        LabelDemitir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelDemitir.setText("Demitir Funcionarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(BotaoDemitir)
                        .addGap(57, 57, 57)
                        .addComponent(BotoaoVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TituloNome)
                            .addComponent(TituloLogin)
                            .addComponent(TituloSenha))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoDemitirNome)
                            .addComponent(CampoDemitirLogin)
                            .addComponent(CampoDemitirSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelDemitir)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(LabelDemitir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloNome)
                    .addComponent(CampoDemitirNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloLogin)
                    .addComponent(CampoDemitirLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloSenha)
                    .addComponent(CampoDemitirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoDemitir)
                    .addComponent(BotoaoVoltar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDemitirNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDemitirNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDemitirNomeActionPerformed

    private void CampoDemitirSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDemitirSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDemitirSenhaActionPerformed

    private void BotaoDemitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDemitirActionPerformed
        
        //DemitirFuncionarios.demitirFuncionario(CampoDemitirNome, CampoDemitirLogin, CampoDemitirSenha);
        
        CampoDemitirLogin.setText("");
        CampoDemitirNome.setText("");
        CampoDemitirSenha.setText("");
        
    }//GEN-LAST:event_BotaoDemitirActionPerformed

    private void BotoaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoaoVoltarActionPerformed
        this.dispose();
        TelaGerente tela = new TelaGerente();
        tela.setVisible(true);
        
    }//GEN-LAST:event_BotoaoVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDemitirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDemitirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDemitirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDemitirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDemitirFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDemitir;
    private javax.swing.JButton BotoaoVoltar;
    private javax.swing.JTextField CampoDemitirLogin;
    private javax.swing.JTextField CampoDemitirNome;
    private javax.swing.JTextField CampoDemitirSenha;
    private javax.swing.JLabel LabelDemitir;
    private javax.swing.JLabel TituloLogin;
    private javax.swing.JLabel TituloNome;
    private javax.swing.JLabel TituloSenha;
    // End of variables declaration//GEN-END:variables
}
