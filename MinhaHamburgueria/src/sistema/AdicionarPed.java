
package sistema;

import java.math.BigDecimal;
import sistema.modelo.Bebidas;
import sistema.modelo.Cardapio;
import java.util.List;
import sistema.Dao.PedidoDao;
//import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sistema.modelo.Pedidos;


public class AdicionarPed extends javax.swing.JFrame {
     private List <Cardapio> lanches;
     private List <Bebidas> bebidas;
     private PedidoDao pedidodao;
   
    public AdicionarPed() {
        initComponents();
        CarregarLanchesEBebidas();
         ConexaoSQlite conex = new ConexaoSQlite();
         pedidodao = new PedidoDao(conex.c);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxLanche = new javax.swing.JComboBox<>();
        PrecoTotal = new javax.swing.JLabel();
        BotaoFinalizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Txtnome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Txtcelular = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxBebida = new javax.swing.JComboBox<>();
        BotaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 165, 0));

        jLabel1.setText("Realizar Pedido");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setText("Lanche");

        ComboBoxLanche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item 1", "item 2", "item 3" }));
        ComboBoxLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxLancheActionPerformed(evt);
            }
        });

        PrecoTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrecoTotal.setText("Total a Pagar: R$ 0,00");

        BotaoFinalizar.setBackground(new java.awt.Color(255, 165, 0));
        BotaoFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icone_adicionar_preto.png"))); // NOI18N
        BotaoFinalizar.setText("Adicionar");
        BotaoFinalizar.setBorder(null);
        BotaoFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalizarActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome :");

        Txtnome.setToolTipText("");

        jLabel7.setText("Celular:");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel5.setText("Bebida");

        ComboBoxBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item 1", "item 2", "item 3" }));
        ComboBoxBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxBebidaActionPerformed(evt);
            }
        });

        BotaoCancelar.setBackground(new java.awt.Color(255, 165, 0));
        BotaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icone_fechar_preto.png"))); // NOI18N
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.setBorder(null);
        BotaoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ComboBoxLanche, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PrecoTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BotaoFinalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Txtnome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Txtcelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ComboBoxBebida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BotaoCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(Txtcelular)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)
                                .addComponent(jLabel5))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(ComboBoxLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(ComboBoxBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(304, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(BotaoCancelar)
                .addGap(74, 74, 74)
                .addComponent(BotaoFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(PrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComboBoxLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(PrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCancelar))
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void BotaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarActionPerformed
        try {
        // Obtendo os valores dos campos de texto
        String nomeCliente = Txtnome.getText();
        String celularCliente = Txtcelular.getText();
        
        // Obtendo os itens selecionados nos ComboBox
        String lancheSelecionado = (String) ComboBoxLanche.getSelectedItem();
        String bebidaSelecionada = (String) ComboBoxBebida.getSelectedItem();
        
        // Verificando se algum campo está vazio
        if(nomeCliente.isEmpty() || celularCliente.isEmpty() || lancheSelecionado == null || bebidaSelecionada == null) {
            JOptionPane.showMessageDialog(this , "Por Favor preencha todos os campos!");
            return;
        }
        
        // Convertendo  itens selecionados para inteiros
        int lancheId = Integer.parseInt(lancheSelecionado);  // Mudança: Agora pegamos diretamente o ID
        int bebidaId = Integer.parseInt(bebidaSelecionada);  // Mudança: Agora pegamos diretamente o ID

        // Obtendo os preços dos itens selecionados
        BigDecimal precoLanche = lanches.stream()
            .filter(l -> l.getId_item() == lancheId)
            .findFirst()
            .get()
            .getPreco();
        
        BigDecimal precoBebida = bebidas.stream()
            .filter(b -> b.getId_bebida() == bebidaId)
            .findFirst()
            .get()
            .getPreco();

        // Calculando o preço total
        BigDecimal precoTotal = precoLanche.add(precoBebida);
        
        // Criando um novo pedido
        Pedidos pedido = new Pedidos(nomeCliente, celularCliente, lancheId, bebidaId, precoTotal);
         
         
        
        // Adicionando o pedido ao banco de dados
        String resultado = pedidodao.adicionarPedido(pedido);

        // Mostrando mensagem de sucesso
        JOptionPane.showMessageDialog(this, resultado);
        
        // Abrindo a tela principal e fechando a tela atual
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
        
    } catch (Exception e) {
        // Mostrando mensagem de erro em caso de alguma exceção
        JOptionPane.showMessageDialog(this, "Erro ao finalizar o pedido: " + e.getMessage());
        e.printStackTrace();
      }
    }//GEN-LAST:event_BotaoFinalizarActionPerformed
     // Metodo para carregar os lanches e as bebidas obs: so Carregar os Id de cada um
    private void CarregarLanchesEBebidas(){
       try {
            ConexaoSQlite conexa = new ConexaoSQlite();
            PedidoDao pedidoDao = new PedidoDao(conexa.c);

            lanches = pedidoDao.obterLanches();
            bebidas = pedidoDao.obterBebidas();

            ComboBoxLanche.removeAllItems();
            for (Cardapio lanche : lanches) {
                ComboBoxLanche.addItem(String.valueOf(lanche.getId_item()));
            }

            ComboBoxBebida.removeAllItems();
            for (Bebidas bebida : bebidas) {
                ComboBoxBebida.addItem(String.valueOf(bebida.getId_bebida()));
            }

            calcularPrecoTotal();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar os lanches e bebidas: " + e.getMessage());
            e.printStackTrace();
        }
        
    }
    
    // Metodo para calcular os precos do lanche e as bebidas
    private void calcularPrecoTotal(){
        try {
            String selectedLancheId = (String) ComboBoxLanche.getSelectedItem();
            String selectedBebidaId = (String) ComboBoxBebida.getSelectedItem();

            BigDecimal precoLanche = BigDecimal.ZERO;
            BigDecimal precoBebida = BigDecimal.ZERO;

            for (Cardapio lanche : lanches) {
                if (String.valueOf(lanche.getId_item()).equals(selectedLancheId)) {
                    precoLanche = lanche.getPreco();
                    break;
                }
            }

            for (Bebidas bebida : bebidas) {
                if (String.valueOf(bebida.getId_bebida()).equals(selectedBebidaId)) {
                    precoBebida = bebida.getPreco();
                    break;
                }
            }

            BigDecimal precoTotal = precoLanche.add(precoBebida);
            PrecoTotal.setText("Total a Pagar: R$ " + precoTotal.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao calcular preço total: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void ComboBoxLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxLancheActionPerformed
        calcularPrecoTotal();
    }//GEN-LAST:event_ComboBoxLancheActionPerformed

    private void ComboBoxBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxBebidaActionPerformed
        calcularPrecoTotal();
    }//GEN-LAST:event_ComboBoxBebidaActionPerformed
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoFinalizar;
    private javax.swing.JComboBox<String> ComboBoxBebida;
    private javax.swing.JComboBox<String> ComboBoxLanche;
    private javax.swing.JLabel PrecoTotal;
    private javax.swing.JTextField Txtcelular;
    private javax.swing.JTextField Txtnome;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
