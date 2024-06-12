
package sistema.modelo;
import java.math.BigDecimal;

public class Cardapio {
    private int Id_item;
    private String nome;
    private String descricao;
    private BigDecimal preco;
   
  
    
    // Construtor para criar novos itens sem Id_item
    public Cardapio(String nome, String descricao, BigDecimal preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    // segundo construtor com Id_item...
    public Cardapio(int Id_item,String nome,String descricao, BigDecimal preco) {
        this.Id_item = Id_item;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
  
    }

    public Cardapio(int id, String nome, BigDecimal preco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void setId_item(int Id_item) {
        this.Id_item = Id_item;
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
