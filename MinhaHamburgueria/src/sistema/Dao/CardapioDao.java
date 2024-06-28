
package sistema.Dao;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import sistema.modelo.Cardapio;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

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
     
      public List<Cardapio>CarregarDadosCardapio(){
         List<Cardapio> cardapioLista = new ArrayList<>();
           PreparedStatement sst = null;
           ResultSet rs = null;
           
             try{
             
               String sql = "SELECT Id_item, nome_item, descricao, preco FROM Itens_Cardapio";
               sst = this.c.prepareStatement(sql);
               rs = sst.executeQuery();
               
               
             while (rs.next()) {
                int id = rs.getInt("Id_item");
                String nome = rs.getString("nome_item");
                String descricao = rs.getString("descricao");
                BigDecimal preco = rs.getBigDecimal("preco");
                Cardapio item = new Cardapio(id, nome, descricao, preco);
                cardapioLista.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // exceção personalizada 
        } finally {
            try {
                if (rs != null) rs.close();
                if (sst != null) sst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return cardapioLista;
               
    
     }
     
}