package exemplos.aula6;

// Implementação concreta para Carro
public class Carro extends Veiculo {
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
