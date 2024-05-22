
package sistema.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
}
