---
title: Aula 07
tags: [java, programacao, monitoria, poo, interfaces, excecoes, composicao, agregacao]

---

# Comandos Avançados em Java
**Data:** 09/04/2025 **Matéria:** Programação Orientada a Objetos **Monitor:** Renan Portela

📝 **Resumo da Aula**

A aula abordou estruturas avançadas comumente utilizadas em Java, expandindo os conceitos fundamentais de POO já estudados anteriormente. Foram explorados quatro tópicos principais: Interfaces, Tratamento de Exceções, Composição e Agregação. 

As interfaces foram apresentadas como uma forma de obter abstração em Java, permitindo definir comportamentos sem implementação que podem ser adotados por diferentes classes. O tratamento de exceções foi abordado com os blocos try-catch-finally, que permitem lidar com erros de forma elegante e garantir a execução de código crítico. A palavra-chave throw foi introduzida para permitir o lançamento de exceções personalizadas. Por fim, discutimos as relações de composição e agregação entre classes, que são alternativas à herança para reutilização de código e organização de sistemas.

Essa aula complementa os pilares da POO vistos anteriormente (abstração, encapsulamento, herança e polimorfismo), adicionando ferramentas importantes para criar sistemas robustos e bem estruturados em Java.

🎯 **Conceitos-Chave**

* **Interfaces**: Uma "classe abstrata completamente abstrata" usada para agrupar métodos relacionados com corpos vazios. Diferente das classes abstratas, as interfaces não podem conter implementações de métodos (exceto métodos default desde Java 8) e uma classe pode implementar múltiplas interfaces.

* **Tratamento de Exceções**: Mecanismo para lidar com erros durante a execução do programa, permitindo que o programa continue executando mesmo após encontrar situações inesperadas.
  * **try-catch**: O bloco try permite testar um trecho de código que pode gerar erros; o bloco catch captura e trata esses erros.
  * **finally**: Bloco que executa código independentemente de ocorrer uma exceção ou não.
  * **throw**: Palavra-chave que permite lançar exceções explicitamente.

* **Composição e Agregação**: Relações "tem um" entre classes, onde uma classe contém uma instância de outra classe como atributo.
  * **Composição**: Relação forte onde o objeto contido não existe independentemente do objeto que o contém (ex: Pergunta e Opções).
  * **Agregação**: Relação fraca onde o objeto contido pode existir independentemente do objeto que o contém (ex: Carro e Motor).

💻 **Exemplos de Código**

Exemplo 1: Definição e implementação de interface

```java
// Definição da interface
public interface MetodoPagamento {
    // Método da interface (sem implementação)
    public void pagar(double valor);
}

// Implementação da interface
public class Cartao implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via cartão.");
    }
}

// Outra implementação da interface
public class Pix implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }
}

// Uso em uma classe principal
public class Main {
    public static void main(String[] args) {
        MetodoPagamento pagamento1 = new Cartao();
        MetodoPagamento pagamento2 = new Pix();
        
        pagamento1.pagar(150.0); // Executa implementação da classe Cartao
        pagamento2.pagar(150.0); // Executa implementação da classe Pix
    }
}
```

Exemplo 2: Tratamento de exceções com try-catch-finally

```java
public class TratamentoExcecao {
    public static void main(String[] args) {
        try {
            // Código que pode gerar exceção
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]); // Tenta acessar índice inexistente
        } catch (ArrayIndexOutOfBoundsException e) {
            // Tratamento da exceção
            System.out.println("Erro: tentativa de acessar posição inválida no array.");
            System.out.println("Mensagem de erro: " + e.getMessage());
        } finally {
            // Este bloco sempre será executado
            System.out.println("Bloco 'try-catch' finalizado.");
        }
        
        // O programa continua sua execução
        System.out.println("Programa continua executando normalmente.");
    }
}
```

Exemplo 3: Lançamento de exceções com throw

```java
public class VerificadorIdade {
    static void verificarIdade(int idade) {
        if (idade < 18) {
            // Lança uma exceção explicitamente
            throw new ArithmeticException("Acesso negado - somente 18+.");
        } else {
            System.out.println("Acesso concedido - idade suficiente.");
        }
    }
    
    public static void main(String[] args) {
        try {
            verificarIdade(15); // Vai lançar exceção
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        try {
            verificarIdade(20); // Não vai lançar exceção
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
```

Exemplo 4: Composição em Java

```java
// Classe componente
public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    
    public Endereco(String rua, int numero, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    // Getters e setters omitidos para brevidade
    @Override
    public String toString() {
        return rua + ", " + numero + " - " + cidade + "/" + estado;
    }
}

// Classe composta
public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco; // Composição: uma Pessoa tem um Endereco
    
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }
}

// Uso
public class ExemploComposicao {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", 123, "São Paulo", "SP");
        Pessoa pessoa = new Pessoa("João Silva", 30, endereco);
        
        pessoa.exibirInformacoes();
    }
}
```

🔍 **Pontos de Atenção**

⚠️ **Cuidado com:** 

* **Interfaces vs Classes Abstratas:**
  * Interfaces não podem ter implementações de métodos (exceto default methods desde Java 8).
  * Interfaces não podem conter construtores, enquanto classes abstratas podem.
  * Uma classe pode implementar múltiplas interfaces, mas só pode estender uma única classe abstrata.

* **Tratamento de Exceções:**
  * Evite blocos try com código extenso; tente isolar apenas o código que pode gerar exceções.
  * Seja específico nas exceções capturadas em vez de usar a classe genérica Exception.
  * Lembre-se que o bloco finally é sempre executado, mesmo se houver return dentro do try ou catch.

* **Composição vs Herança:**
  * Prefira composição quando a relação não for claramente "é um".
  * A composição oferece maior flexibilidade e menor acoplamento que a herança.
  * Use a composição para evitar hierarquias de herança muito profundas.

* **Múltiplas Interfaces:**
  * Ao implementar múltiplas interfaces com métodos de mesmo nome, certifique-se de que a implementação atende aos requisitos de todas as interfaces.

🧩 **Exercício Prático**

Desenvolva um sistema para gerenciar disciplinas de alunos usando composição:

```
1. Crie uma classe Disciplina com:
   - Atributos: nome (String) e código (String)
   - Construtor que receba os dois atributos
   - Getters e setters apropriados

2. Crie uma classe Aluno com:
   - Atributos: nome (String) e um array de disciplinas
   - Construtor que receba o nome e inicialize o array
   - Métodos:
     * adicionarDisciplina(Disciplina d)
     * removerDisciplina(String nome)
     * listarDisciplinas()
   - Getters e setters apropriados

3. Crie uma classe Main que:
   - Instancie um objeto Aluno
   - Instancie pelo menos dois objetos Disciplina
   - Adicione as disciplinas ao aluno
   - Liste as disciplinas do aluno
   - Remova uma disciplina
   - Liste novamente as disciplinas para confirmar a remoção
```

<details>
<summary>Ver solução</summary>

```java
// Classe Disciplina
public class Disciplina {
    private String nome;
    private String codigo;
    
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

// Classe Aluno
public class Aluno {
    private String nome;
    private Disciplina[] disciplinas;
    private int quantidadeDisciplinas;
    private final int MAX_DISCIPLINAS = 10; // Limite de disciplinas
    
    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new Disciplina[MAX_DISCIPLINAS];
        this.quantidadeDisciplinas = 0;
    }
    
    // Adicionar disciplina
    public void adicionarDisciplina(Disciplina d) {
        if (quantidadeDisciplinas < MAX_DISCIPLINAS) {
            disciplinas[quantidadeDisciplinas] = d;
            quantidadeDisciplinas++;
            System.out.println("Disciplina " + d.getNome() + " adicionada com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais disciplinas. Limite atingido!");
        }
    }
    
    // Remover disciplina pelo nome
    public void removerDisciplina(String nome) {
        boolean encontrada = false;
        
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            if (disciplinas[i].getNome().equals(nome)) {
                encontrada = true;
                
                // Deslocar todas as disciplinas uma posição para trás
                for (int j = i; j < quantidadeDisciplinas - 1; j++) {
                    disciplinas[j] = disciplinas[j + 1];
                }
                
                disciplinas[quantidadeDisciplinas - 1] = null;
                quantidadeDisciplinas--;
                System.out.println("Disciplina " + nome + " removida com sucesso!");
                break;
            }
        }
        
        if (!encontrada) {
            System.out.println("Disciplina " + nome + " não encontrada!");
        }
    }
    
    // Listar disciplinas
    public void listarDisciplinas() {
        System.out.println("\n=== DISCIPLINAS DE " + nome.toUpperCase() + " ===");
        
        if (quantidadeDisciplinas == 0) {
            System.out.println("Nenhuma disciplina cadastrada.");
        } else {
            for (int i = 0; i < quantidadeDisciplinas; i++) {
                System.out.println((i+1) + ". " + disciplinas[i]);
            }
        }
        System.out.println("===========================");
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        // Criar um aluno
        Aluno aluno = new Aluno("Carlos Silva");
        
        // Criar disciplinas
        Disciplina java = new Disciplina("Programação Java", "PROG001");
        Disciplina banco = new Disciplina("Banco de Dados", "BD002");
        Disciplina redes = new Disciplina("Redes de Computadores", "REDES003");
        
        // Adicionar disciplinas ao aluno
        aluno.adicionarDisciplina(java);
        aluno.adicionarDisciplina(banco);
        aluno.adicionarDisciplina(redes);
        
        // Listar disciplinas
        aluno.listarDisciplinas();
        
        // Remover uma disciplina
        aluno.removerDisciplina("Banco de Dados");
        
        // Listar disciplinas novamente
        aluno.listarDisciplinas();
    }
}
```
</details>

📚 **Recursos Adicionais**

* [Documentação oficial Java sobre Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
* [Tratamento de Exceções em Java](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)
* [Vídeo: Entendendo Interfaces em Java](https://www.youtube.com/watch?v=6uLLfRNgRA4)
* [Vídeo: Tratamento de Exceções em Java](https://www.youtube.com/watch?v=ld2C4GcAtsg)
* [Artigo: Composição vs Herança em Java](https://www.baeldung.com/java-inheritance-composition)
* [Tutorial: Trabalhando com Exceções em Java](https://www.w3schools.com/java/java_try_catch.asp)

📅 **Preparação para Próxima Aula**

Tópicos que serão abordados na próxima aula:
* Collections Framework em Java
* ArrayList, LinkedList, HashMap e HashSet
* Manipulação de coleções de objetos
* Generics em Java

Material recomendado para leitura prévia:
* Revisar os conceitos de arrays em Java
* Pesquisar sobre a interface Collection e suas principais implementações
* Concluir o exercício prático do sistema de alunos e disciplinas

💬 **Dúvidas Frequentes**

**P: Qual a principal diferença entre interfaces e classes abstratas?**
R: Classes abstratas podem ter métodos implementados e não implementados, enquanto interfaces tradicionalmente só têm métodos não implementados (sem corpo). Além disso, uma classe pode implementar múltiplas interfaces, mas só pode estender uma única classe abstrata.

**P: Por que usar try-catch em vez de simplesmente deixar o programa falhar?**
R: O tratamento de exceções permite que o programa continue executando mesmo após encontrar um erro, oferecendo a possibilidade de recuperação ou pelo menos de encerramento gracioso. Também permite fornecer mensagens de erro mais amigáveis ao usuário.

**P: Quando devo usar throw e throws?**
R: Use `throw` para lançar explicitamente uma exceção em seu código quando uma condição inválida é detectada. Use `throws` na assinatura do método para indicar que ele pode lançar uma exceção que deve ser tratada por quem o chamar.

**P: Quando devo preferir composição em vez de herança?**
R: Prefira composição quando a relação não for claramente "é um" (herança), mas sim "tem um" (composição). A composição é mais flexível, permite mudar comportamentos em tempo de execução e evita os problemas de acoplamento forte da herança.

*Esta revisão foi criada para a comunidade de monitoria Java. Compartilhe e estude!*
#java #programacao #monitoria #poo #interfaces #excecoes #composicao #agregacao
