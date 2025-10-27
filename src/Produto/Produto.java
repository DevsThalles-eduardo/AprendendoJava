package Produto;

public class Produto {
    /*. Encapsulamento — “Produto”
    Crie uma classe Produto com:
    Atributos privados: nome, preco e quantidade


    Métodos públicos get e set para cada atributo


    Um método exibirInformacoes() que mostra os dados do produto formatados


    Teste no main criando um objeto e modificando seus valores.*/

    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}
    public void setPreco(double preco) {this.preco = preco;}
    public double getPreco() {return preco;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
    public int getQuantidade() {return quantidade;}

    public void apresentarInformacoes(){
        System.out.println("Produto: " +getNome() +
                "\nPreço: R$ " + getPreco() +
                "\nQuantidade: " + getQuantidade());
    }
}
