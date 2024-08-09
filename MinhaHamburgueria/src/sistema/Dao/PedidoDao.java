
package sistema.Dao;
//import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistema.modelo.Bebidas;
import sistema.modelo.Cardapio;
import sistema.modelo.Pedidos;
import java.sql.ResultSet;


public class PedidoDao {
    private Connection c;
    
    
    public PedidoDao(Connection c){
        this.c = c;
            
        
    }
       public String adicionarPedido(Pedidos pedido) {
        String sql = "INSERT INTO Pedidos (nome_cliente, celular_cliente, item_cardapio_id, bebida_id, preco_total) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1, pedido.getNome_cliente());
            stmt.setString(2, pedido.getCelular_cliente());
            stmt.setInt(3, pedido.getItem_cardapio_id());
            stmt.setInt(4, pedido.getBebida_id());
            stmt.setBigDecimal(5, pedido.getPreco_total());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                return "Pedido cadastrado com sucesso";
            } else {
                return "Erro ao cadastrar pedido";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao cadastrar pedido: " + e.getMessage();
        }
    
    
       }
        public List<Cardapio> obterLanches() {
        List<Cardapio> lanches = new ArrayList<>();
        String sql = "SELECT Id_item, nome_item, descricao, preco FROM Itens_Cardapio";
        try (PreparedStatement stmt = c.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

             while (rs.next()) {
            lanches.add(new Cardapio(rs.getInt("Id_item"), rs.getString("nome_item"), rs.getString("descricao"), rs.getBigDecimal("preco")));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return lanches;

    }

    public List<Bebidas> obterBebidas() {
        List<Bebidas> bebidas = new ArrayList<>();
        String sql = "SELECT Id_bebida, nome, preco FROM bebidas";
        try (PreparedStatement stmt = c.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

             while (rs.next()) {
            bebidas.add(new Bebidas(rs.getInt("Id_bebida"), rs.getString("nome"), rs.getBigDecimal("preco")));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return bebidas;
}
    
       public List<Pedidos> PedidosDosClientes(){
         List<Pedidos> pedidos = new ArrayList<>();
           PreparedStatement sst = null;
           ResultSet rs = null;
          try{
              String sql = "SELECT Id_pedido , nome_cliente, celular_cliente, item_cardapio_id, bebida_id, preco_total FROM Pedidos";
              sst = this.c.prepareStatement(sql);
              rs = sst.executeQuery();
              
                while (rs.next()){
                   Pedidos pedido = new Pedidos(
                    rs.getInt("Id_pedido"),
                    rs.getString("nome_cliente"),
                    rs.getString("celular_cliente"),
                    rs.getInt("item_cardapio_id"),
                    rs.getInt("bebida_id"),
                    rs.getBigDecimal("preco_total")
                   );
                   pedidos.add(pedido);
            }
                
           } catch (SQLException e) {
            e.printStackTrace();
            // Aqui você pode adicionar um tratamento de erro, como logging ou lançando uma exceção personalizada
        }

        return pedidos;
      }
       
      public boolean deletarPedido(int idpedido){
          String sql = "DELETE FROM Pedidos WHERE Id_pedido = ?";
          boolean isDeleted = false;
          
          try{
              PreparedStatement stmt = c.prepareStatement(sql);
              stmt.setInt(1, idpedido);
              int rowAffected = stmt.executeUpdate();
              if(rowAffected > 0){
                isDeleted = true;
                  
              }
          }catch(SQLException e){
              System.out.println("Erro ao Excluir Pedido" +e.getMessage());
              e.printStackTrace();
          }
          return isDeleted;
      }
}
         
    
       
    

