package exemplos.aula3;

/**
 * Demonstração de Arrays unidimensionais e multidimensionais em Java
 * Ilustra declaração, inicialização e manipulação de arrays
 */
public class ExemploArrays {
    public static void main(String[] args) {
        // Declaração e inicialização de arrays
        int[] numeros = new int[5]; // Array vazio com 5 posições
        double[] precos = {10.5, 20.0, 30.75}; // Inicialização direta
        
        // Atribuindo valores ao array de números
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        
        // Iterando e exibindo os valores
        System.out.println("=== ARRAY DE NÚMEROS ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        
        // Usando for-each (enhanced for loop)
        System.out.println("\n=== ARRAY DE PREÇOS (usando for-each) ===");
        for (double preco : precos) {
            System.out.println("Preço: R$ " + preco);
        }
        
        // Encontrando o maior valor no array
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("\nMaior valor no array de números: " + maior);
        
        // Array bidimensional (matriz)
        int[][] matriz = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        
        // Percorrendo e exibindo a matriz
        System.out.println("\n=== MATRIZ 3x3 ===");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
        
        // Calculando a soma de todos os elementos da matriz
        int soma = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                soma += valor;
            }
        }
        System.out.println("\nSoma de todos os elementos da matriz: " + soma);
    }
}