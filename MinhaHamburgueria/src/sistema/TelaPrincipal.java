
package sistema;


public class TelaPrincipal extends javax.swing.JFrame {

   
    public TelaPrincipal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCardapio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotaodeSair = new javax.swing.JButton();
        MenuTelaPrincipal = new javax.swing.JMenuBar();
        MenuPedido = new javax.swing.JMenu();
        GerenciarPed = new javax.swing.JMenuItem();
        MenuCardapio = new javax.swing.JMenu();
        GerenciarCardapio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 165, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cardapio"));
        jPanel1.setToolTipText("Cardapio");

        jCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Descriçao", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jCardapio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Cardapio");

        BotaodeSair.setBackground(new java.awt.Color(255, 165, 0));
        BotaodeSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaodeSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icone_sair_preto.png"))); // NOI18N
        BotaodeSair.setText("Sair");
        BotaodeSair.setBorder(null);
        BotaodeSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaodeSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotaodeSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaodeSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(91, Short.MAX_VALUE))))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cardapio");
        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);
        jLabel1.getAccessibleContext().setAccessibleName("");

        MenuTelaPrincipal.setBackground(new java.awt.Color(255, 204, 51));
        MenuTelaPrincipal.setFocusTraversalPolicyProvider(true);
        MenuTelaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuTelaPrincipal.setInheritsPopupMenu(true);

        MenuPedido.setText("Pedidos");

        GerenciarPed.setText("Adicionar pedido");
        GerenciarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarPedActionPerformed(evt);
            }
        });
        MenuPedido.add(GerenciarPed);

        MenuTelaPrincipal.add(MenuPedido);

        MenuCardapio.setText("Cardapio");

        GerenciarCardapio.setText("Gerenciar Cardapio");
        GerenciarCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarCardapioActionPerformed(evt);
            }
        });
        MenuCardapio.add(GerenciarCardapio);

        MenuTelaPrincipal.add(MenuCardapio);

        setJMenuBar(MenuTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GerenciarCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GerenciarCardapioActionPerformed

    private void BotaodeSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaodeSairActionPerformed
        LoginPrinci principal = new LoginPrinci();
        principal.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_BotaodeSairActionPerformed

    private void GerenciarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarPedActionPerformed
        AdicionarPed pedido = new AdicionarPed();
        pedido.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GerenciarPedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaodeSair;
    private javax.swing.JMenuItem GerenciarCardapio;
    private javax.swing.JMenuItem GerenciarPed;
    private javax.swing.JMenu MenuCardapio;
    private javax.swing.JMenu MenuPedido;
    private javax.swing.JMenuBar MenuTelaPrincipal;
    private javax.swing.JTable jCardapio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
