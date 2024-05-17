
package sistema.modelo;


public class Cardapio {
    private int Id_item;
    private String nome;
    private String descricao;
    private float preco;
   

    public Cardapio(int Id_item, String nome, String descricao, float preco) {
        this.Id_item = Id_item;
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

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }
    
}
