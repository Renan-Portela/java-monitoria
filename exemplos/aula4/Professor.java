package exemplos.aula4;

/**
 * Classe Professor para o exercício prático
 * Demonstra atributos, construtores, getters, setters e métodos específicos
 */
public class Professor {
    // Atributos
    private String nome;
    private String matricula;
    private double salarioBase;
    private double bonus;
    
    // Construtor
    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = 0.0;
        this.bonus = 0.0;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.trim().isEmpty()) {
            this.matricula = matricula;
        } else {
            System.out.println("Matrícula inválida.");
        }
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Salário base inválido. Deve ser não-negativo.");
        }
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            System.out.println("Bônus inválido. Deve ser não-negativo.");
        }
    }
    
    // Métodos específicos
    public double calcularSalarioTotal() {
        return salarioBase + bonus;
    }
    
    public String status() {
        if (bonus >= 1000) {
            return "Bônus alto";
        } else {
            return "Bônus baixo";
        }
    }
    
    // Método para exibir informações formatadas
    public void exibirInformacoes() {
        System.out.println("===== INFORMAÇÕES DO PROFESSOR =====");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Bônus: R$ " + String.format("%.2f", bonus));
        System.out.println("Salário Total: R$ " + String.format("%.2f", calcularSalarioTotal()));
        System.out.println("Status: " + status());
    }
}