package exemplos.aula4;

/**
 * Classe que representa um produto em estoque
 * Demonstra encapsulamento, construtores e métodos em POO
 */
public class Produto {
    // Atributos
    private String nome;
    private double preco;
    private int quantidade;
    
    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    // Métodos
    public double calcularValorTotal() {
        return preco * quantidade;
    }
    
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }
    
    public boolean vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para venda.");
            return false;
        }
        
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido. Deve ser maior que zero.");
        }
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    // Não incluímos setQuantidade para forçar o uso dos métodos adicionarEstoque e vender
    // Isso é um exemplo de encapsulamento forte
    
    // Método toString para representação em texto do produto
    @Override
    public String toString() {
        return "Produto: " + nome + 
               "\nPreço: R$ " + String.format("%.2f", preco) + 
               "\nQuantidade em estoque: " + quantidade + 
               "\nValor total em estoque: R$ " + String.format("%.2f", calcularValorTotal());
    }
}