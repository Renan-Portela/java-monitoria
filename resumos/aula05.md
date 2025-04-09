---
title: Aula 05
tags: [java, programacao, monitoria, trabalhoequipe, desenvolvimento]

---

# Código Secreto
**Data:** 26/03/2025 **Matéria:** Programação Orientada a Objetos **Monitor:** Renan Portela

📝 **Resumo da Aula**

A aula "Código Secreto" foi uma atividade dinâmica focada no trabalho colaborativo e no reforço dos conceitos fundamentais de Programação Orientada a Objetos já estudados (classes, métodos e objetos). A sessão foi dividida em duas partes principais: uma atividade colaborativa em grupo, onde os alunos precisaram compreender e integrar diferentes trechos de código, e uma parte individual, onde cada aluno teve que expandir as funcionalidades do sistema desenvolvido coletivamente.

Esta abordagem prática permitiu aos estudantes consolidar seus conhecimentos teóricos através da aplicação direta em um problema real, desenvolvendo também habilidades de trabalho em equipe, comunicação técnica e resolução colaborativa de problemas. A entrega de trabalhos pendentes também foi solicitada nesta aula, reforçando a importância do cumprimento de prazos no desenvolvimento de software.

🎯 **Conceitos-Chave**

* **Desenvolvimento Colaborativo**: Técnica onde diferentes membros da equipe trabalham em partes distintas do código que, posteriormente, são integradas para formar um sistema completo.

* **Compreensão de Código**: Habilidade de analisar e entender código escrito por outras pessoas, identificando sua estrutura, propósito e funcionamento.

* **Integração de Componentes**: Processo de unir diferentes partes de um sistema para criar uma aplicação completa e funcional, respeitando interfaces e dependências.

* **Extensão de Funcionalidades**: Técnica de adicionar novos recursos a um sistema existente sem prejudicar as funcionalidades já implementadas.

* **Relatórios e Métricas**: Funcionalidades que permitem extrair informações consolidadas de um sistema, como estatísticas e indicadores de desempenho.

💻 **Exemplos de Código**

Exemplo 1: Estrutura básica de um sistema de biblioteca (parte do código secreto)

```java
public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;
    private String isbn;
    
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }
    
    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            return true;
        }
        return false;
    }
    
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
    
    // Outros getters e setters...
}
```

**Explicação:** Este código representa uma classe `Livro` que seria parte do sistema completo. Ele demonstra a estrutura básica de uma classe com atributos privados, construtor, métodos de comportamento (emprestar, devolver) e métodos de acesso (getters/setters).

Exemplo 2: Implementação de um relatório (funcionalidade adicional solicitada)

```java
public String gerarRelatorio() {
    int totalLivros = livros.size();
    int livrosEmprestados = 0;
    
    for (Livro livro : livros) {
        if (livro.isEmprestado()) {
            livrosEmprestados++;
        }
    }
    
    double percentualEmprestados = (double) livrosEmprestados / totalLivros * 100;
    
    StringBuilder relatorio = new StringBuilder();
    relatorio.append("=== RELATÓRIO DA BIBLIOTECA ===\n");
    relatorio.append("Total de livros cadastrados: ").append(totalLivros).append("\n");
    relatorio.append("Livros emprestados: ").append(livrosEmprestados);
    relatorio.append(" (").append(String.format("%.1f", percentualEmprestados)).append("%)\n");
    relatorio.append("Total de usuários: ").append(usuarios.size()).append("\n");
    
    return relatorio.toString();
}
```

🔍 **Pontos de Atenção**

⚠️ **Cuidado com:** 
* Integração de código: Certifique-se de que as interfaces entre os diferentes componentes estão bem definidas para evitar problemas de integração
* Controle de versão: Mantenha um controle de versão adequado para evitar conflitos ao integrar código de diferentes desenvolvedores
* Consistência: Mantenha a consistência de estilo e nomenclatura em todo o código, mesmo quando desenvolvido por diferentes pessoas
* Testes: Teste cada componente individualmente antes da integração e depois teste o sistema como um todo
* Documentação: Documente adequadamente as funcionalidades implementadas para facilitar a manutenção futura

🧩 **Exercício Prático**

Implementar as funcionalidades adicionais no sistema de biblioteca conforme solicitado:

```
1. Expandir o sistema para incluir 5 livros e 5 usuários cadastrados.
2. Adicionar uma opção de editar livro no menu principal.
3. Adicionar uma opção de editar usuário no menu principal.
4. Implementar um método para gerar relatório com as seguintes informações:
   - Total de livros cadastrados
   - Quantidade de livros emprestados e seu percentual em relação ao total
   - Número total de usuários cadastrados
```

<details>
<summary>Ver solução</summary>

```java
// Implementação da opção de editar livro no menu principal
public void editarLivro() {
    System.out.println("\n=== EDITAR LIVRO ===");
    
    // Exibir lista de livros para seleção
    listarLivros();
    
    Scanner scanner = new Scanner(System.in);
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

// Implementação do menu principal atualizado
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
    
    scanner.close();
}
```
</details>

📚 **Recursos Adicionais**

* [Melhores práticas para trabalho em equipe com Java](https://www.oracle.com/technical-resources/articles/java/javateam.html)
* [Documentação JavaDoc para documentação de código](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)
* [Padrões de projeto para sistemas orientados a objetos](https://refactoring.guru/design-patterns/java)
* [Ferramentas de controle de versão para desenvolvimento colaborativo](https://git-scm.com/book/en/v2)

📅 **Preparação para Próxima Aula**

Tópicos que serão abordados na próxima aula:
* Abstração, Herança e Polimorfismo
* Aplicação avançada dos princípios de orientação a objetos
* Desenvolvimento de sistemas mais complexos com múltiplas classes relacionadas

Material recomendado para leitura prévia:
* Revisar os conceitos básicos de POO (classes, objetos, métodos)
* Pesquisar sobre os pilares da POO: abstração, encapsulamento, herança e polimorfismo

💬 **Dúvidas Frequentes**

**P: Como garantir a consistência ao integrar código de diferentes desenvolvedores?**
R: Defina padrões de código claros, use ferramentas de controle de versão como Git, realize revisões de código e implemente testes automatizados para verificar a funcionalidade do sistema integrado.

**P: Qual a melhor abordagem para estender um sistema existente?**
R: Primeiro, entenda completamente a estrutura e funcionamento do sistema atual. Depois, identifique pontos de extensão, faça mudanças incrementais, teste cada alteração e mantenha a coesão com o design original.

**P: Como gerenciar as dependências entre diferentes componentes do sistema?**
R: Use interfaces bem definidas entre componentes, aplique princípios de design como baixo acoplamento e alta coesão, e considere padrões de projeto como Injeção de Dependência.

*Esta revisão foi criada para a comunidade de monitoria Java. Compartilhe e estude!*
#java #programacao #monitoria #trabalhoequipe #desenvolvimento
