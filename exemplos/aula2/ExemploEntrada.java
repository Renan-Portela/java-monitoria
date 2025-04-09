package exemplos.aula2;

import java.util.Scanner;

/**
 * Demonstração dos comandos de entrada em Java
 * Ilustra o uso da classe Scanner para ler diferentes tipos de dados
 */
public class ExemploEntrada {
    public static void main(String[] args) {
        // Criar um objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar e ler uma string
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        // Solicitar e ler um número inteiro
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        // Consumir a quebra de linha pendente
        entrada.nextLine();
        
        // Solicitar e ler outra string
        System.out.print("Digite sua cidade: ");
        String cidade = entrada.nextLine();
        
        // Solicitar e ler um número decimal
        System.out.print("Digite sua altura (em metros): ");
        double altura = entrada.nextDouble();
        
        // Exibir os dados lidos
        System.out.println("\n=== Dados Informados ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cidade: " + cidade);
        System.out.printf("Altura: %.2f metros\n", altura);
        
        // Fechar o Scanner
        entrada.close();
    }
}