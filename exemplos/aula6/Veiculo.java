// Classe abstrata representando um veículo
public abstract class Veiculo {
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