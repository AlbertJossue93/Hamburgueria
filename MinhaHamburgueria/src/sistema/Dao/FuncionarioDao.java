
package sistema.Dao;

import java.sql.PreparedStatement;
import sistema.modelo.Funcionario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class FuncionarioDao {
    private Connection c;

    public FuncionarioDao(Connection c) {
        this.c = c;
  
    }
    
    
      public String cadastrarFuncionario(Funcionario func){
        String resposta = "";
         try{
             
           String sql = "INSERT INTO funcionario(nome , cpf, email, telefone, cep, senha, rua, bairro, numero)\n" +
                         "VALUES (?,?,?,?,?,?,?,?,?)";
           PreparedStatement stm = this.c.prepareStatement(sql);
           stm.setString(1, func.getNome());
           stm.setString(2, func.getCpf());
           stm.setString(3, func.getEmail());
           stm.setString(4, func.getTelefone());
           stm.setString(5, func.getCep());
           stm.setString(6, func.getSenha());
           stm.setString(7, func.getRua());
           stm.setString(8,func.getBairro());
           stm.setInt(9, func.getNumero());
            
            stm.executeUpdate();
            stm.close();
            resposta = "Ok";
        }catch(Exception e){
             resposta = "Erro ao cadastrar funcionário: " + e.getMessage();
        }
          return resposta;      
    }
     // Método para verificar as credenciais do funcionário ao fazer login
    public boolean verificarCredenciais(String nomeOuEmail, String senha) {
    boolean autenticado = false;
    String sql = "SELECT COUNT(*) FROM funcionario WHERE (nome = ? OR email = ?) AND senha = ?";
    PreparedStatement stm = null;
    ResultSet rs = null;
    try {
        stm = c.prepareStatement(sql);
        stm.setString(1, nomeOuEmail);
        stm.setString(2, nomeOuEmail);
        stm.setString(3, senha);
        
        rs = stm.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            autenticado = count > 0;
        }
    } catch(SQLException e) {
        e.printStackTrace(); // Imprime o erro no console, caso ocorra uma excecao...
    } finally {
        try {
            if (rs != null) {
                rs.close(); // Fecha o ResultSet para liberar memoria...
            }
            if (stm != null) {
                stm.close(); // Fecha o PreparedStatement para liberar memoria...
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime o erro no console, caso ocorra uma exceçao ao fechar o PreparedStatement...
        }
    }
    
    // Se as credenciais não forem válidas, exibe uma mensagem de erro....
    if (!autenticado) {
        JOptionPane.showMessageDialog(null, "Nome de usuário, email ou senha incorretos.", "Erro de Autenticação", JOptionPane.ERROR_MESSAGE);
    }
    
    return autenticado; // Retorna se as credenciais foram autenticadas com sucesso ou nao.....
        
         
//  
   }
    public Funcionario buscarFuncionario(String nomeOuEmail) {
    Funcionario func = null;
    String sql = "SELECT * FROM funcionario WHERE nome = ? OR email = ?";
    PreparedStatement stm = null;
    ResultSet rs = null;

    try {
        stm = c.prepareStatement(sql);
        stm.setString(1, nomeOuEmail);
        stm.setString(2, nomeOuEmail);
        rs = stm.executeQuery();

        if (rs.next()) {
            func = new Funcionario(
                rs.getInt("id_funcionario"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getString("email"),
                rs.getString("telefone"),
                rs.getString("cep"),
                rs.getString("senha"),
                rs.getString("rua"),
                rs.getString("bairro"),
                rs.getInt("numero")
            );
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (stm != null) stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return func;

    }
}
