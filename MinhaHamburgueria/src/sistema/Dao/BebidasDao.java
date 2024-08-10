
package sistema.Dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema.modelo.Bebidas;


public class BebidasDao {
      private Connection c;

    public BebidasDao(Connection c) {
        this.c = c;
  
      }
    
    public String AddBebidas(Bebidas bebida){
        String r = "";
        PreparedStatement sta = null;
         try{
           
           String sql = "INSERT INTO Bebidas(nome, preco)\n" +
                         "VALUES (?,?)";
           sta = this.c.prepareStatement(sql);
           sta.setString(1, bebida.getNome());
           sta.setBigDecimal(2, bebida.getPreco());
           sta.executeUpdate();
           sta.close();
            r = "Bebida cadastrada com sucesso";
            
      }catch(SQLException e){
          r = "Erro ao cadastrar Bebida: " + e.getMessage();
      
    }finally{
     if(sta != null){
         try{
             sta.close();
          }catch(SQLException e){
             
            }
        }
    
        }
        return r;
    }
    
      public List<Bebidas>CarregarDadosBebidas(){
         List<Bebidas> BebidasLista = new ArrayList<>();
           PreparedStatement sstt = null;
           ResultSet rss = null;
          try{
              String sql = "SELECT Id_bebida , nome , preco FROM Bebidas;";
              sstt = this.c.prepareStatement(sql);
              rss = sstt.executeQuery();
              
                while (rss.next()) {
                int id = rss.getInt("Id_bebida");
                String nome = rss.getString("nome");
                BigDecimal preco = rss.getBigDecimal("preco");
                Bebidas be = new Bebidas(id, nome, preco);
                BebidasLista.add(be);
              
            }
                
           } catch (SQLException e) {
            e.printStackTrace();
            // Aqui você pode adicionar um tratamento de erro, como logging ou lançando uma exceção personalizada
        } finally {
            try {
                if (rss != null) rss.close();
                if (sstt != null) sstt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return BebidasLista;
      }
      
      public boolean ExcluirBebida(int id_bebida){
          String sql = "DELETE FROM Bebidas WHERE Id_bebida = ?";
          boolean excluir = false;
          try{
              PreparedStatement sta = c.prepareStatement(sql);
              sta.setInt(1, id_bebida);
               int rowAffected = sta.executeUpdate();
               if(rowAffected > 0){
                   excluir = true;
               }
          }catch(SQLException e){
              System.out.println("Erro ao exluir Bebida" +e.getMessage());
              e.printStackTrace();
          }
          return excluir;
      }
}

