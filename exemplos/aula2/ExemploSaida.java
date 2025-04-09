package exemplos.aula2;

/**
 * Demonstração dos comandos de saída em Java
 * Ilustra o uso do método printf() para formatação de texto
 */
public class ExemploSaida {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 25;
        double altura = 1.68;
        
        // Saída simples com println
        System.out.println("Informações pessoais:");
        
        // Concatenação de strings com println
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        
        // Usando printf para formatação mais controlada
        System.out.println("\nUsando printf para formatação:");
        System.out.printf("Nome: %s, Idade: %d anos, Altura: %.2f metros\n", 
                          nome, idade, altura);
        
        // Outros exemplos de formatação com printf
        double preco = 125.75;
        System.out.printf("Preço formatado: R$ %,.2f\n", preco);
        
        // Alinhamento com printf
        System.out.printf("%-10s | %5s | %8s\n", "Nome", "Idade", "Altura");
        System.out.printf("%-10s | %5d | %8.2f\n", nome, idade, altura);
    }
}