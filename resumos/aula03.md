---
title: Aula 03
tags: [java, programacao, monitoria, strings, arrays]

---

# String e Arrays
**Data:** 26/02/2025 **Matéria:** Programação Orientada a Objetos **Monitor:** Renan Portela

📝 **Resumo da Aula**

A aula abordou dois componentes fundamentais da programação em Java: Strings e Arrays. Strings são elementos essenciais que permitem a manipulação e o processamento de texto, representando sequências de caracteres para armazenar informações como nomes, mensagens e outros dados textuais. A classe String em Java oferece diversos métodos para operações como concatenação, extração, substituição e transformação.

Arrays, por sua vez, são estruturas de dados que possibilitam armazenar múltiplos valores do mesmo tipo em uma única variável, sendo cruciais para organizar conjuntos de dados e acessá-los eficientemente por meio de índices. Exploramos tanto arrays unidimensionais quanto multidimensionais (matrizes), permitindo a organização de informações em estruturas simples ou mais complexas.

🎯 **Conceitos-Chave**

* **Strings em Java**: Sequências imutáveis de caracteres utilizadas para manipular texto. A imutabilidade garante que, uma vez criada, uma string não pode ser modificada.

* **Manipulação de Strings**: Conjunto de métodos disponíveis na classe String para operações como:
  - length(): Retorna o tamanho da string
  - toUpperCase()/toLowerCase(): Converte para maiúsculas/minúsculas
  - charAt(): Retorna o caractere em uma posição específica
  - substring(): Extrai parte da string
  - replace(): Substitui caracteres ou substrings
  - contains(), startsWith(), endsWith(): Verificam substrings

* **Arrays**: Estruturas de dados para armazenar múltiplos valores do mesmo tipo em uma única variável, com tamanho fixo definido na criação.

* **Arrays Multidimensionais**: Arrays de arrays, permitindo estruturas como matrizes bidimensionais (tabelas) ou estruturas ainda mais complexas.

💻 **Exemplos de Código**

Exemplo 1: Manipulação de Strings

```java
public class ExemploString {
    public static void main(String[] args) {
        // Declaração e inicialização
        String nome = "Gabriel";
        String sobrenome = "Silva";
        
        // Concatenação
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);
        
        // Métodos de manipulação
        System.out.println("Tamanho: " + nomeCompleto.length());
        System.out.println("Maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Primeira letra: " + nomeCompleto.charAt(0));
        System.out.println("Sobrenome: " + nomeCompleto.substring(8));
        
        // Verificação e substituição
        System.out.println("Contém 'Silva'? " + nomeCompleto.contains("Silva"));
        String novoNome = nomeCompleto.replace("Silva", "Oliveira");
        System.out.println("Nome alterado: " + novoNome);
    }
}
```

**Explicação:** Este exemplo demonstra as operações básicas com strings, incluindo concatenação, obtenção de tamanho, conversão para maiúsculas, extração de caracteres e substrings, verificação de conteúdo e substituição.

Exemplo 2: Declaração e manipulação de Arrays

```java
public class ExemploArrays {
    public static void main(String[] args) {
        // Declaração e inicialização de arrays
        int[] numeros = new int[5]; // Array vazio com 5 posições
        double[] precos = {10.5, 20.0, 30.75}; // Inicialização direta
        
        // Atribuindo valores ao array de números
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        
        // Iterando e exibindo os valores
        System.out.println("Números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        
        // Encontrando o maior valor no array
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Maior valor: " + maior);
        
        // Array bidimensional (matriz)
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // Percorrendo e exibindo a matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

🔍 **Pontos de Atenção**

⚠️ **Cuidado com:** 
* **Imutabilidade das Strings**: Operações em strings sempre criam novas strings, não modificam a original
* **Comparação de Strings**: Use equals() em vez de == para comparar o conteúdo de strings
* **Índices de Arrays**: Começam em 0 e vão até length-1; acessar um índice fora deste intervalo causa ArrayIndexOutOfBoundsException
* **Tamanho fixo**: Arrays têm tamanho fixo após a criação; para tamanhos dinâmicos, use estruturas como ArrayList
* **Conversão String-Array**: Use split() para converter strings em arrays e join() para converter arrays em strings

🧩 **Exercício Prático**

Desenvolva um programa que simule um sorteio entre 5 pessoas:

```
Crie um programa que solicite ao usuário o nome de 5 pessoas e armazene em um array.
Em seguida, o programa deve realizar um sorteio aleatório (usando Math.random())
para determinar o vencedor e exibir o resultado.
```

<details>
<summary>Ver solução</summary>

```java
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        
        // Solicitar e armazenar os nomes
        System.out.println("Digite o nome de 5 pessoas para o sorteio:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Pessoa " + (i+1) + ": ");
            nomes[i] = entrada.nextLine();
        }
        
        // Realizar o sorteio
        int sorteado = (int) (Math.random() * 5); // Gera número entre 0 e 4
        
        // Exibir o resultado
        System.out.println("\n🎉 RESULTADO DO SORTEIO 🎉");
        System.out.println("O vencedor é: " + nomes[sorteado] + "!");
        
        entrada.close();
    }
}
```
</details>

📚 **Recursos Adicionais**

* [Documentação oficial da classe String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
* [Vídeo sobre String em Java](https://www.youtube.com/watch?v=nW1a1Ku9TdU)
* [Vídeo sobre Arrays em Java](https://www.youtube.com/watch?v=poDFFYkp6g4)
* [Material complementar sobre Arrays e Strings](https://www.inf.ufpr.br/andrey/ci062/TapAula03.pdf)

📅 **Preparação para Próxima Aula**

Tópicos que serão abordados na próxima aula:
* Métodos em Java
* Classes e Objetos
* Construtores
* Encapsulamento

Material recomendado para leitura prévia:
* Estudar os conceitos de programação orientada a objetos
* Revisar o material sobre classes e métodos

💬 **Dúvidas Frequentes**

**P: Qual a diferença entre String e StringBuilder?**
R: String é imutável - cada operação cria um novo objeto. StringBuilder é mutável - permite modificações eficientes em uma mesma instância, sendo mais performático para múltiplas operações de concatenação.

**P: Posso redimensionar um array depois de criá-lo?**
R: Não diretamente. Arrays em Java têm tamanho fixo. Para "redimensionar", você precisa criar um novo array com o tamanho desejado e copiar os elementos do array original para o novo.

**P: Como verificar se duas strings têm o mesmo conteúdo?**
R: Use o método equals() ou equalsIgnoreCase() (para ignorar diferenças entre maiúsculas e minúsculas), não o operador ==, que compara referências, não conteúdo.

*Esta revisão foi criada para a comunidade de monitoria Java. Compartilhe e estude!*
#java #programacao #monitoria #strings #arrays
