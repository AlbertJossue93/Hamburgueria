
package sistema.Dao;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import sistema.modelo.Cardapio;

public class CardapioDao {
     private Connection c;

    public CardapioDao(Connection c) {
        this.c = c;
  
      }
    
     public String AddLanches(Cardapio ca){
        String rs = "";
        PreparedStatement st = null;
         try{
           
           String sql = "INSERT INTO Itens_Cardapio(nome_item , descricao, preco)\n" +
                         "VALUES (?,?,?)";
           st = this.c.prepareStatement(sql);
           st.setString(1, ca.getNome());
           st.setString(2, ca.getDescricao());
           st.setBigDecimal(3, ca.getPreco());
            st.executeUpdate();
            st.close();
            rs = "Lanche cadastrado com sucesso";
            
      }catch(SQLException e){
          rs = "Erro ao cadastrar lanche: " + e.getMessage();
      
    }finally{
     if(st != null){
         try{
             st.close();
         }catch(SQLException e){
             
         }
         }
    
         }
         return rs;
     }
}