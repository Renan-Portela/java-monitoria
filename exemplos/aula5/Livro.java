package exemplos.aula5;

/**
 * Classe Livro para o sistema de biblioteca
 * Representa um livro com título, autor, ISBN e status de empréstimo
 */
public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;
    private String isbn;
    
    /**
     * Construtor da classe Livro
     * @param titulo O título do livro
     * @param autor O autor do livro
     * @param isbn O código ISBN do livro
     */
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }
    
    /**
     * Realiza o empréstimo do livro
     * @return true se o empréstimo foi realizado com sucesso, false caso o livro já esteja emprestado
     */
    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            return true;
        }
        return false;
    }
    
    /**
     * Realiza a devolução do livro
     * @return true se a devolução foi realizada com sucesso, false caso o livro não esteja emprestado
     */
    public boolean devolver() {
        if (emprestado) {
            emprestado = false;
            return true;
        }
        return false;
    }
    
    // Getters e setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public boolean isEmprestado() {
        return emprestado;
    }
    
    @Override
    public String toString() {
        return "Livro: " + titulo + 
               " | Autor: " + autor + 
               " | ISBN: " + isbn + 
               " | Status: " + (emprestado ? "Emprestado" : "Disponível");
    }
}