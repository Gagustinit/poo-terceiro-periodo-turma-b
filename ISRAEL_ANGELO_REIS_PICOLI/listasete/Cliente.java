package listasete;

public class Cliente {

    private String nome;

    private Integer idade;

    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void apresentarse() {
        System.out.println("\nCliente: " + nome + " | Idade: " + idade + "\n");
    }
}
