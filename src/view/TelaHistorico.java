
package view;


public class TelaHistorico extends javax.swing.JFrame {

   
    public TelaHistorico() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloTotalCarros = new javax.swing.JLabel();
        CampoTotalCarros = new javax.swing.JTextField();
        TtuloGasolinaVendida = new javax.swing.JLabel();
        CampoGasolinaVendida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        TituloLitrosDiesel = new javax.swing.JLabel();
        CampoLitrosDiesel = new javax.swing.JTextField();
        TituloValorTotal = new javax.swing.JLabel();
        CampoValorTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaMarcas = new javax.swing.JTable();
        BotaoMenu = new javax.swing.JToggleButton();
        jLabelPassagemDeCarros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Histórico");
        setResizable(false);

        TituloTotalCarros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TituloTotalCarros.setText("Total de carros abastecidos");

        CampoTotalCarros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TtuloGasolinaVendida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TtuloGasolinaVendida.setText("Litros de Gasolina vendido");

        CampoGasolinaVendida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoGasolinaVendidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Litros Etanol vendido");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        TituloLitrosDiesel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TituloLitrosDiesel.setText("Litros Diesel vendido");

        CampoLitrosDiesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoLitrosDieselActionPerformed(evt);
            }
        });

        TituloValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TituloValorTotal.setText("Valor total arecadado");

        TabelaMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CITROEN", null},
                {"FIAT", null},
                {"FORD", null},
                {"GM - CHEVROLET", null},
                {"HONDA", null},
                {"HYUNDAI", null},
                {"KIA", null},
                {"PEUGEUT", null},
                {"RENAUT", null},
                {"TOYOTA", null},
                {"VW - VOLKSWAGEN", null},
                {"OUTROS", null}
            },
            new String [] {
                "Marca", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaMarcas);

        BotaoMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        BotaoMenu.setText("voltar");
        BotaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenuActionPerformed(evt);
            }
        });

        jLabelPassagemDeCarros.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        jLabelPassagemDeCarros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car.png"))); // NOI18N
        jLabelPassagemDeCarros.setText("Passagem de carros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TituloTotalCarros)
                                    .addComponent(TituloValorTotal)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoGasolinaVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(TituloLitrosDiesel)
                                    .addComponent(CampoLitrosDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TtuloGasolinaVendida))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CampoTotalCarros)
                                        .addComponent(CampoValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPassagemDeCarros)
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(BotaoMenu)))
                .addGap(29, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloTotalCarros)
                    .addComponent(CampoTotalCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloValorTotal)
                    .addComponent(CampoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TtuloGasolinaVendida)
                    .addComponent(jLabelPassagemDeCarros))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoGasolinaVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TituloLitrosDiesel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoLitrosDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(BotaoMenu)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoGasolinaVendidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoGasolinaVendidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoGasolinaVendidaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CampoLitrosDieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoLitrosDieselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoLitrosDieselActionPerformed

    private void BotaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenuActionPerformed
        this.dispose();
        TelaGerente tela = new TelaGerente();
        tela.setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_BotaoMenuActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotaoMenu;
    private javax.swing.JTextField CampoGasolinaVendida;
    private javax.swing.JTextField CampoLitrosDiesel;
    private javax.swing.JTextField CampoTotalCarros;
    private javax.swing.JTextField CampoValorTotal;
    private javax.swing.JTable TabelaMarcas;
    private javax.swing.JLabel TituloLitrosDiesel;
    private javax.swing.JLabel TituloTotalCarros;
    private javax.swing.JLabel TituloValorTotal;
    private javax.swing.JLabel TtuloGasolinaVendida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPassagemDeCarros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
