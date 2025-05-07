package exemplos.aula7.exercicio;

/**
 * Classe Disciplina para o exercício prático
 * Representa uma matéria acadêmica que pode ser cursada por um aluno
 */
public class Disciplina {
    private String nome;
    private String codigo;
    
    /**
     * Construtor da classe Disciplina
     * @param nome Nome da disciplina
     * @param codigo Código de identificação da disciplina
     */
    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return "Disciplina: " + nome + " (Código: " + codigo + ")";
    }
}
