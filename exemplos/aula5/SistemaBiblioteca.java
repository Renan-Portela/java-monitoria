package exemplos.aula5;

/**
 * Classe principal para iniciar o sistema de biblioteca
 */
public class SistemaBiblioteca {
    public static void main(String[] args) {
        System.out.println("Iniciando o Sistema de Biblioteca...");
        
        // Criar uma instância da biblioteca e mostrar o menu
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.mostrarMenu();
        
        System.out.println("Sistema encerrado. Obrigado por utilizar!");
    }
}