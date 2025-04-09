---
title: Aula 01
tags: [java, programacao, monitoria, fundamentos]

---

# Introdução à Linguagem de Programação Java
**Data:** 12/02/2025 **Matéria:** Fundamentos de Programação Java **Monitor:** Renan Portela.

📝 **Resumo da Aula**

A aula introdutória abordou os fundamentos da linguagem Java, começando com uma contextualização sobre paradigmas de programação e posicionando Java como uma linguagem principalmente orientada a objetos. Exploramos o desenvolvimento histórico da linguagem, desde sua origem na Sun Microsystems em 1995 até sua ampla adoção mundial, impulsionada por suas características como portabilidade, orientação a objetos e segurança.

Foram apresentadas as principais características técnicas do Java, incluindo sua arquitetura baseada em JVM (Java Virtual Machine), que permite a execução de código em diferentes plataformas ("write once, run anywhere"), e o gerenciamento automático de memória (Garbage Collection). Também discutimos as três plataformas Java (J2SE, J2EE, J2ME), os tipos de dados primitivos e por referência, e os fundamentos de programação como declaração de variáveis, operadores e estruturas de controle de fluxo.

🎯 **Conceitos-Chave**

* **Paradigmas de Programação**: Abordagens diferentes para solucionar problemas através de código. Java suporta principalmente o paradigma orientado a objetos, mas também incorpora elementos de outros paradigmas como o imperativo, estruturado e concorrente (via threads).

* **Java Virtual Machine (JVM)**: Componente central da arquitetura Java que permite a portabilidade do código. Os programas Java são compilados para bytecode, que é executado pela JVM específica de cada plataforma, garantindo que o mesmo código funcione em diferentes sistemas operacionais.

* **Garbage Collection**: Sistema automático de gerenciamento de memória que monitora os objetos criados e libera a memória ocupada por aqueles que não estão mais sendo referenciados, eliminando a necessidade de desalocação manual.

* **Tipos de Dados**: Java é uma linguagem fortemente tipada com dois grupos principais de tipos:
  - Primitivos: byte, short, int, long, float, double, char, boolean
  - Por referência: classes, interfaces e arrays

* **Modificadores de Acesso**: Controlam a visibilidade e acessibilidade de classes, métodos e atributos:
  - public: acessível de qualquer lugar
  - private: acessível apenas dentro da própria classe
  - protected: acessível na própria classe, em classes do mesmo pacote e em subclasses
  - default (sem modificador): acessível apenas no mesmo pacote

💻 **Exemplos de Código**

Exemplo 1: Estrutura básica de uma classe Java

```java
public class OlaMundo {
    // Método principal - ponto de entrada do programa
    public static void main(String[] args) {
        // Imprime uma mensagem na tela
        System.out.println("Olá, Mundo!");

        // Declaração e inicialização de variáveis
        int numero = 10;
        String mensagem = "Bem-vindo ao Java!";

        // Utilizando variáveis em saídas
        System.out.println(mensagem);
        System.out.println("O número é: " + numero);
    }
}
```

**Explicação:** Este código ilustra a estrutura fundamental de um programa Java, com a declaração da classe, o método `main` (ponto de entrada obrigatório), exemplos de declaração de variáveis de diferentes tipos e uso do método `System.out.println()` para exibir informações no console.

Exemplo 2: Operadores e estruturas de controle

```java
public class EstruturaControle {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = 5;

        // Operadores aritméticos
        int soma = a + b;        // 15
        int subtracao = a - b;   // 5
        int multiplicacao = a * b; // 50
        int divisao = a / b;     // 2

        // Estrutura condicional
        if (a > b) {
            System.out.println("a é maior que b");
        } else if (a < b) {
            System.out.println("a é menor que b");
        } else {
            System.out.println("a é igual a b");
        }

        // Estrutura de repetição
        System.out.println("Contagem regressiva:");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}
```

🔍 **Pontos de Atenção**

⚠️ **Cuidado com:** 
* Java é case-sensitive: `nome` e `Nome` são identificadores diferentes
* Todo comando termina com ponto e vírgula (`;`)
* Os blocos de código são delimitados por chaves `{ }`
* A classe deve ter o mesmo nome do arquivo que a contém (com a extensão .java)
* Nomes de classes começam com letra maiúscula (convenção)
* Nomes de variáveis e métodos começam com letra minúscula (convenção)
* Java é fortemente tipado, o que significa que o tipo de uma variável não pode mudar durante a execução

🧩 **Exercício Prático**

Crie uma classe em Java que demonstre o uso de tipos primitivos e operadores:

```
Desenvolva um programa Java que:
1\. Declare variáveis para cada um dos tipos primitivos (byte, short, int, long, float, double, char, boolean)
2\. Atribua valores a estas variáveis
3\. Realize operações aritméticas básicas (soma, subtração, multiplicação, divisão)
4\. Demonstre o uso de operadores de incremento/decremento (++, --)
5\. Exiba todos os resultados no console com descrições apropriadas
```

<details>
<summary>Ver solução</summary>

```java
public class TiposPrimitivosOperadores {
    public static void main(String[] args) {
        // Declaração e inicialização de tipos primitivos
        byte b = 10;
        short s = 20000;
        int i = 1000000;
        long l = 9223372036854775807L;  // Note o sufixo L
        float f = 3.14f;                // Note o sufixo f
        double d = 3.141592653589793;
        char c = 'A';
        boolean bool = true;

        // Exibindo os valores
        System.out.println("=== TIPOS PRIMITIVOS ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // Operações aritméticas
        System.out.println("\n=== OPERAÇÕES ARITMÉTICAS ===");
        int a1 = 20, a2 = 5;
        System.out.println("a1 = " + a1 + ", a2 = " + a2);
        System.out.println("Soma: " + (a1 + a2));
        System.out.println("Subtração: " + (a1 - a2));
        System.out.println("Multiplicação: " + (a1 * a2));
        System.out.println("Divisão: " + (a1 / a2));
        System.out.println("Resto: " + (a1 % a2));

        // Incremento e decremento
        System.out.println("\n=== INCREMENTO/DECREMENTO ===");
        int x = 10;
        System.out.println("x = " + x);

        System.out.println("Pós-incremento (x++): " + x++); // Mostra 10, depois incrementa
        System.out.println("Após pós-incremento: " + x);    // Mostra 11

        System.out.println("Pré-incremento (++x): " + ++x); // Incrementa, depois mostra 12
        System.out.println("Após pré-incremento: " + x);    // Mostra 12

        System.out.println("Pós-decremento (x--): " + x--); // Mostra 12, depois decrementa
        System.out.println("Após pós-decremento: " + x);    // Mostra 11

        System.out.println("Pré-decremento (--x): " + --x); // Decrementa, depois mostra 10
        System.out.println("Após pré-decremento: " + x);    // Mostra 10
    }
}
```
</details>

📚 **Recursos Adicionais**

* [Java SE Downloads](https://www.java.com/en/download/manual.jsp) - Download oficial da JDK
* [Eclipse IDE](https://www.eclipse.org/downloads/packages/) - IDE recomendada para desenvolvimento em Java
* [Tutorial de instalação do Eclipse](https://www.youtube.com/watch?v=rIVGy49m_70) - Vídeo tutorial para instalação
* [Documentação oficial do Java](https://docs.oracle.com/en/java/) - Referência completa da linguagem
* "Java para Iniciantes" por Herbert Schildt - Livro recomendado na aula, especialmente capítulos 1, 2 e 3

📅 **Preparação para Próxima Aula**

Tópicos que serão abordados na próxima aula:
* Instruções de controle de programa em Java
* Comandos de entrada e saída
* Instalação e configuração do Eclipse IDE
* Resolução de exercícios práticos

Material recomendado para leitura prévia:
* Capítulos 1, 2 e 3 do livro "Java para Iniciantes" de Herbert Schildt
* Instalação da JVM, Java SE e Eclipse IDE em sua máquina

💬 **Dúvidas Frequentes**

**P: O que significa "Java é uma linguagem fortemente tipada"?**
R: Significa que todas as variáveis devem ter um tipo definido explicitamente na declaração, e esse tipo não pode mudar durante a execução do programa. Isso ajuda a prevenir erros de tipo durante a compilação.

**P: Qual a diferença entre variáveis primitivas e de referência em Java?**
R: Variáveis de tipos primitivos (int, float, etc.) armazenam diretamente valores na memória stack, enquanto variáveis de referência armazenam endereços para objetos que estão na memória heap. Quando atribuímos um valor primitivo a outra variável, o valor é copiado; quando atribuímos uma referência, ambas as variáveis apontam para o mesmo objeto.

**P: O que é e como funciona o Garbage Collector?**
R: O Garbage Collector é um processo que monitora automaticamente a memória do programa, identificando objetos que não estão mais sendo referenciados e liberando o espaço que ocupam. Isso elimina a necessidade de gerenciar manualmente a memória, como ocorre em linguagens como C/C++, e ajuda a prevenir vazamentos de memória.

**P: Por que o Java é considerado "write once, run anywhere"?**
R: Porque os programas Java são compilados para bytecode, que é independente de plataforma e pode ser executado em qualquer dispositivo que possua uma JVM (Java Virtual Machine) adequada. A JVM atua como uma camada intermediária entre o programa e o sistema operacional, permitindo a portabilidade do código.

*Esta revisão foi criada para a comunidade de monitoria Java. Compartilhe e estude!*
#java #programacao #monitoria #fundamentos</pre>
