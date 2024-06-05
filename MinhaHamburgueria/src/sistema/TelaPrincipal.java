
package sistema;
import sistema.modelo.Cardapio;
import sistema.Dao.CardapioDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaPrincipal extends javax.swing.JFrame {

   
    public TelaPrincipal() {
        initComponents();
        CarregarDadosCardapio(); // definimos o metodo carregar dadsos do cardapio para inicizlizar
                                  // no construtor da tela principal
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotaodeSair = new javax.swing.JButton();
        BotonDeBebidas = new javax.swing.JButton();
        MenuTelaPrincipal = new javax.swing.JMenuBar();
        MenuPedido = new javax.swing.JMenu();
        GerenciarPed = new javax.swing.JMenuItem();
        MenuCardapio = new javax.swing.JMenu();
        GerenciarCardapio = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        GerenciarBebidas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 165, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cardapio"));
        jPanel1.setToolTipText("Cardapio");

        Jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_Item", "nome_item", "Descriçao", "preço"
            }
        ));
        jScrollPane1.setViewportView(Jtable1);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cardapio");

        BotaodeSair.setBackground(new java.awt.Color(255, 165, 0));
        BotaodeSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaodeSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/voltar.png"))); // NOI18N
        BotaodeSair.setText("Sair");
        BotaodeSair.setBorder(null);
        BotaodeSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaodeSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaodeSairActionPerformed(evt);
            }
        });

        BotonDeBebidas.setBackground(new java.awt.Color(255, 165, 0));
        BotonDeBebidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonDeBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/lata-de-refrigerante (3).png"))); // NOI18N
        BotonDeBebidas.setText("Bebidas");
        BotonDeBebidas.setBorder(null);
        BotonDeBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonDeBebidas.setMaximumSize(new java.awt.Dimension(121, 64));
        BotonDeBebidas.setMinimumSize(new java.awt.Dimension(121, 64));
        BotonDeBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeBebidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaodeSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 672, Short.MAX_VALUE)
                        .addComponent(BotonDeBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaodeSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonDeBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(87, Short.MAX_VALUE))))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cardapio");
        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);
        jLabel1.getAccessibleContext().setAccessibleName("");

        MenuTelaPrincipal.setBackground(new java.awt.Color(255, 204, 51));
        MenuTelaPrincipal.setFocusTraversalPolicyProvider(true);
        MenuTelaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuTelaPrincipal.setInheritsPopupMenu(true);

        MenuPedido.setText("Pedidos");

        GerenciarPed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GerenciarPed.setText("Adicionar pedido");
        GerenciarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarPedActionPerformed(evt);
            }
        });
        MenuPedido.add(GerenciarPed);

        MenuTelaPrincipal.add(MenuPedido);

        MenuCardapio.setText("Cardapio");

        GerenciarCardapio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GerenciarCardapio.setText("Gerenciar Cardapio");
        GerenciarCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarCardapioActionPerformed(evt);
            }
        });
        MenuCardapio.add(GerenciarCardapio);

        MenuTelaPrincipal.add(MenuCardapio);

        jMenu1.setText("Bebidas");

        GerenciarBebidas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GerenciarBebidas.setText("Gerenciar Bebidas");
        GerenciarBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarBebidasActionPerformed(evt);
            }
        });
        jMenu1.add(GerenciarBebidas);

        MenuTelaPrincipal.add(jMenu1);

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
        AdicionarLanches gerenciar = new AdicionarLanches(this);
        gerenciar.setVisible(true);
        this.dispose();
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

    private void GerenciarBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarBebidasActionPerformed
       AdicionarBebidas bebidas = new AdicionarBebidas();
       bebidas.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_GerenciarBebidasActionPerformed

    private void BotonDeBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeBebidasActionPerformed
        TelaDeBebidas tela = new TelaDeBebidas();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonDeBebidasActionPerformed

     // Método para carregar dados do cardápio
     private void CarregarDadosCardapio(){
        try{
            // Instancia o dao e chama o método para obter os dados do cardápio
            ConexaoSQlite conexao = new ConexaoSQlite();// chama a conexao do banco de dados
           CardapioDao cardapiodao = new CardapioDao(conexao.c); // conexao com a classe que interage com o banco
           List<Cardapio> cardapioLista = cardapiodao.CarregarDadosCardapio(); // chama a o metodo de carregar os dados do cardapio

            // obtem o modelo da tabela e limpa as linhas que estao existentes
            DefaultTableModel model = (DefaultTableModel) Jtable1.getModel(); // O jTable pega os dados cadastrados(nesse caso o cardapio)
            model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

            // Adiciona os dados recuperados na tabela
            for (Cardapio item : cardapioLista) {
                Object[] row = {
                    item.getId_item(),
                    item.getNome(),
                    item.getDescricao(),
                    item.getPreco()
                };
                model.addRow(row);
            }

          } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados do cardápio: " + e.getMessage());
            e.printStackTrace();
         }
        }
    
    public void AtualizarCardapio(){ // Metodo criado para atualizar os dados do cardapio 
       CarregarDadosCardapio();     // para quando for inserudos novos lanches no sistema.
     
    }
    
    
    
    
    
    
    
    public static void main(String args[]) {
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaodeSair;
    private javax.swing.JButton BotonDeBebidas;
    private javax.swing.JMenuItem GerenciarBebidas;
    private javax.swing.JMenuItem GerenciarCardapio;
    private javax.swing.JMenuItem GerenciarPed;
    private javax.swing.JTable Jtable1;
    private javax.swing.JMenu MenuCardapio;
    private javax.swing.JMenu MenuPedido;
    private javax.swing.JMenuBar MenuTelaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
