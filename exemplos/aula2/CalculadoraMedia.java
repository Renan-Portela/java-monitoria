package exemplos.aula2;

import java.util.Scanner;

/**
 * Implementação do exercício prático: Calculadora de Média
 * Calcula a média de três notas e determina se o aluno foi aprovado ou reprovado
 */
public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar as três notas
        System.out.println("=== CALCULADORA DE MÉDIA ===");
        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();
        
        // Calcular a média
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Exibir o resultado formatado
        System.out.println("\n=== RESULTADO ===");
        System.out.printf("Nota 1: %.1f\n", nota1);
        System.out.printf("Nota 2: %.1f\n", nota2);
        System.out.printf("Nota 3: %.1f\n", nota3);
        System.out.printf("Média: %.2f\n", media);
        
        // Verificar se o aluno foi aprovado ou reprovado
        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
        
        entrada.close();
    }
}