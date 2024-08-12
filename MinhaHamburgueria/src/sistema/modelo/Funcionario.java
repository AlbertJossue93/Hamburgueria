
package sistema.modelo;


public class Funcionario {
    private int Id_funcionario;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String cep;
    private String senha;
    private String rua;
    private String bairro;
    private int numero;
    
    
    // construtor sem id
    public Funcionario(String nome, String cpf, String email, String telefone, String cep, String senha, String rua, String bairro, int numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.senha = senha;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
      // Construtor com ID
    public Funcionario(int Id_funcionario, String nome, String cpf, String email, String telefone, String cep, String senha, String rua, String bairro, int numero) {
        this.Id_funcionario = Id_funcionario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.senha = senha;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }


    public int getId_funcionario() {
        return Id_funcionario;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    } 

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    
}
