package exemplos.aula7;

/**
 * Exemplo de composição em Java
 * Demonstra a relação "tem um" entre classes
 */
public class ExemploComposicao {
    
    public static void main(String[] args) {
        // Criar um endereço
        Endereco endereco = new Endereco("Rua das Flores", 123, "São Paulo", "SP");
        
        // Criar uma pessoa com o endereço (composição)
        Pessoa pessoa = new Pessoa("Maria Silva", 28, endereco);
        
        // Exibir informações
        pessoa.exibirInformacoes();
        
        // Criando uma nova pessoa com novo endereço
        Endereco outroEndereco = new Endereco("Av. Principal", 456, "Rio de Janeiro", "RJ");
        Pessoa outraPessoa = new Pessoa("João Santos", 35, outroEndereco);
        
        // Exibir informações da outra pessoa
        outraPessoa.exibirInformacoes();
    }
}

/**
 * Classe componente: Endereço
 */
class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    
    public Endereco(String rua, int numero, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return rua + ", " + numero + " - " + cidade + "/" + estado;
    }
    
    // Getters e setters omitidos para brevidade
}

/**
 * Classe composta: Pessoa que contém um Endereço
 */
class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco; // Relação de composição: Pessoa tem um Endereco
    
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    public void exibirInformacoes() {
        System.out.println("\n=== INFORMAÇÕES PESSOAIS ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }
    
    // Getters e setters omitidos para brevidade
}
