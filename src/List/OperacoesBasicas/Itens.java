package List.OperacoesBasicas;

public class Itens {

    private String nome;
    private double preco;
    private int quantidade;

    public Itens(String nome) {
        this.nome = nome;
    }

    public Itens (double preco) {
        this.preco = preco;
    }

    public Itens(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
