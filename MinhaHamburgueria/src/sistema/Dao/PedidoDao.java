
package sistema.Dao;
import java.math.BigDecimal;
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
}
         
    
       
    

