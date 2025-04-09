package exemplos.aula6;

// Implementação concreta para Bicicleta
public class Bicicleta extends Veiculo {
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
