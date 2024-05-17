
package sistema.modelo;


public class Bebidas {
    private int Id_bebida;
    private String nome;
    private float preco;

    public Bebidas(String nome, float preco) {
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

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

  
    
    
    
}
