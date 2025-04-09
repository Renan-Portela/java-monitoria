package exemplos.aula6;

// Classe para demonstrar o polimorfismo
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
