
package sistema.modelo;


public class Cliente {
    private int Id_cliente;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente( String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    
   
    public int getId_cliente() {
        return Id_cliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
    
     
}
