---
title: Aula 04
tags: [java, programacao, monitoria, poo, classes, objetos]

---

# Métodos, Classes e Objetos
**Data:** 11/03/2025 **Matéria:** Programação Orientada a Objetos **Monitor:** Renan Portela

📝 **Resumo da Aula**

A aula abordou os conceitos fundamentais da programação orientada a objetos em Java, com foco em métodos, classes e objetos. Começamos compreendendo que a classe é a essência de Java e forma a base da programação orientada a objetos, definindo a natureza de um objeto. Dentro de uma classe, são definidos dados (atributos) e o código (métodos) que age sobre eles.

Exploramos a forma como uma classe é construída, como os objetos são instanciados a partir dela usando o operador `new`, e como os construtores inicializam esses objetos. Aprendemos sobre variáveis de referência e como elas se comportam diferentemente de tipos primitivos em operações de atribuição. Por fim, estudamos como os métodos são declarados, como eles podem receber argumentos e retornar valores, e como o ponteiro `this` é utilizado para referenciar o próprio objeto.

🎯 **Conceitos-Chave**

* **Classe**: Um modelo ou plano que define a forma de um objeto, especificando seus atributos (dados) e métodos (comportamentos). Em Java, tudo é encapsulado em classes.

* **Objeto**: Uma instância de uma classe. Enquanto a classe é uma abstração lógica, o objeto é sua representação física na memória, com valores específicos para seus atributos.

* **Construtor**: Método especial que inicializa um objeto quando ele é criado. Tem o mesmo nome da classe, não possui tipo de retorno e é chamado automaticamente quando um objeto é instanciado com `new`.

* **Variáveis de Referência**: Em Java, objetos são manipulados através de referências. Uma variável de objeto contém apenas o endereço do objeto na memória, não o objeto em si.

* **This**: Palavra-chave que representa uma referência ao objeto atual. Útil para diferenciar variáveis de instância de parâmetros com o mesmo nome e para passar o objeto atual como argumento para outros métodos.

💻 **Exemplos de Código**

Exemplo 1: Definição de uma classe com construtor e métodos

```java
public class Produto {
    // Atributos
    private String nome;
    private double preco;
    private int quantidade;
    
    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    // Métodos
    public double calcularValorTotal() {
        return preco * quantidade;
    }
    
    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
    
    public boolean vender(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
    
    public int getQuantidade() {
        return quantidade;
    }
}
```

**Explicação:** Esta classe `Produto` demonstra os conceitos principais de OOP em Java. Ela tem atributos privados (encapsulamento), um construtor para inicialização, métodos que implementam comportamentos específicos, e métodos getters/setters para acesso controlado aos atributos.

Exemplo 2: Criação e uso de objetos

```java
public class TesteProduto {
    public static void main(String[] args) {
        // Instanciando objetos
        Produto arroz = new Produto("Arroz Integral", 8.90, 50);
        Produto feijao = new Produto("Feijão Preto", 6.50, 30);
        
        // Usando métodos
        System.out.println("Produto: " + arroz.getNome());
        System.out.println("Valor total em estoque: R$" + arroz.calcularValorTotal());
        
        // Alterando o estado do objeto
        arroz.adicionarEstoque(10);
        System.out.println("Nova quantidade em estoque: " + arroz.getQuantidade());
        
        // Realizando uma venda
        boolean vendaRealizada = arroz.vender(15);
        if (vendaRealizada) {
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Quantidade restante: " + arroz.getQuantidade());
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
        
        // Demonstrando referências
        Produto arroz2 = arroz;  // arroz2 e arroz referenciam o mesmo objeto
        arroz2.setPreco(9.50);   // altera o preço através de arroz2
        System.out.println("Novo preço do arroz: R$" + arroz.getPreco());  // verifica através de arroz
    }
}
```

🔍 **Pontos de Atenção**

⚠️ **Cuidado com:** 
* **Atribuição de referências**: Quando atribuímos uma variável de objeto a outra (`arroz2 = arroz`), ambas apontam para o mesmo objeto, não criam uma cópia
* **Modificadores de acesso**: Usar `private` para atributos garante encapsulamento, mas exige métodos getters/setters para acesso
* **Construtores sem parâmetros**: Se você definir construtores com parâmetros, o construtor padrão (sem parâmetros) não é mais fornecido automaticamente
* **Retorno em métodos**: Sempre certifique-se de que os métodos com tipo de retorno diferente de `void` retornem um valor compatível
* **Uso do this**: Necessário para diferenciar parâmetros e atributos com mesmo nome, mas opcional em outros casos

🧩 **Exercício Prático**

Crie uma classe Professor com atributos e métodos conforme especificação:

```
Crie uma classe chamada Professor com os seguintes atributos (privados):
- Nome (String)
- Matrícula (String)
- SalarioBase (double)
- Bonus (double)

Implementar os seguintes métodos:
a) Construtor que receba e inicialize nome e matrícula.
b) Métodos de acesso (getters e setters) para todos os atributos.
c) Método CalculaSalarioTotal(): retorna o salário total somando salário base e bônus.
d) Método status(): retorna "Bônus alto" se o bônus for maior ou igual a 1000, senão "Bônus baixo".

Crie também uma classe para testar a implementação, criando ao menos dois objetos diferentes.
```

<details>
<summary>Ver solução</summary>

```java
// Classe Professor
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
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
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
}

// Classe de teste
public class TesteProfessor {
    public static void main(String[] args) {
        // Criando dois professores
        Professor prof1 = new Professor("Carlos Silva", "P12345");
        Professor prof2 = new Professor("Ana Oliveira", "P67890");
        
        // Configurando atributos
        prof1.setSalarioBase(5000.0);
        prof1.setBonus(1200.0);
        
        prof2.setSalarioBase(4500.0);
        prof2.setBonus(800.0);
        
        // Exibindo informações do primeiro professor
        System.out.println("Professor: " + prof1.getNome());
        System.out.println("Matrícula: " + prof1.getMatricula());
        System.out.println("Salário Base: R$" + prof1.getSalarioBase());
        System.out.println("Bônus: R$" + prof1.getBonus());
        System.out.println("Salário Total: R$" + prof1.calcularSalarioTotal());
        System.out.println("Status: " + prof1.status());
        
        System.out.println("\n------------------------\n");
        
        // Exibindo informações do segundo professor
        System.out.println("Professor: " + prof2.getNome());
        System.out.println("Matrícula: " + prof2.getMatricula());
        System.out.println("Salário Base: R$" + prof2.getSalarioBase());
        System.out.println("Bônus: R$" + prof2.getBonus());
        System.out.println("Salário Total: R$" + prof2.calcularSalarioTotal());
        System.out.println("Status: " + prof2.status());
    }
}
```
</details>

📚 **Recursos Adicionais**

* [Documentação oficial Java sobre Classes e Objetos](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
* [Vídeo: Classes e Objetos em Java](https://www.youtube.com/watch?v=n1VZFmjuhqg)
* [Vídeo: Construtores em Java](https://www.youtube.com/watch?v=wOJbwdLmwCA)
* [Vídeo: Métodos Getter e Setter](https://www.youtube.com/watch?v=6i-_R5cAcEc)

📅 **Preparação para Próxima Aula**

Tópicos que serão abordados na próxima aula:
* Trabalho colaborativo em desenvolvimento de aplicações
* Integração de conceitos de classes, métodos e objetos em sistemas maiores
* Entrega e apresentação de projetos

Material recomendado para leitura prévia:
* Revisar os conceitos de classes, métodos e objetos
* Praticar a criação de classes com relacionamentos entre si

💬 **Dúvidas Frequentes**

**P: Qual a diferença entre parâmetros e argumentos em métodos?**
R: Parâmetros são as variáveis declaradas na definição do método, enquanto argumentos são os valores reais passados para o método quando ele é chamado.

**P: Por que devo usar encapsulamento com atributos privados e métodos getters/setters?**
R: O encapsulamento protege os dados, controlando o acesso e validando valores antes de alterar os atributos. Isso aumenta a segurança, manutenibilidade e flexibilidade do código.

**P: O que acontece se eu não definir um construtor para minha classe?**
R: Java fornece automaticamente um construtor padrão (sem parâmetros) que inicializa os atributos com valores padrão. No entanto, se você definir qualquer construtor, o construtor padrão não é mais fornecido automaticamente.

*Esta revisão foi criada para a comunidade de monitoria Java. Compartilhe e estude!*
#java #programacao #monitoria #poo #classes #objetos
