
package sistema;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import sistema.Dao.BebidasDao;
import sistema.modelo.Bebidas;


public class AdicionarBebidas extends javax.swing.JFrame {
     
    private TelaDeBebidas teladebebidas;
 
    public AdicionarBebidas(TelaDeBebidas teladebebidas) {
        this.teladebebidas = teladebebidas;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNomes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtValor = new javax.swing.JTextField();
        BtAdicionarBeb = new javax.swing.JButton();
        BtoCancelar = new javax.swing.JButton();
        BtoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 165, 0));

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Cadastrar Bebidas");

        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome :");

        TxtNomes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Valor :");

        TxtValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        BtAdicionarBeb.setBackground(new java.awt.Color(255, 165, 0));
        BtAdicionarBeb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtAdicionarBeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icone_adicionar_preto.png"))); // NOI18N
        BtAdicionarBeb.setText("Adicionar");
        BtAdicionarBeb.setBorder(null);
        BtAdicionarBeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtAdicionarBeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAdicionarBebActionPerformed(evt);
            }
        });

        BtoCancelar.setBackground(new java.awt.Color(255, 165, 0));
        BtoCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icone_fechar_preto.png"))); // NOI18N
        BtoCancelar.setText("Cancelar");
        BtoCancelar.setBorder(null);
        BtoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoCancelarActionPerformed(evt);
            }
        });

        BtoVoltar.setBackground(new java.awt.Color(255, 165, 0));
        BtoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/voltar.png"))); // NOI18N
        BtoVoltar.setText("Voltar");
        BtoVoltar.setBorder(null);
        BtoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoVoltarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TxtNomes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TxtValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BtAdicionarBeb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BtoCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BtoVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNomes, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(BtoCancelar)
                                .addGap(63, 63, 63)
                                .addComponent(BtAdicionarBeb))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtNomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtoCancelar)
                    .addComponent(BtAdicionarBeb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(BtoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoCancelarActionPerformed
        TxtNomes.setText("");
        TxtValor.setText("");
    }//GEN-LAST:event_BtoCancelarActionPerformed

    private void BtAdicionarBebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdicionarBebActionPerformed
          try{
            String nome = TxtNomes.getText();
            BigDecimal preco = new BigDecimal(TxtValor.getText());
            Bebidas bebida = new Bebidas(nome,preco);
            
             ConexaoSQlite cx = new ConexaoSQlite();
             
             BebidasDao dao = new BebidasDao(cx.c);
             
             String r = dao.AddBebidas(bebida);
             
             
             if(r.equals("Bebida cadastrada com sucesso")){
               JOptionPane.showMessageDialog(rootPane , "Bebida Cadastrada com Sucesso");
               if(teladebebidas != null){
                   
                teladebebidas.AtualizarBebidas();
               }
             }else{
               JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar Bebida!");
             }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro inesperado, Tente mais Tarde");
             e.printStackTrace();
        }
    }//GEN-LAST:event_BtAdicionarBebActionPerformed

    private void BtoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoVoltarActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtoVoltarActionPerformed


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
            java.util.logging.Logger.getLogger(AdicionarBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDeBebidas telaDeBebidas = new TelaDeBebidas();
                telaDeBebidas.setVisible(true);
                new AdicionarBebidas(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdicionarBeb;
    private javax.swing.JButton BtoCancelar;
    private javax.swing.JButton BtoVoltar;
    private javax.swing.JTextField TxtNomes;
    private javax.swing.JTextField TxtValor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
