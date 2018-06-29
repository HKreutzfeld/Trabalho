
package view;

import controles.Login;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {

    
    public TelaLogin() {
        initComponents();
        botaoEntrar.requestFocus();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoSenha = new javax.swing.JPasswordField();
        campoUsuario = new javax.swing.JTextField();
        botaoEntrar = new javax.swing.JButton();
        TituloUsuario = new javax.swing.JLabel();
        TtuloSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 153));
        setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        setResizable(false);

        campoSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoSenhaFocusLost(evt);
            }
        });
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        campoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoUsuarioFocusLost(evt);
            }
        });
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });

        botaoEntrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrowsRechts.png"))); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        TituloUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TituloUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/person.png"))); // NOI18N
        TituloUsuario.setText(" Usuario");

        TtuloSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TtuloSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/password.png"))); // NOI18N
        TtuloSenha.setText("   Senha");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/GasolinePost.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(160, Short.MAX_VALUE)
                        .addComponent(botaoEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TituloUsuario)
                                    .addComponent(TtuloSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(campoUsuario)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TtuloSenha)
                .addGap(12, 12, 12)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        
        
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        if(Login.autenticaUsuario(campoUsuario, campoSenha).equals("ERRO")){
            JOptionPane.showMessageDialog(null, "Usuário ou senha em branco.");
        }else if(Login.autenticaUsuario(campoUsuario, campoSenha).equals("GERENTE")){
            this.dispose();
            TelaGerente tela = new TelaGerente();
            tela.setVisible(true);
        }else if(Login.autenticaUsuario(campoUsuario, campoSenha).equals("FUNCIONARIO")){
            this.dispose();
            TelaFuncionario tela = new TelaFuncionario();
            tela.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
        }
        
        
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void campoUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoUsuarioFocusGained
        campoUsuario.setText("");
    }//GEN-LAST:event_campoUsuarioFocusGained

    private void campoUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoUsuarioFocusLost
        if(campoUsuario.getText().trim().equals("")){
            campoUsuario.setText("Usuário");
        }
            
    }//GEN-LAST:event_campoUsuarioFocusLost

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        
        
        
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusGained
        campoSenha.setText("");
    }//GEN-LAST:event_campoSenhaFocusGained

    private void campoSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusLost
        String s =  campoSenha.getPassword().toString();
        System.out.println(s);
        if(campoSenha.getPassword().toString().equals("")){
            String senha = "password";
            campoSenha.setText(senha);
        }
    }//GEN-LAST:event_campoSenhaFocusLost

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloUsuario;
    private javax.swing.JLabel TtuloSenha;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
