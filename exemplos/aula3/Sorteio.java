package exemplos.aula3;

import java.util.Scanner;

/**
 * Implementação do exercício prático: Sorteio entre 5 pessoas
 * Solicita nomes, armazena em um array e realiza um sorteio aleatório
 */
public class Sorteio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        
        // Solicitar e armazenar os nomes
        System.out.println("=== SORTEIO ENTRE 5 PESSOAS ===");
        System.out.println("Digite o nome de 5 pessoas para o sorteio:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Pessoa " + (i+1) + ": ");
            nomes[i] = entrada.nextLine();
        }
        
        // Exibir a lista de participantes
        System.out.println("\nParticipantes confirmados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i+1) + ". " + nomes[i]);
        }
        
        // Realizar o sorteio
        System.out.println("\nRealizando o sorteio...");
        // Simulação de suspense
        try {
            Thread.sleep(2000); // Pausa por 2 segundos
        } catch (InterruptedException e) {
            // Tratamento da exceção (não é necessário entrar em detalhes aqui)
        }
        
        int sorteado = (int) (Math.random() * 5); // Gera número entre 0 e 4
        
        // Exibir o resultado
        System.out.println("\n🎉 RESULTADO DO SORTEIO 🎉");
        System.out.println("O vencedor é: " + nomes[sorteado] + "!");
        
        entrada.close();
    }
}