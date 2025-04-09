package exemplos.aula5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe Biblioteca para gerenciar o sistema de biblioteca
 * Responsável por cadastrar, emprestar e devolver livros
 */
public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    
    /**
     * Construtor da classe Biblioteca
     * Inicializa as listas de livros e usuários
     */
    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        
        // Inicializa com alguns livros e usuários para facilitar os testes
        inicializarDadosTeste();
    }
    
    /**
     * Método para inicializar dados de teste
     * Adiciona alguns livros e usuários ao sistema
     */
    private void inicializarDadosTeste() {
        // Adicionar livros de exemplo
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", "978-85-123-45-1"));
        livros.add(new Livro("1984", "George Orwell", "978-85-123-45-2"));
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-85-123-45-3"));
        livros.add(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "978-85-123-45-4"));
        livros.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", "978-85-123-45-5"));
        
        // Adicionar usuários de exemplo
        usuarios.add(new Usuario("João Silva", "123.456.789-00", "joao@email.com"));
        usuarios.add(new Usuario("Maria Oliveira", "987.654.321-00", "maria@email.com"));
        usuarios.add(new Usuario("Pedro Santos", "111.222.333-44", "pedro@email.com"));
        usuarios.add(new Usuario("Ana Costa", "555.666.777-88", "ana@email.com"));
        usuarios.add(new Usuario("Carlos Souza", "999.888.777-66", "carlos@email.com"));
    }
    
    /**
     * Cadastra um novo livro no sistema
     */
    public void cadastrarLivro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== CADASTRAR LIVRO ===");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        
        Livro novoLivro = new Livro(titulo, autor, isbn);
        livros.add(novoLivro);
        
        System.out.println("\nLivro cadastrado com sucesso!");
    }
    
    /**
     * Cadastra um novo usuário no sistema
     */
    public void cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== CADASTRAR USUÁRIO ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        Usuario novoUsuario = new Usuario(nome, cpf, email);
        usuarios.add(novoUsuario);
        
        System.out.println("\nUsuário cadastrado com sucesso!");
    }
    
    /**
     * Realiza o empréstimo de um livro
     */
    public void emprestarLivro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== EMPRESTAR LIVRO ===");
        
        // Listar livros disponíveis
        System.out.println("\nLivros disponíveis:");
        boolean temLivrosDisponiveis = false;
        
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (!livro.isEmprestado()) {
                System.out.println("[" + i + "] " + livro);
                temLivrosDisponiveis = true;
            }
        }
        
        if (!temLivrosDisponiveis) {
            System.out.println("Não há livros disponíveis para empréstimo.");
            return;
        }
        
        // Selecionar livro
        System.out.print("\nSelecione o ID do livro: ");
        int idLivro = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        
        if (idLivro < 0 || idLivro >= livros.size()) {
            System.out.println("ID de livro inválido!");
            return;
        }
        
        Livro livroSelecionado = livros.get(idLivro);
        
        if (livroSelecionado.isEmprestado()) {
            System.out.println("Este livro já está emprestado!");
            return;
        }
        
        // Listar usuários
        System.out.println("\nUsuários cadastrados:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("[" + i + "] " + usuarios.get(i));
        }
        
        // Selecionar usuário
        System.out.print("\nSelecione o ID do usuário: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        
        if (idUsuario < 0 || idUsuario >= usuarios.size()) {
            System.out.println("ID de usuário inválido!");
            return;
        }
        
        Usuario usuarioSelecionado = usuarios.get(idUsuario);
        
        // Realizar empréstimo
        if (livroSelecionado.emprestar()) {
            System.out.println("\nEmpréstimo realizado com sucesso!");
            System.out.println("Livro: " + livroSelecionado.getTitulo());
            System.out.println("Usuário: " + usuarioSelecionado.getNome());
        } else {
            System.out.println("\nNão foi possível realizar o empréstimo.");
        }
    }
    
    /**
     * Realiza a devolução de um livro
     */
    public void devolverLivro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== DEVOLVER LIVRO ===");
        
        // Listar livros emprestados
        System.out.println("\nLivros emprestados:");
        boolean temLivrosEmprestados = false;
        
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.isEmprestado()) {
                System.out.println("[" + i + "] " + livro);
                temLivrosEmprestados = true;
            }
        }
        
        if (!temLivrosEmprestados) {
            System.out.println("Não há livros emprestados para devolver.");
            return;
        }
        
        // Selecionar livro
        System.out.print("\nSelecione o ID do livro: ");
        int idLivro = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        
        if (idLivro < 0 || idLivro >= livros.size()) {
            System.out.println("ID de livro inválido!");
            return;
        }
        
        Livro livroSelecionado = livros.get(idLivro);
        
        if (!livroSelecionado.isEmprestado()) {
            System.out.println("Este livro não está emprestado!");
            return;
        }
        
        // Realizar devolução
        if (livroSelecionado.devolver()) {
            System.out.println("\nDevolução realizada com sucesso!");
            System.out.println("Livro: " + livroSelecionado.getTitulo());
        } else {
            System.out.println("\nNão foi possível realizar a devolução.");
        }
    }
    
    /**
     * Lista todos os livros cadastrados
     */
    public void listarLivros() {
        System.out.println("\n=== LISTA DE LIVROS ===");
        
        if (livros.isEmpty()) {
            System.out.println("Não há livros cadastrados.");
            return;
        }
        
        for (int i = 0; i < livros.size(); i++) {
            System.out.println("[" + i + "] " + livros.get(i));
        }
    }
    
    /**
     * Lista todos os usuários cadastrados
     */
    public void listarUsuarios() {
        System.out.println("\n=== LISTA DE USUÁRIOS ===");
        
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados.");
            return;
        }
        
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("[" + i + "] " + usuarios.get(i));
        }
    }
    
    /**
     * Edita as informações de um livro
     */
    public void editarLivro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== EDITAR LIVRO ===");
        
        // Exibir lista de livros para seleção
        listarLivros();
        
        if (livros.isEmpty()) {
            return; // Sai do método se não houver livros
        }
        
        System.out.print("\nDigite o ID do livro que deseja editar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        
        if (id >= 0 && id < livros.size()) {
            Livro livro = livros.get(id);
            
            System.out.println("\nEditando: " + livro.getTitulo());
            System.out.println("Deixe em branco para manter o valor atual");
            
            System.out.print("Novo título [" + livro.getTitulo() + "]: ");
            String novoTitulo = scanner.nextLine();
            if (!novoTitulo.isEmpty()) {
                livro.setTitulo(novoTitulo);
            }
            
            System.out.print("Novo autor [" + livro.getAutor() + "]: ");
            String novoAutor = scanner.nextLine();
            if (!novoAutor.isEmpty()) {
                livro.setAutor(novoAutor);
            }
            
            System.out.print("Novo ISBN [" + livro.getIsbn() + "]: ");
            String novoIsbn = scanner.nextLine();
            if (!novoIsbn.isEmpty()) {
                livro.setIsbn(novoIsbn);
            }
            
            System.out.println("\nLivro atualizado com sucesso!");
        } else {
            System.out.println("\nID inválido!");
        }
    }
    
    /**
     * Edita as informações de um usuário
     */
    public void editarUsuario() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== EDITAR USUÁRIO ===");
        
        // Exibir lista de usuários para seleção
        listarUsuarios();
        
        if (usuarios.isEmpty()) {
            return; // Sai do método se não houver usuários
        }
        
        System.out.print("\nDigite o ID do usuário que deseja editar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        
        if (id >= 0 && id < usuarios.size()) {
            Usuario usuario = usuarios.get(id);
            
            System.out.println("\nEditando: " + usuario.getNome());
            System.out.println("Deixe em branco para manter o valor atual");
            
            System.out.print("Novo nome [" + usuario.getNome() + "]: ");
            String novoNome = scanner.nextLine();
            if (!novoNome.isEmpty()) {
                usuario.setNome(novoNome);
            }
            
            System.out.print("Novo CPF [" + usuario.getCpf() + "]: ");
            String novoCpf = scanner.nextLine();
            if (!novoCpf.isEmpty()) {
                usuario.setCpf(novoCpf);
            }
            
            System.out.print("Novo email [" + usuario.getEmail() + "]: ");
            String novoEmail = scanner.nextLine();
            if (!novoEmail.isEmpty()) {
                usuario.setEmail(novoEmail);
            }
            
            System.out.println("\nUsuário atualizado com sucesso!");
        } else {
            System.out.println("\nID inválido!");
        }
    }
    
    /**
     * Gera um relatório estatístico da biblioteca
     * @return String contendo o relatório formatado
     */
    public String gerarRelatorio() {
        int totalLivros = livros.size();
        int livrosEmprestados = 0;
        
        for (Livro livro : livros) {
            if (livro.isEmprestado()) {
                livrosEmprestados++;
            }
        }
        
        double percentualEmprestados = totalLivros > 0 
            ? (double) livrosEmprestados / totalLivros * 100 
            : 0;
        
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("=== RELATÓRIO DA BIBLIOTECA ===\n");
        relatorio.append("Total de livros cadastrados: ").append(totalLivros).append("\n");
        relatorio.append("Livros emprestados: ").append(livrosEmprestados);
        relatorio.append(" (").append(String.format("%.1f", percentualEmprestados)).append("%)\n");
        relatorio.append("Livros disponíveis: ").append(totalLivros - livrosEmprestados).append("\n");
        relatorio.append("Total de usuários: ").append(usuarios.size()).append("\n");
        
        return relatorio.toString();
    }
    
    /**
     * Exibe o menu principal do sistema e processa as opções
     */
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Usuário");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Listar Livros");
            System.out.println("6. Listar Usuários");
            System.out.println("7. Editar Livro");     // Nova opção
            System.out.println("8. Editar Usuário");   // Nova opção
            System.out.println("9. Gerar Relatório");  // Nova opção
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha
            
            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    emprestarLivro();
                    break;
                case 4:
                    devolverLivro();
                    break;
                case 5:
                    listarLivros();
                    break;
                case 6:
                    listarUsuarios();
                    break;
                case 7:
                    editarLivro();
                    break;
                case 8:
                    editarUsuario();
                    break;
                case 9:
                    System.out.println(gerarRelatorio());
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}