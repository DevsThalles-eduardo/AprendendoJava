package Produto;



public class Produtos {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Notebook");
        produto1.setPreco(4000);
        produto1.setQuantidade(10);
        produto1.apresentarInformacoes();

    }
}
