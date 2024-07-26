package sistema;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.ConexaoSQlite;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import sistema.Dao.FuncionarioDao;
import sistema.modelo.Funcionario;

public class CadastroFunci extends javax.swing.JFrame {

   
    public CadastroFunci() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        BotaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtCep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtRua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 140, 0));

        BotaoCancelar.setBackground(new java.awt.Color(255, 140, 0));
        BotaoCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icone_fechar_preto.png"))); // NOI18N
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.setBorder(null);
        BotaoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(255, 140, 0));
        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/Icons/icone_adicionar_preto.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(null);
        botaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(248, 248, 255));

        jLabel1.setBackground(new java.awt.Color(255, 243, 224));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 32)); // NOI18N
        jLabel1.setText("   Cadastre - se");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDesktopPane2.setBackground(new java.awt.Color(248, 248, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome");

        TxtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Cpf");

        TxtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Email");

        TxtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Telefone");

        TxtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Cep");

        TxtCep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtCepKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Rua");

        TxtRua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Bairro");

        TxtBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("numero");

        TxtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Senha");

        TxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtCep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addGap(353, 481, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(BotaoCancelar))
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
           
        Funcionario funcionario = new Funcionario(
        TxtNome.getText(),
        TxtCpf.getText(),
        TxtEmail.getText(),
        TxtTelefone.getText(),
        TxtCep.getText(),
        TxtSenha.getText(),
        TxtRua.getText(),
        TxtBairro.getText(),
       Integer.parseInt(TxtNumero.getText()
              
        ));
        ConexaoSQlite conexao = new ConexaoSQlite();
        FuncionarioDao dao = new FuncionarioDao(conexao.c);
        CadastroFunci cadastro = new CadastroFunci();
        
        
       
        //Logica para interagir com o botao de salvar(algoritmo para o botao funcionar)
         try{ 
             String resposta = dao.cadastrarFuncionario(funcionario);
             if (resposta.equals("Ok")){
            JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso.");
            cadastro.dispose();
            LoginPrinci login = new LoginPrinci();
            login.setVisible(true);
            this.dispose();
         }else{
              JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar usuário: " + resposta);
          }
         }catch(Exception ex){
             
            JOptionPane.showMessageDialog(rootPane , "Ocorreu um erro inesperado.Por Favor Intente mais Tarde");
            ex.printStackTrace();
         }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        LoginPrinci principal = new LoginPrinci();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void TxtCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCepKeyReleased
       // Obtém o texto do campo TxtCep e remove todos os caracteres não numéricos
        String cep = TxtCep.getText().replaceAll("[^0-9]","");
        // Se o comprimento do CEP for maior que 5, insere um hífen na posição correta
        if(cep.length()>5){
            cep = cep.substring(0,5) + "-" + cep.substring(5);
        }
        // Atualiza o campo TxtCep com o CEP formatado
        TxtCep.setText(cep);
        
       // Se o comprimento do CEP (incluindo o hífen) for igual a 9, faz a consulta na API
         if (cep.length() == 9){
            try {
                 // Chama o método ApiEndereco passando o CEP sem o hífen
                ApiEndereco(cep.replace("-", ""));
            } catch (IOException ex) {// Registra uma exceção no log se ocorrer um erro de I/O
                Logger.getLogger(CadastroFunci.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_TxtCepKeyReleased
    
    // Metodo para Usar API de endereço do sistema de hamburgueria
    private void ApiEndereco(String cep) throws MalformedURLException, IOException{
         try{
            String aUrl = "https://viacep.com.br/ws/" + cep + "/json/"; // Monta a URL para a requisição à API do ViaCEP
            URL url = new URL(aUrl);
             
           // Abre a conexão com a URL
            URLConnection rq = url.openConnection();
            rq.connect();
            
            InputStream is = rq.getInputStream();   // Lê o conteúdo da resposta da API
            
             BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
             StringBuilder builder = new StringBuilder();  // Constrói uma string com o conteúdo lido da resposta da API
             String jso;
             
             while ((jso = rd.readLine())!= null){
                 builder.append(jso);
                 
             }
             rd.close();
             
             JSONObject jsonOb = new JSONObject(builder.toString());   // Converte a string de resposta para um objeto JSON

            TxtRua.setText(jsonOb.optString("logradouro"));    // Preenche os campos TxtRua e TxtBairro com os valores obtidos do JSON
            TxtBairro.setText(jsonOb.optString("bairro"));

        } catch (MalformedURLException ex) {   // Trata exceção de URL malformada
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JTextField TxtCep;
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtRua;
    private javax.swing.JTextField TxtSenha;
    private javax.swing.JTextField TxtTelefone;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

