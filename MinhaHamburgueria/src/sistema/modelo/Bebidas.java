
package sistema.modelo;
import java.math.BigDecimal;

public class Bebidas {
    private int Id_bebida;
    private String nome;
    private BigDecimal preco;

    public Bebidas(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
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
