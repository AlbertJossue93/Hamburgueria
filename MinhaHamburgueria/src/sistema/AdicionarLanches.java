
package sistema;
import sistema.ConexaoSQlite;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import sistema.Dao.CardapioDao;
import sistema.modelo.Cardapio;

public class AdicionarLanches extends javax.swing.JFrame {

     private TelaPrincipal telaprincipal;
   
    public AdicionarLanches(TelaPrincipal telaprincipal) {
        this.telaprincipal = telaprincipal;
        initComponents();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        TxtPreco = new javax.swing.JTextField();
        BtoAdicionar = new javax.swing.JButton();
        BtoCancelar = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 165, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Descriçao:");

        TxtDescricao.setColumns(20);
        TxtDescricao.setRows(5);
        jScrollPane1.setViewportView(TxtDescricao);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Valor :");

        BtoAdicionar.setBackground(new java.awt.Color(255, 165, 0));
        BtoAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icone_adicionar_preto.png"))); // NOI18N
        BtoAdicionar.setText("Adicionar");
        BtoAdicionar.setBorder(null);
        BtoAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoAdicionarActionPerformed(evt);
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

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Cadastrar Lanche");

        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Voltar.setBackground(new java.awt.Color(255, 165, 0));
        Voltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/voltar.png"))); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(null);
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TxtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TxtPreco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BtoAdicionar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BtoCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(BtoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(BtoAdicionar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 423, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtoCancelar)
                    .addComponent(BtoAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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

    private void BtoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoAdicionarActionPerformed
         try {
        String nome = TxtNome.getText();
        String descricao = TxtDescricao.getText(); // Captura o texto do JTextArea
        BigDecimal preco = new BigDecimal(TxtPreco.getText()); // Converte o preço para BigDecimal
        Cardapio cardapio = new Cardapio(nome, descricao, preco);
        
        
        ConexaoSQlite conex = new ConexaoSQlite();
      
        CardapioDao carda = new CardapioDao(conex.c);

        // Insere o objeto Cardapio no banco de dados
        String rs = carda.AddLanches(cardapio);
        
        
        if(rs.equals("Lanche cadastrado com sucesso")){
             JOptionPane.showMessageDialog(rootPane , "Lanche Cadastrado com Sucesso");
             telaprincipal.AtualizarCardapio();// atualiza a tela principal quando um lanche for cadastrado
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar Lanche!");
         }
      
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro inesperado, Tente mais Tarde");
             e.printStackTrace();
        }
    }//GEN-LAST:event_BtoAdicionarActionPerformed

    private void BtoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoCancelarActionPerformed
         TxtNome.setText("");
         TxtDescricao.setText("");
         TxtPreco.setText("");
    }//GEN-LAST:event_BtoCancelarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        TelaPrincipal Principal = new TelaPrincipal();
        Principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

 
    public static void main(String args[]) {
       

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarLanches(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoAdicionar;
    private javax.swing.JButton BtoCancelar;
    private javax.swing.JTextArea TxtDescricao;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtPreco;
    private javax.swing.JButton Voltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
