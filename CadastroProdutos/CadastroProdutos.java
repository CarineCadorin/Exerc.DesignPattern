package CadastroProdutos;

import java.util.ArrayList;
import java.util.List;

class CadastroProdutos {
    private List<Produto> produtos;

    public CadastroProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void atualizarPrecoProduto(String nome, double novoPreco) {
        for (Produto produto : produtos) {
            if (produto.nome.equals(nome)) {
                produto.atualizarPreco(novoPreco);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Produtos:");
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }
    }
}
