package negocio;

public class Empresa {
    
    private String nome;

    private Endereco endereco;

    /* ==========CONSTRUTOR==========*/
    public Empresa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
      
    /* ==========Get And Set==========*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
