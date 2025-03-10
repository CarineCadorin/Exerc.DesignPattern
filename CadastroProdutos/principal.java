package CadastroProdutos;

public class principal {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        Produto produto1 = new Produto("Laptop", 3000, 50);
        Produto produto2 = new Produto("Smartphone", 1500, 100);

        cadastro.adicionarProduto(produto1);
        cadastro.adicionarProduto(produto2);

        cadastro.atualizarPrecoProduto("Laptop", 2800);

        cadastro.exibirRelatorio();
    }
}
