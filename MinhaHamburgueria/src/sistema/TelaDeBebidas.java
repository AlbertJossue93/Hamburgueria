
package sistema;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema.Dao.BebidasDao;
import sistema.modelo.Bebidas;


public class TelaDeBebidas extends javax.swing.JFrame {

   
    public TelaDeBebidas() {
        initComponents();
        CarregarDadosBebidas(); // Mesmo metodo de carregarDados Cardapio com mesma logica
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBebidas = new javax.swing.JTable();
        BotoVoltar = new javax.swing.JButton();
        BebidaExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 165, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Bebidas");

        TableBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N°", "Nome", "Preço"
            }
        ));
        jScrollPane1.setViewportView(TableBebidas);

        BotoVoltar.setBackground(new java.awt.Color(255, 165, 0));
        BotoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/voltar.png"))); // NOI18N
        BotoVoltar.setText("Voltar");
        BotoVoltar.setBorder(null);
        BotoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoVoltarActionPerformed(evt);
            }
        });

        BebidaExcluir.setBackground(new java.awt.Color(255, 165, 0));
        BebidaExcluir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        BebidaExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/trash.png"))); // NOI18N
        BebidaExcluir.setText("Excluir ");
        BebidaExcluir.setBorder(null);
        BebidaExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BebidaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BebidaExcluirActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BotoVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BebidaExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel1)))
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BotoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BebidaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotoVoltar)
                    .addComponent(BebidaExcluir))
                .addGap(34, 34, 34))
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

    private void BotoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoVoltarActionPerformed
       TelaPrincipal pr = new TelaPrincipal();
       pr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotoVoltarActionPerformed

    private void BebidaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BebidaExcluirActionPerformed
          try{
           
        int selectedrow = TableBebidas.getSelectedRow();
        
        if(selectedrow != 1){
            int id_bebida = (int)TableBebidas.getValueAt(selectedrow, 0);
            ConexaoSQlite conexao = new ConexaoSQlite(); 
            
            BebidasDao dao = new BebidasDao (conexao.c);
            
            boolean excluir = dao.ExcluirBebida(id_bebida);
            
            if(excluir){
               ((DefaultTableModel) TableBebidas.getModel()).removeRow(selectedrow); //  principalmente ele remove a linha correspondente na tabela
               JOptionPane.showMessageDialog(null, "Bebida Exluida com sucesso"); 
            }else{
               JOptionPane.showMessageDialog(null, "Erro ao excluir uma Bebida");
            }
        }else{
            JOptionPane.showMessageDialog(null, "selecione um bebida para excluir");
        }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir uma Bebida " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_BebidaExcluirActionPerformed

     private void CarregarDadosBebidas(){
          try{
            // Instancia o dao e chama o método para obter os dados do cardápio
            ConexaoSQlite conexx = new ConexaoSQlite();// chama a conexao do banco de dados
           BebidasDao bebidas = new BebidasDao (conexx.c); // conexao com a classe que interage com o banco
           List<Bebidas> BebidasLista = bebidas.CarregarDadosBebidas(); // chama a o metodo de carregar os dados das bebidas

            // obtem o modelo da tabela e limpa as linhas que estao existentes
            DefaultTableModel modelo = (DefaultTableModel) TableBebidas.getModel(); // O jTable pega os dados cadastrados(nesse caso o cardapio)
            modelo.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

            // Adiciona os dados recuperados na tabela
            for (Bebidas be : BebidasLista) {
                Object[] row = {
                    be.getId_bebida(),
                    be.getNome(),
                    be.getPreco()
                };
                modelo.addRow(row);
            }

          } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados das bebidas: " + e.getMessage());
            e.printStackTrace();
         }
     }
     public void AtualizarBebidas(){ // Metodo criado para atualizar os dados das bebidas 
       CarregarDadosBebidas();     // para quando for inseridos novas bebidas no sistema.
     
    }
    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeBebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BebidaExcluir;
    private javax.swing.JButton BotoVoltar;
    private javax.swing.JTable TableBebidas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
