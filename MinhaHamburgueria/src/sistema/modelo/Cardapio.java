
package sistema.modelo;
import java.math.BigDecimal;

public class Cardapio {
    private int Id_item;
    private String nome;
    private String descricao;
    private BigDecimal preco;
   

    public Cardapio(String nome, String descricao, BigDecimal preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
  
    }

    public int getId_item() {
        return Id_item;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }
    
}
