package exemplos.aula3;

/**
 * Demonstração de manipulação de Strings em Java
 * Ilustra os principais métodos da classe String
 */
public class ExemploString {
    public static void main(String[] args) {
        // Declaração e inicialização
        String nome = "Gabriel";
        String sobrenome = "Silva";
        
        // Concatenação
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);
        
        // Métodos de manipulação
        System.out.println("\n=== MÉTODOS DE STRING ===");
        System.out.println("Tamanho: " + nomeCompleto.length() + " caracteres");
        System.out.println("Maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Minúsculas: " + nomeCompleto.toLowerCase());
        System.out.println("Primeira letra: " + nomeCompleto.charAt(0));
        System.out.println("Última letra: " + nomeCompleto.charAt(nomeCompleto.length() - 1));
        System.out.println("Sobrenome: " + nomeCompleto.substring(8));
        System.out.println("Primeiras 3 letras: " + nomeCompleto.substring(0, 3));
        
        // Verificação e substituição
        System.out.println("\n=== VERIFICAÇÃO E SUBSTITUIÇÃO ===");
        System.out.println("Contém 'Silva'? " + nomeCompleto.contains("Silva"));
        System.out.println("Começa com 'G'? " + nomeCompleto.startsWith("G"));
        System.out.println("Termina com 'va'? " + nomeCompleto.endsWith("va"));
        String novoNome = nomeCompleto.replace("Silva", "Oliveira");
        System.out.println("Nome alterado: " + novoNome);
        
        // Comparação de strings
        System.out.println("\n=== COMPARAÇÃO DE STRINGS ===");
        String nome1 = "Maria";
        String nome2 = "maria";
        System.out.println("nome1 = " + nome1);
        System.out.println("nome2 = " + nome2);
        System.out.println("nome1 equals nome2: " + nome1.equals(nome2));
        System.out.println("nome1 equalsIgnoreCase nome2: " + nome1.equalsIgnoreCase(nome2));
        System.out.println("Comparação alfabética: " + nome1.compareTo(nome2));
    }
}