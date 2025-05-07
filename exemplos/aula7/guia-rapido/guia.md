# 🚀 Guia Rápido: Comandos Avançados em Java (Aula 7)

## Principais Conceitos em 1 Minuto

- **Interfaces**: Contratos que definem métodos sem implementação (`interface Animal { void fazerSom(); }`)
- **Try-Catch**: Blocos para tratar erros (`try { codigo(); } catch(Exception e) { tratarErro(); }`)
- **Finally**: Bloco que sempre executa após try-catch (`finally { limparRecursos(); }`)
- **Throw**: Lança exceções manualmente (`if(valor < 0) throw new Exception("Valor inválido");`)
- **Composição**: Relação "tem um" forte entre classes (`class Carro { Motor motor; }`)
- **Agregação**: Relação "tem um" fraca entre classes (`class Universidade { Aluno[] alunos; }`)

## Comparações Rápidas

| Conceito               | Comparação Simples                                           |
|------------------------|--------------------------------------------------------------|
| **Interface vs. Classe Abstrata** | Interface: apenas "o quê" / Classe abstrata: "o quê" e "como" |
| **Herança vs. Composição** | Herança: "é um" / Composição: "tem um"                     |
| **Checked vs. Unchecked Exception** | Checked: compilador exige tratamento / Unchecked: não exige |

## Sintaxe Essencial

### Interface
```java
public interface Pagavel {
    void pagar(double valor);  // Sem implementação
}

// Implementando a interface
public class Fatura implements Pagavel {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando fatura: R$" + valor);
    }
}
```

### Try-Catch-Finally
```java
try {
    // Código que pode lançar exceção
    int resultado = 10 / 0;  // Vai gerar ArithmeticException
} catch (ArithmeticException e) {
    // Tratamento específico
    System.out.println("Erro de divisão: " + e.getMessage());
} catch (Exception e) {
    // Tratamento genérico para outras exceções
    System.out.println("Erro genérico: " + e.getMessage());
} finally {
    // Sempre executa, com ou sem exceção
    System.out.println("Operação finalizada.");
}
```

### Throw e Throws
```java
// Lançando exceção
public void sacar(double valor) {
    if (valor <= 0) {
        throw new IllegalArgumentException("Valor deve ser positivo");
    }
    // resto do código
}

// Declarando que um método pode lançar exceção
public void lerArquivo() throws IOException {
    // código que pode lançar IOException
}
```

### Composição
```java
// Exemplo de composição
public class Motor {
    private int potencia;
    // outros atributos e métodos
}

public class Carro {
    private Motor motor;  // Composição: Carro tem um Motor
    
    public Carro() {
        this.motor = new Motor(); // O motor é criado junto com o carro
    }
}
```

## Dicas para a Prova

1. **Interfaces**: Lembre-se que métodos em interfaces são implicitamente `public abstract` e atributos são implicitamente `public static final`.

2. **Exceções**: Memorize a hierarquia básica: `Throwable` → `Exception` → `RuntimeException`.

3. **Try-Catch**: Lembre-se que exceções mais específicas devem vir antes das mais genéricas nos blocos catch.

4. **Finally**: O bloco finally sempre executa, mesmo com return dentro do try ou catch.

5. **Composição vs. Agregação**: Na composição, o objeto contido não existe sem o objeto que o contém; na agregação, o objeto contido pode existir independentemente.

## Exemplos do Mundo Real

- **Interfaces**: `Comparable` para objetos que podem ser ordenados, `Runnable` para threads.
- **Try-Catch**: Leitura de arquivos, conexões de rede, operações de banco de dados.
- **Composição**: Um `Email` contém um `Remetente`, um `Destinatário` e uma `Mensagem`.
- **Aggregação**: Uma `Universidade` tem vários `Departamentos`, mas os departamentos podem existir independentemente.

## Erros Comuns a Evitar

- Não confundir interfaces com classes abstratas
- Não esquecer de fechar recursos (conexões, arquivos) no bloco finally
- Não capturar exceções genéricas quando é possível ser mais específico
- Não usar herança quando composição seria mais adequada
- Não implementar interfaces desnecessariamente
