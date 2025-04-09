package exemplos.aula1;

/**
 * Demonstração completa dos tipos primitivos e operadores em Java
 * Este exemplo ilustra todos os tipos primitivos, suas características,
 * e operações básicas de incremento/decremento
 */
public class TiposPrimitivosOperadores {
    public static void main(String[] args) {
        // Declaração e inicialização de tipos primitivos
        byte b = 10;              // 8 bits, -128 a 127
        short s = 20000;          // 16 bits, -32.768 a 32.767
        int i = 1000000;          // 32 bits, -2^31 a 2^31-1
        long l = 9223372036854775807L;  // 64 bits, -2^63 a 2^63-1. Note o sufixo L
        float f = 3.14f;          // 32 bits, ponto flutuante. Note o sufixo f
        double d = 3.141592653589793; // 64 bits, ponto flutuante de precisão dupla
        char c = 'A';             // 16 bits, um único caractere Unicode
        boolean bool = true;      // true ou false

        // Exibindo os valores
        System.out.println("=== TIPOS PRIMITIVOS ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // Operações aritméticas
        System.out.println("\n=== OPERAÇÕES ARITMÉTICAS ===");
        int a1 = 20, a2 = 5;
        System.out.println("a1 = " + a1 + ", a2 = " + a2);
        System.out.println("Soma: " + (a1 + a2));
        System.out.println("Subtração: " + (a1 - a2));
        System.out.println("Multiplicação: " + (a1 * a2));
        System.out.println("Divisão: " + (a1 / a2));
        System.out.println("Resto: " + (a1 % a2));

        // Incremento e decremento
        System.out.println("\n=== INCREMENTO/DECREMENTO ===");
        int x = 10;
        System.out.println("x = " + x);

        System.out.println("Pós-incremento (x++): " + x++); // Mostra 10, depois incrementa
        System.out.println("Após pós-incremento: " + x);    // Mostra 11

        System.out.println("Pré-incremento (++x): " + ++x); // Incrementa, depois mostra 12
        System.out.println("Após pré-incremento: " + x);    // Mostra 12

        System.out.println("Pós-decremento (x--): " + x--); // Mostra 12, depois decrementa
        System.out.println("Após pós-decremento: " + x);    // Mostra 11

        System.out.println("Pré-decremento (--x): " + --x); // Decrementa, depois mostra 10
        System.out.println("Após pré-decremento: " + x);    // Mostra 10
    }
}