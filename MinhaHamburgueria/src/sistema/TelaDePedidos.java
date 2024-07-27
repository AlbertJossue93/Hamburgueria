
package sistema;

//import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema.Dao.PedidoDao;
import sistema.modelo.Pedidos;


public class TelaDePedidos extends javax.swing.JFrame {

    
    public TelaDePedidos() {
        initComponents();
        PedidosDosClientes();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        BotaoDeVoltar = new javax.swing.JButton();
        FnzPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 165, 0));

        jDesktopPane2.setBackground(new java.awt.Color(248, 248, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Pedidos Dos Clientes");

        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Celular", "ID do Cardapio", "ID de Bebida", "Preço A Pagar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableClientes);

        BotaoDeVoltar.setBackground(new java.awt.Color(255, 165, 0));
        BotaoDeVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoDeVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/voltar.png"))); // NOI18N
        BotaoDeVoltar.setText("Voltar");
        BotaoDeVoltar.setBorder(null);
        BotaoDeVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoDeVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeVoltarActionPerformed(evt);
            }
        });

        FnzPedido.setBackground(new java.awt.Color(255, 165, 0));
        FnzPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FnzPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/verificar (1).png"))); // NOI18N
        FnzPedido.setText("Finalizar Pedido");
        FnzPedido.setBorder(null);
        FnzPedido.setContentAreaFilled(false);
        FnzPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FnzPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnzPedidoActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BotaoDeVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(FnzPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoDeVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FnzPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoDeVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FnzPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
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

    private void BotaoDeVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeVoltarActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoDeVoltarActionPerformed

    private void FnzPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnzPedidoActionPerformed
        
        // aqui crie uma variavel selectedRow que vai obter a linha selecionada da tabela
        int selectedRow = TableClientes.getSelectedRow();
        if(selectedRow != -1){ // verificar se alguma linha foi selecionada
            int idpedido = (int) TableClientes.getValueAt(selectedRow, 0); // aqui ele vai obter o ID do pedido da linha selecionada (coluna 0)
            
            ConexaoSQlite conexao = new ConexaoSQlite(); //  chama a conexao do banco
            PedidoDao dao = new PedidoDao(conexao.c); // Instancia o DAO de pedidos passando a conexão
             // Deleta o pedido no banco de dados com base no ID
            boolean isDeleted = dao.deletarPedido(idpedido);
            
            if(isDeleted){ // verifica se o pedido foi deletado com sucesso
                ((DefaultTableModel) TableClientes.getModel()).removeRow(selectedRow); //  principalmente ele remove a linha correspondente na tabela
                 JOptionPane.showMessageDialog(null, "Pedido finalizado e removido da tabela."); 
            }else{
                 JOptionPane.showMessageDialog(null, "Erro ao finalizar o pedido. Tente novamente.");
            }
        }else{
              JOptionPane.showMessageDialog(null, "Selecione um pedido para finalizar.");
        }
    }//GEN-LAST:event_FnzPedidoActionPerformed
    
    
    private void PedidosDosClientes(){
        
        try{
            
             ConexaoSQlite conexx = new ConexaoSQlite();
             PedidoDao dao = new PedidoDao(conexx.c);
             List<Pedidos> pedidos = dao.PedidosDosClientes();
             
               // obtem o modelo da tabela e limpa as linhas que estao existentes
            DefaultTableModel modelo = (DefaultTableModel) TableClientes.getModel(); // O jTable pega os dados cadastrados(nesse caso o cardapio)
            modelo.setRowCount(0); 
             
            for(Pedidos pe: pedidos){
                Object[] row = {
                    pe.getId_pedido(),
                    pe.getNome_cliente(),
                    pe.getCelular_cliente(),
                    pe.getItem_cardapio_id(),
                    pe.getBebida_id(),
                    pe.getPreco_total()
                };
                modelo.addRow(row);
                
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(this, "Erro ao carregar os dados de Pedidos: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(TelaDePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDePedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDeVoltar;
    private javax.swing.JButton FnzPedido;
    private javax.swing.JTable TableClientes;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
