
package sistema.modelo;

public class Pedidos {
    private int Id_pedido;
    private int Id_Cliente;
    private String status_pedido;
    private String metodo_de_pagamento;

    public Pedidos(int Id_Cliente, String status_pedido, String metodo_de_pagamento) {
        this.Id_Cliente = Id_Cliente;
        this.status_pedido = status_pedido;
        this.metodo_de_pagamento = metodo_de_pagamento;
    } 
    
    
    
    
}
