package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Itens> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarProduto (String nome){
        carrinho.add(new Itens(nome));
    }

    public void adicionarPreco (Double preco){
        carrinho.add(new Itens(preco));
    }

    public void adicionarQuantidade (int quantidade){
        carrinho.add(new Itens(quantidade))
    }





}
