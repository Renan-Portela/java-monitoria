---
title: Aula 06
tags: [java, programacao, monitoria, poo, abstração, herança, polimorfismo]

---

# Abstração, Herança e Polimorfismo
**Data:** 02/04/2025 **Matéria:** Programação Orientada a Objetos **Monitor:** Renan Portela

📝 **Resumo da Aula**

A aula abordou três dos quatro pilares fundamentais da Programação Orientada a Objetos (POO): Abstração, Herança e Polimorfismo, com uma breve retomada do conceito de Encapsulamento. Estes pilares são essenciais para o desenvolvimento de sistemas robustos, seguros e modulares, formando a base da programação moderna em Java.

Iniciamos com uma revisão sobre Encapsulamento, destacando como ele restringe o acesso aos componentes de um objeto e protege seu estado interno. Em seguida, exploramos a Abstração como o processo de isolar características essenciais de um objeto, simplificando sua representação. A Herança foi apresentada como o mecanismo que permite reutilização de código através de relações "é um" entre classes. Por fim, estudamos o Polimorfismo, que permite que objetos de diferentes classes sejam tratados de maneira uniforme, fornecendo flexibilidade ao código.

🎯 **Conceitos-Chave**

* **Encapsulamento**: Mecanismo que restringe o acesso direto aos atributos de um objeto, protegendo sua integridade através de métodos de acesso controlado (getters e setters). Implementado em Java através de modificadores de acesso como `private`, `protected` e `public`.

* **Abstração**: Processo de simplificação que foca nas características essenciais de um objeto, ignorando detalhes irrelevantes. Em Java, implementado através de classes abstratas e interfaces que definem comportamentos sem especificar sua implementação completa.

* **Herança**: Mecanismo que permite uma classe (subclasse) herdar atributos e métodos de outra classe (superclasse), promovendo reutilização de código. Em Java, implementada com a palavra-chave `extends` e limitada a herança simples (uma classe só pode herdar diretamente de uma única superclasse).

* **Polimorfismo**: Capacidade de uma referência assumir diferentes formas, permitindo tratar objetos de classes diferentes de maneira uniforme. Manifesta-se como sobrecarga de métodos (mesmo nome, parâmetros diferentes) e sobrescrita (override) de métodos entre classes relacionadas por herança.

💻 **Exemplos de Código**

Exemplo 1: Abstração com classe abstrata

```java
// Classe abstrata representando um veículo
abstract class Veiculo {
    protected String marca;
    protected String modelo;
    
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Métodos abstratos - devem ser implementados pelas subclasses
    public abstract void mover();
    public abstract void parar();
    
    // Método concreto - implementação compartilhada
    public void exibirInfo() {
        System.out.println("Veículo: " + marca + " " + modelo);
    }
}

// Implementação concreta para Carro
class Carro extends Veiculo {
    private int numeroPortas;
    
    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }
    
    @Override
    public void mover() {
        System.out.println("O carro está acelerando com o motor");
    }
    
    @Override
    public void parar() {
        System.out.println("O carro está freando");
    }
    
    public void abrirPorta() {
        System.out.println("Abrindo uma das " + numeroPortas + " portas");
    }
}

// Implementação concreta para Bicicleta
class Bicicleta extends Veiculo {
    private int numeroMarchas;
    
    public Bicicleta(String marca, String modelo, int numeroMarchas) {
        super(marca, modelo);
        this.numeroMarchas = numeroMarchas;
    }
    
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo com os pedais");
    }
    
    @Override
    public void parar() {
        System.out.println("A bicicleta está parando gradualmente");
    }
    
    public void trocarMarcha(int marcha) {
        if (marcha > 0 && marcha <= numeroMarchas) {
            System.out.println("Trocando para a marcha " + marcha);
        } else {
            System.out.println("Marcha inválida!");
        }
    }
}
```

**Explicação:** Este exemplo demonstra abstração e herança. A classe abstrata `Veiculo` define uma estrutura comum e comportamentos que todas as subclasses devem implementar (métodos abstratos `mover()` e `parar()`). As classes concretas `Carro` e `Bicicleta` herdam de `Veiculo` e fornecem implementações específicas para os métodos abstratos, além de acrescentarem comportamentos próprios.

Exemplo 2: Polimorfismo em ação

```java
public class DemonstraPolimorfismo {
    public static void main(String[] args) {
        // Criando objetos de diferentes classes
        Veiculo meuCarro = new Carro("Toyota", "Corolla", 4);
        Veiculo minhaBicicleta = new Bicicleta("Caloi", "Mountain Bike", 21);
        
        // Polimorfismo através de uma coleção heterogênea
        Veiculo[] veiculos = {meuCarro, minhaBicicleta};
        
        // Utilizando polimorfismo para chamar métodos
        for (Veiculo v : veiculos) {
            v.exibirInfo();   // Método concreto da classe base
            v.mover();        // Método abstrato implementado pelas subclasses
            v.parar();        // Método abstrato implementado pelas subclasses
            System.out.println("-------------------");
        }
        
        // Acessando métodos específicos requer casting
        ((Carro) meuCarro).abrirPorta();
        ((Bicicleta) minhaBicicleta).trocarMarcha(3);
    }
}
```

🔍 **Pontos de Atenção**

⚠️ **Cuidado com:** 
* **Herança excessiva**: Evite criar hierarquias de herança muito profundas, pois podem dificultar a manutenção e a compreensão do código
* **Violação do encapsulamento**: Mesmo com herança, mantenha o encapsulamento adequado; use `protected` em vez de `public` para atributos que precisam ser acessados por subclasses
* **Acoplamento forte**: Prefira composição à herança quando a relação não for claramente "é um"
* **ClassCastException**: Ao fazer casting de tipos em polimorfismo, certifique-se de que o objeto é realmente do tipo para o qual está convertendo, ou use `instanceof` para verificar
* **Sobrescrita inadequada**: Mantenha o contrato definido pelo método original ao sobrescrever métodos; use `@Override` para garantir que está realmente sobrescrevendo

🧩 **Exercício Prático**

Desenvolva um sistema simples de gestão hospitalar com diferentes tipos de profissionais e cálculos de salário:

```
Crie um sistema de gestão hospitalar com as seguintes classes:

1. Profissional (classe base):
   - Atributos: nome (String), horasTrabalhadas (int)
   - Métodos: calcularSalario() [abstrato]

2. Medico (subclasse de Profissional):
   - Atributos adicionais: especialidade (String), bonusPorPlantao (double)
   - calcularSalario(): horas * 150 + bonusPorPlantao

3. Enfermeiro (subclasse de Profissional):
   - Atributos adicionais: nivel (String - "Junior", "Pleno", "Sênior")
   - calcularSalario(): horas * 75 + bônus baseado no nível (Junior: +5%, Pleno: +10%, Sênior: +20%)

4. TecnicoLaboratorio (subclasse de Profissional):
   - Atributos adicionais: laboratorio (String)
   - calcularSalario(): horas * 50

5. Implementar uma classe GestaoHospitalar que armazene os profissionais e calcule o total de salários.
```

<details>
<summary>Ver solução</summary>

```java
import java.util.ArrayList;
import java.util.List;

// Classe base abstrata
abstract class Profissional {
    protected String nome;
    protected int horasTrabalhadas;
    
    public Profissional(String nome, int horasTrabalhadas) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    // Método abstrato a ser implementado pelas subclasses
    public abstract double calcularSalario();
    
    // Getters e setters
    public String getNome() {
        return nome;
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}

// Subclasse Medico
class Medico extends Profissional {
    private String especialidade;
    private double bonusPorPlantao;
    
    public Medico(String nome, int horasTrabalhadas, String especialidade, double bonusPorPlantao) {
        super(nome, horasTrabalhadas);
        this.especialidade = especialidade;
        this.bonusPorPlantao = bonusPorPlantao;
    }
    
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * 150 + bonusPorPlantao;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }
}

// Subclasse Enfermeiro
class Enfermeiro extends Profissional {
    private String nivel;
    
    public Enfermeiro(String nome, int horasTrabalhadas, String nivel) {
        super(nome, horasTrabalhadas);
        this.nivel = nivel;
    }
    
    @Override
    public double calcularSalario() {
        double salarioBase = horasTrabalhadas * 75;
        
        // Adicionar bônus baseado no nível
        switch (nivel.toLowerCase()) {
            case "junior":
                return salarioBase * 1.05; // +5%
            case "pleno":
                return salarioBase * 1.10; // +10%
            case "sênior":
            case "senior":
                return salarioBase * 1.20; // +20%
            default:
                return salarioBase;
        }
    }
    
    public String getNivel() {
        return nivel;
    }
}

// Subclasse TecnicoLaboratorio
class TecnicoLaboratorio extends Profissional {
    private String laboratorio;
    
    public TecnicoLaboratorio(String nome, int horasTrabalhadas, String laboratorio) {
        super(nome, horasTrabalhadas);
        this.laboratorio = laboratorio;
    }
    
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * 50;
    }
    
    public String getLaboratorio() {
        return laboratorio;
    }
}

// Classe para gestão do hospital
class GestaoHospitalar {
    private List<Profissional> listaProfissionais;
    
    public GestaoHospitalar() {
        this.listaProfissionais = new ArrayList<>();
    }
    
    public void adicionarProfissional(Profissional p) {
        listaProfissionais.add(p);
    }
    
    public double calcularTotalSalarios() {
        double total = 0;
        for (Profissional p : listaProfissionais) {
            total += p.calcularSalario();
        }
        return total;
    }
    
    public void listarProfissionais() {
        for (Profissional p : listaProfissionais) {
            System.out.printf("Nome: %s | Cargo: %s | Salário: R$ %.2f\n", 
                p.getNome(), 
                p.getClass().getSimpleName(), 
                p.calcularSalario());
        }
    }
}

// Classe principal para testar
public class SistemaHospital {
    public static void main(String[] args) {
        GestaoHospitalar hospital = new GestaoHospitalar();
        
        // Adicionando profissionais
        hospital.adicionarProfissional(new Medico("Dr. Carlos", 160, "Cardiologia", 5000));
        hospital.adicionarProfissional(new Medico("Dra. Ana", 140, "Neurologia", 4500));
        hospital.adicionarProfissional(new Enfermeiro("João", 160, "Pleno"));
        hospital.adicionarProfissional(new Enfermeiro("Maria", 120, "Sênior"));
        hospital.adicionarProfissional(new TecnicoLaboratorio("Pedro", 160, "Análises Clínicas"));
        
        // Listando profissionais e seus salários
        System.out.println("===== LISTA DE PROFISSIONAIS =====");
        hospital.listarProfissionais();
        
        // Mostrando total de salários
        System.out.printf("\nTotal de salários a pagar: R$ %.2f\n", hospital.calcularTotalSalarios());
    }
}
```
</details>

📚 **Recursos Adicionais**

* [Documentação oficial Java sobre Herança](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
* [Documentação oficial Java sobre Classes Abstratas](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
* [Documentação oficial Java sobre Polimorfismo](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
* [Vídeo: Os 4 Pilares da Programação Orientada a Objetos](https://www.youtube.com/watch?v=n1VZFmjuhqg)
* [Artigo: Design Patterns para POO em Java](https://refactoring.guru/design-patterns/java)

📅 **Preparação para Próxima Aula**

Tópicos que serão abordados na próxima aula:
* Interfaces em Java
* Classes abstratas vs. interfaces
* Relacionamentos entre classes (associação, agregação, composição)
* Polimorfismo avançado com interfaces

Material recomendado para leitura prévia:
* Revisar os conceitos de abstração, herança e polimorfismo
* Pesquisar sobre interfaces em Java e suas aplicações
* Concluir o exercício prático de gestão hospitalar

💬 **Dúvidas Frequentes**

**P: Qual a diferença entre uma classe abstrata e uma interface?**
R: Uma classe abstrata pode conter implementações de métodos e atributos com estado, enquanto uma interface tradicionalmente contém apenas declarações de métodos (embora desde Java 8 possa ter métodos default). Uma classe pode herdar apenas de uma classe abstrata, mas pode implementar múltiplas interfaces.

**P: Quando devo usar herança e quando devo usar composição?**
R: Use herança quando existe uma relação clara de "é um" (um Carro é um Veículo). Use composição quando existe uma relação de "tem um" (um Carro tem um Motor). A composição é geralmente preferível por criar um acoplamento mais fraco entre classes.

**P: O que acontece se eu não implementar um método abstrato em uma subclasse?**
R: Se a subclasse não implementar todos os métodos abstratos da superclasse, ela também deve ser declarada como abstrata. Apenas classes concretas (não abstratas) podem ser instanciadas.

*Esta revisão foi criada para a comunidade de monitoria Java. Compartilhe e estude!*
#java #programacao #monitoria #poo #abstração #herança #polimorfismo
