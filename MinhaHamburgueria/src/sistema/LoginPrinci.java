
package sistema;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import sistema.Dao.FuncionarioDao;
public class LoginPrinci extends javax.swing.JFrame {

    
    public LoginPrinci() {
        initComponents();
        
        
        // Configura o evento de clique do mouse para o JLabel "olho"
        OlhoVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OlhoVisibleMouseClicked(evt);
               // Chama o método que você definiu para lidar com o clique do mouse
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
        Senhapass.setText("Digite sua Senha");
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
        UsuarioLogi.setText("Usuario Ou Email");
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OlhoVisibleMousePressed(evt);
            }
        });

        BotaoLogi.setBackground(new java.awt.Color(248, 248, 255));
        BotaoLogi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        BotaoLogi.setText("ENTRAR");
        BotaoLogi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        BotaoLogi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoLogi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("              Crie a sua conta");

        BotaoCadastroFunc.setBackground(new java.awt.Color(255, 255, 224));
        BotaoCadastroFunc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoCadastroFunc.setText("Cadastre -se ");
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OlhoVisible)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Senhapass, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(BotaoCadastroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UsuarioLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OlhoVisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Senhapass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoCadastroFunc)
                .addContainerGap(117, Short.MAX_VALUE))
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
     // Variável para controlar a visibilidade da senha
    
    private void OlhoVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlhoVisibleMouseClicked
         
        
      
    }//GEN-LAST:event_OlhoVisibleMouseClicked
    
    
    private boolean senhaVisivel = true ;
    
    private void OlhoVisibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlhoVisibleMousePressed
         if (evt.getButton() == MouseEvent.BUTTON1) { // Verifica se foi clicado com o botão esquerdo do mouse
        
        // Se a senha está visível, torná-la oculta
        if (senhaVisivel) {
            Senhapass.setEchoChar('\u2022'); // Caractere de senha (círculo)
            OlhoVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icons8_invisible_20px_1.png")));
            System.out.println("Senha oculta");
            senhaVisivel = false; // Atualiza a variável para refletir o novo estado
             
        } else{
            Senhapass.setEchoChar((char) 0);
             OlhoVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icons8_eye_20px_1.png")));
            System.out.println("Senha visível");
            senhaVisivel = true; 
        }
        
        // Se a senha está oculta, torná-la visível
        OlhoVisible.revalidate();
        OlhoVisible.repaint();
       

    }
    }//GEN-LAST:event_OlhoVisibleMousePressed

   
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
