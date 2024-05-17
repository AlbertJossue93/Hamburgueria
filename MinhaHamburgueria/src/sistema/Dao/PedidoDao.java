
package sistema.Dao;
import java.sql.PreparedStatement;
//import sistema.modelo.Funcionario;
import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
import sistema.modelo.Cliente;

public class PedidoDao {
    private Connection c;
    
    
    public PedidoDao(Connection c){
        this.c = c;
        
        
        
    }
    
    
    public String cadastrarCliente(Cliente client){
        String r = "";
        
         try {
            String sql = "INSERT INTO clientes( nome, cpf, telefone)\n " + 
                         "VALUES (?,?,?)";
           PreparedStatement st = this.c.prepareStatement(sql);
            st.setString(1, client.getNome());
            st.setString(2, client.getCpf());
            st.setString(3, client.getTelefone());
            st.executeUpdate();
            st.close();
            r = "yes";
        }catch(Exception e){
             r = "Erro ao cadastrar cliente e Item Selecionado: " + e.getMessage();
        }
            return r;      
          }
         
    }
    

