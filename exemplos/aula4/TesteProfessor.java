package exemplos.aula4;

/**
 * Classe para testar a classe Professor
 * Implementação da solução do exercício prático
 */
public class TesteProfessor {
    public static void main(String[] args) {
        // Criando dois professores
        Professor prof1 = new Professor("Carlos Silva", "P12345");
        Professor prof2 = new Professor("Ana Oliveira", "P67890");
        
        // Configurando atributos do primeiro professor
        prof1.setSalarioBase(5000.0);
        prof1.setBonus(1200.0);
        
        // Configurando atributos do segundo professor
        prof2.setSalarioBase(4500.0);
        prof2.setBonus(800.0);
        
        // Exibindo informações dos professores
        prof1.exibirInformacoes();
        
        System.out.println("\n------------------------\n");
        
        prof2.exibirInformacoes();
        
        // Demonstrando a manipulação de objetos
        System.out.println("\n===== COMPARAÇÕES =====");
        System.out.println("Quem tem o maior salário total?");
        
        if (prof1.calcularSalarioTotal() > prof2.calcularSalarioTotal()) {
            System.out.println(prof1.getNome() + " tem o maior salário total: R$ " 
                               + String.format("%.2f", prof1.calcularSalarioTotal()));
        } else if (prof2.calcularSalarioTotal() > prof1.calcularSalarioTotal()) {
            System.out.println(prof2.getNome() + " tem o maior salário total: R$ " 
                               + String.format("%.2f", prof2.calcularSalarioTotal()));
        } else {
            System.out.println("Ambos os professores têm o mesmo salário total: R$ " 
                               + String.format("%.2f", prof1.calcularSalarioTotal()));
        }
        
        // Testando o status
        System.out.println("\nStatus dos professores:");
        System.out.println(prof1.getNome() + ": " + prof1.status());
        System.out.println(prof2.getNome() + ": " + prof2.status());
    }
}