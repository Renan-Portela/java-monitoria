---
title: Aula 02
tags: [java, programacao, monitoria]

---

# Instruções de Controle de Programa

**Data:** 19/02/2025 **Matéria:** Fundamentos de Programação Java **Monitor:** Renan Portela

📝 **Resumo da Aula**

A aula focou nas instruções de controle de programa em Java, com ênfase na configuração inicial do ambiente de desenvolvimento e nos comandos básicos de entrada e saída. Começamos com um diagnóstico baseado nos capítulos 1 e 2 do livro "Java para iniciantes", seguido pela instalação e configuração da IDE Eclipse.

Exploramos em detalhes os comandos de saída em Java, como println(), print() e printf(), que são essenciais para exibir informações ao usuário. Também abordamos a classe Scanner, que permite a entrada de dados pelo usuário através do teclado, com seus diversos métodos para capturar diferentes tipos de dados (strings, números inteiros, números decimais, etc.).

🎯 **Conceitos-Chave**

* **IDE Eclipse**: Ambiente de desenvolvimento integrado utilizado para escrever, compilar e depurar códigos Java, facilitando o desenvolvimento de aplicações.

* **Comandos de Saída**: Métodos como System.out.println(), System.out.print() e System.out.printf() que permitem exibir informações na tela.
  - println(): Imprime o conteúdo e pula uma linha
  - print(): Imprime o conteúdo sem pular linha
  - printf(): Permite formatação avançada de saída

* **Classe Scanner**: Implementa operações de entrada de dados pelo teclado, disponível no pacote java.util desde o Java 5.0.
  - next(): Retorna uma string simples (sem espaços)
  - nextLine(): Retorna uma string completa (com espaços)
  - nextInt(): Retorna um número inteiro
  - nextDouble(): Retorna um número decimal
  - nextLong(): Retorna um número inteiro longo

💻 **Exemplos de Código**

Exemplo 1: Comandos de saída com printf()

```java
public class ExemploSaida {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 25;
        double altura = 1.68;
        
        // Usando printf para formatação
        System.out.printf("Nome: %s, Idade: %d anos, Altura: %.2f metros\n", 
                          nome, idade, altura);
    }
}
```

**Explicação:** O método printf() permite formatação avançada usando especificadores de formato como %s (string), %d (inteiro) e %.2f (número decimal com 2 casas). A formatação facilita a exibição de dados de forma organizada e legível.

Exemplo 2: Entrada de dados com Scanner

```java
import java.util.Scanner;

public class ExemploEntrada {
    public static void main(String[] args) {
        // Criar um objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar e ler uma string
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        // Solicitar e ler um número inteiro
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        // Exibir os dados lidos
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        
        // Fechar o Scanner
        entrada.close();
    }
}
```

🔍 **Pontos de Atenção**

⚠️ **Cuidado com:** 

* Não esquecer de importar a classe Scanner com `import java.util.Scanner;`
* Fechar o Scanner após o uso com o método `close()` para evitar vazamento de recursos
* Problemas ao misturar nextLine() com outros métodos next() - pode ser necessário um nextLine() adicional
* Assegurar que o usuário fornece o tipo de dado esperado para evitar exceções de entrada

🧩 **Exercício Prático**

Crie um programa Java que calcule a média de três notas fornecidas pelo usuário:

```
Desenvolva um programa que solicite ao usuário que insira três notas (valores decimais).
O programa deve calcular a média das notas e exibir o resultado formatado com duas casas decimais.
Além disso, o programa deve indicar se o aluno foi aprovado (média >= 7.0) ou reprovado.
```

<details>
<summary>Ver solução</summary>


```java
import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar as três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();
        
        // Calcular a média
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Exibir o resultado formatado
        System.out.printf("Média: %.2f\n", media);
        
        // Verificar se o aluno foi aprovado ou reprovado
        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
        
        entrada.close();
    }
}
```

</details>

📚 **Recursos Adicionais**

* [Documentação oficial da classe Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
* [DevMedia: Como ler e apresentar dados com os comandos de entrada e saída](https://www.devmedia.com.br/java-como-ler-e-apresentar-dados-com-os-comandos-de-entrada-e-saida/22266)
* [Tutorial Eclipse](https://www.devmedia.com.br/conhecendo-o-eclipse-uma-apresentacao-detalhada-da-ide/25589)
* [Vídeo tutorial sobre entrada e saída em Java](https://www.youtube.com/watch?v=0pjdxpI3WSs)

📅 **Preparação para Próxima Aula**

Tópicos que serão abordados na próxima aula:

* Estruturas de dados em Java
* Manipulação de Strings
* Arrays e suas operações

Material recomendado para leitura prévia:

* Capítulo 4 do livro "Java para Iniciantes"

💬 **Dúvidas Frequentes**

**P: Por que devo usar Scanner em vez de outros métodos de entrada?**
R: A classe Scanner oferece métodos convenientes para ler e converter vários tipos de dados (int, double, String), enquanto fornece tratamento de erros básico e facilidade de uso.

**P: Qual a diferença entre next() e nextLine() no Scanner?**
R: O método next() lê apenas até encontrar um espaço em branco, enquanto o nextLine() lê toda a linha até encontrar um caractere de nova linha (Enter).

**P: É possível formatar números decimais sem usar printf()?**
R: Sim, você pode usar a classe DecimalFormat ou o método String.format() para formatar números decimais.

*Esta revisão foi criada para a comunidade de monitoria Java. Compartilhe e estude!*
#java #programacao #monitoria
