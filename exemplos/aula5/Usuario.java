package exemplos.aula5;

/**
 * Classe Usuario para o sistema de biblioteca
 * Representa um usuário que pode emprestar livros
 */
public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    
    /**
     * Construtor da classe Usuario
     * @param nome O nome do usuário
     * @param cpf O CPF do usuário
     * @param email O email do usuário
     */
    public Usuario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    
    // Getters e setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Usuário: " + nome + 
               " | CPF: " + cpf + 
               " | Email: " + email;
    }
}