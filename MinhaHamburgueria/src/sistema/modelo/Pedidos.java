
package sistema.modelo;

import java.math.BigDecimal;

public class Pedidos {
    private int Id_pedido;
    private String nome_cliente;
    private String celular_cliente;
    private int item_cardapio_id;
    private int bebida_id;
    private BigDecimal preco_total;

    public Pedidos(int Id_pedido,String nome_cliente, String celular_cliente, int item_cardapio_id, int bebida_id, BigDecimal preco_total) {
       this.Id_pedido = Id_pedido;
       this.nome_cliente = nome_cliente;
        this.celular_cliente = celular_cliente;
        this.item_cardapio_id = item_cardapio_id;
        this.bebida_id = bebida_id;
        this.preco_total = preco_total;
    }
       // segundo construtor....
        public Pedidos(String nome_cliente, String celular_cliente, int item_cardapio_id, int bebida_id, BigDecimal preco_total) {
        this.nome_cliente = nome_cliente;
        this.celular_cliente = celular_cliente;
        this.item_cardapio_id = item_cardapio_id;
        this.bebida_id = bebida_id;
        this.preco_total = preco_total;
    }

    public int getId_pedido() {
        return Id_pedido;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setCelular_cliente(String celular_cliente) {
        this.celular_cliente = celular_cliente;
    }

    public String getCelular_cliente() {
        return celular_cliente;
    }

    public void setItem_cardapio_id(int item_cardapio_id) {
        this.item_cardapio_id = item_cardapio_id;
    }

    public int getItem_cardapio_id() {
        return item_cardapio_id;
    }

    public void setBebida_id(int bebida_id) {
        this.bebida_id = bebida_id;
    }

    public int getBebida_id() {
        return bebida_id;
    }

    public void setPreco_total(BigDecimal preco_total) {
        this.preco_total = preco_total;
    }

    public BigDecimal getPreco_total() {
        return preco_total;
    }
    
    
      
    
}
