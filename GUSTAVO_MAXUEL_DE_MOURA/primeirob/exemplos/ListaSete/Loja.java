package primeirob.exemplos.ListaSete;

public class Loja extends Endereco {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    Vendedor[] vendedores;
    Cliente[] clientes;


    public Loja() {
        this.nomeFantasia = "Myyplant";
        this.razaoSocial = "Floricultura Gabriela LTDA";
        this.cnpj = "99.999.999/9999-99";
        this.vendedores = vendedores;
        this.clientes = clientes;
    }

    public int contarClientes() {
        return clientes.length;
    }

    public int contarVendedores() {
        return vendedores.length;
    }

    // public void apresentarSe() {
    //     System.out.println("Nome Fantasia: " + nomeFantasia);
    //     System.out.println("CNPJ: " + cnpj);
    //  System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
    // }

}
