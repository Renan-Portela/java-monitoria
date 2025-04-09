package exemplos.aula1;

/**
 * Demonstração de operadores e estruturas de controle em Java
 * Inclui exemplos de operadores aritméticos, estruturas condicionais e loops
 */
public class EstruturaControle {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = 5;

        // Operadores aritméticos
        int soma = a + b;        // 15
        int subtracao = a - b;   // 5
        int multiplicacao = a * b; // 50
        int divisao = a / b;     // 2

        // Exibindo resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Estrutura condicional
        if (a > b) {
            System.out.println("a é maior que b");
        } else if (a < b) {
            System.out.println("a é menor que b");
        } else {
            System.out.println("a é igual a b");
        }

        // Estrutura de repetição
        System.out.println("Contagem regressiva:");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}