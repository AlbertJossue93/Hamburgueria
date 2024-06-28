
package sistema.modelo;
import java.math.BigDecimal;

public class Bebidas {
    private int Id_bebida;
    private String nome;
    private BigDecimal preco;
   // primer construtor sem Id de bebida
    public Bebidas(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }
    // segundo construtor com Id_Bebida
    
       public Bebidas(int Id_bebida,String nome, BigDecimal preco) {
        this.Id_bebida = Id_bebida;
        this.nome = nome;
        this.preco = preco;
    }

    public void setId_bebida(int Id_bebida) {
        this.Id_bebida = Id_bebida;
    }
     
    public int getId_bebida() {
        return Id_bebida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }

  
    
    
    
}
