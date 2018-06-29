
package view;


public class TelaFuncionario extends javax.swing.JFrame {

    public TelaFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoLitrosCombustivel = new javax.swing.JTextField();
        TipoCombustivel = new javax.swing.JComboBox<>();
        CampoTotalAPagar = new javax.swing.JFormattedTextField();
        BotaoCalcular = new javax.swing.JToggleButton();
        TiuloLitrosCombustivel = new javax.swing.JLabel();
        TituloTotalAPagar = new javax.swing.JLabel();
        Veiculo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotaoTrocarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela do Funcionario");
        setResizable(false);

        CampoLitrosCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoLitrosCombustivelActionPerformed(evt);
            }
        });

        TipoCombustivel.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        TipoCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Etanol", "Diesel" }));
        TipoCombustivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoCombustivelItemStateChanged(evt);
            }
        });
        TipoCombustivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TipoCombustivelMouseClicked(evt);
            }
        });
        TipoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoCombustivelActionPerformed(evt);
            }
        });

        CampoTotalAPagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        CampoTotalAPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTotalAPagarActionPerformed(evt);
            }
        });

        BotaoCalcular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculator.png"))); // NOI18N
        BotaoCalcular.setText("Calcular");
        BotaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCalcularActionPerformed(evt);
            }
        });

        TiuloLitrosCombustivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TiuloLitrosCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fuel.png"))); // NOI18N
        TiuloLitrosCombustivel.setText("Litros de combustível");

        TituloTotalAPagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TituloTotalAPagar.setText("Total a pagar");

        Veiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CITROEN", "FIAT", "FORD", "GM - CHEVROLET", "HONDA ", "HYUNDAI", "KIA", "NISSAN", "PEUGEOT", "RENAUT", "TOYOTA ", "VW - VOLKSWAGEN", "OUTROS" }));
        Veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiculoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gasoline.png"))); // NOI18N
        jLabel1.setText("Combustível");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car.png"))); // NOI18N
        jLabel2.setText("Veículo");

        BotaoTrocarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peopleChange.png"))); // NOI18N
        BotaoTrocarUsuario.setText("Mudar usuario ");
        BotaoTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTrocarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51)
                                .addComponent(Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(TiuloLitrosCombustivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CampoLitrosCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(TipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(BotaoCalcular))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(TituloTotalAPagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CampoTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(BotaoTrocarUsuario)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TiuloLitrosCombustivel)
                    .addComponent(CampoLitrosCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(BotaoCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloTotalAPagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(BotaoTrocarUsuario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoLitrosCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoLitrosCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoLitrosCombustivelActionPerformed

    private void CampoTotalAPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTotalAPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTotalAPagarActionPerformed

    private void BotaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCalcularActionPerformed

    private void TipoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoCombustivelActionPerformed
        TipoCombustivel.removeAllItems();
        TipoCombustivel.addItem("Gasolina");
        TipoCombustivel.addItem("Etanol");
        TipoCombustivel.addItem("Diesel");
    }//GEN-LAST:event_TipoCombustivelActionPerformed

    private void VeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiculoActionPerformed
        /*
        CITROEN
        FIAT
        FORD
        GM - CHEVROLET
        HONDA 
        HYUNDAI
        KIA
        NISSAN
        PEUGEOT
        RENAUT
        TOYOTA 
        VW - VOLKSWAGEN
        OUTROS

            */
        
        Veiculo.addItem("Chevrolet");
        //Veiculo.addItem("Fiat");
    }//GEN-LAST:event_VeiculoActionPerformed

    private void TipoCombustivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipoCombustivelMouseClicked
        
    }//GEN-LAST:event_TipoCombustivelMouseClicked

    private void TipoCombustivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoCombustivelItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoCombustivelItemStateChanged

    private void BotaoTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTrocarUsuarioActionPerformed
        this.dispose();
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
    }//GEN-LAST:event_BotaoTrocarUsuarioActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotaoCalcular;
    private javax.swing.JButton BotaoTrocarUsuario;
    private javax.swing.JTextField CampoLitrosCombustivel;
    private javax.swing.JFormattedTextField CampoTotalAPagar;
    private javax.swing.JComboBox<String> TipoCombustivel;
    private javax.swing.JLabel TituloTotalAPagar;
    private javax.swing.JLabel TiuloLitrosCombustivel;
    private javax.swing.JComboBox<String> Veiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
