
package sistema;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import sistema.Dao.FuncionarioDao;
public class LoginPrinci extends javax.swing.JFrame {

    
    public LoginPrinci() {
        initComponents();
         
        
        // Configura o evento de clique do mouse para o JLabel "olho"
        OlhoVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OlhoVisibleMouseClicked(evt); // Chama o método que você definiu para lidar com o clique do mouse
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Senhapass = new javax.swing.JPasswordField();
        separador1 = new javax.swing.JSeparator();
        UsuarioLogi = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OlhoVisible = new javax.swing.JLabel();
        BotaoLogi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BotaoCadastroFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/LOGO HAMBURGUERIA.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 140, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Senhapass.setBackground(new java.awt.Color(255, 140, 0));
        Senhapass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Senhapass.setText("password");
        Senhapass.setToolTipText("");
        Senhapass.setBorder(null);
        Senhapass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhapassActionPerformed(evt);
            }
        });

        separador1.setBackground(new java.awt.Color(255, 255, 255));
        separador1.setForeground(new java.awt.Color(255, 255, 255));

        UsuarioLogi.setBackground(new java.awt.Color(255, 140, 0));
        UsuarioLogi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UsuarioLogi.setText("Username");
        UsuarioLogi.setBorder(null);
        UsuarioLogi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioLogiActionPerformed(evt);
            }
        });

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icons8_user_20px_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel2.setText("Login");

        OlhoVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icons8_invisible_20px_1.png"))); // NOI18N
        OlhoVisible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OlhoVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OlhoVisibleMouseClicked(evt);
            }
        });

        BotaoLogi.setBackground(new java.awt.Color(248, 248, 255));
        BotaoLogi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotaoLogi.setText("Login In");
        BotaoLogi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoLogi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogiActionPerformed(evt);
            }
        });

        jLabel4.setText("                 crie a sua conta.");

        BotaoCadastroFunc.setBackground(new java.awt.Color(248, 248, 255));
        BotaoCadastroFunc.setText("Sign Up");
        BotaoCadastroFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoCadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OlhoVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Senhapass, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(BotaoCadastroFunc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(BotaoLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(UsuarioLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Senhapass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OlhoVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoCadastroFunc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioLogiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioLogiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioLogiActionPerformed

    private void SenhapassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhapassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhapassActionPerformed

    private void BotaoLogiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogiActionPerformed
        String nomeOuEmail = UsuarioLogi.getText();
        // Obtém a senha como um array de caracteres a partir do campo de senha (JPasswordField)
        char [] senhaChar  = Senhapass.getPassword();
        // Converte o array de caracteres em uma string
        String senha = new String (senhaChar);
                                      // O array de caracteres é usado para armazenar a senha de forma segura, pois pode ser sobrescrito ou removido após o uso
                                      // Isso ajuda a proteger a senha contra acesso não autorizado
                                      // A conversão para uma string é necessária para usar a senha em métodos que esperam uma string como entrada
                                      // Por exemplo, o método verificarCredenciais espera uma string como senha, não um array de caracteres
       
        ConexaoSQlite conexao = new ConexaoSQlite();
        FuncionarioDao funcionariodao = new FuncionarioDao(conexao.c);
        
        if(funcionariodao.verificarCredenciais(nomeOuEmail, senha)){
          TelaPrincipal tela = new TelaPrincipal();
          tela.setVisible(true);
          this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Nome de usuario ou email ou senhas incorreto.");
        }
        
    }//GEN-LAST:event_BotaoLogiActionPerformed

    private void BotaoCadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroFuncActionPerformed
        CadastroFunci cd = new CadastroFunci();
        cd.setVisible(true);
        this.dispose(); // Fechar a tela de login
     
    }//GEN-LAST:event_BotaoCadastroFuncActionPerformed
    private boolean senhaVisivel = true ; // Variável para controlar a visibilidade da senha
    private void OlhoVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlhoVisibleMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) { // Verifica se foi clicado com o botão esquerdo do mouse
        senhaVisivel = !senhaVisivel; // Inverte o estado da visibilidade da senha primeiro

        if (senhaVisivel) {
            // Se a senha estiver oculta, torna visível
            Senhapass.setEchoChar((char) 0);
            // Altera o ícone para o olho visível
            OlhoVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icons8_eye_20px_1.png")));
        } else {
            // Se a senha estiver visível, torna oculta
            Senhapass.setEchoChar('\u2022'); // Caractere de senha (círculo)
            // Altera o ícone para o olho oculto
            OlhoVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icons8_invisible_20px_1.png")));
        } 
        OlhoVisible.repaint();
        OlhoVisible.revalidate();

        System.out.println("OlhoVisibleMouseClicked chamado! Senha visível: " + senhaVisivel);
    }
        
      
    }//GEN-LAST:event_OlhoVisibleMouseClicked

   
    public static void main(String args[]) {
        ConexaoSQlite conexao = new ConexaoSQlite();
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginPrinci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastroFunc;
    private javax.swing.JButton BotaoLogi;
    private javax.swing.JLabel OlhoVisible;
    private javax.swing.JPasswordField Senhapass;
    private javax.swing.JTextField UsuarioLogi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador1;
    // End of variables declaration//GEN-END:variables
}
