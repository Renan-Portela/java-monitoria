package exemplos.aula7;

/**
 * Implementação da interface MetodoPagamento para pagamentos com cartão
 */
public class Cartao implements MetodoPagamento {
    private String numero;
    private String titular;
    
    public Cartao(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    
    @Override
    public void pagar(double valor) {
        System.out.println("Processando pagamento via cartão...");
        System.out.println("Cartão: " + mascararNumeroCartao());
        System.out.println("Titular: " + titular);
        System.out.println("Valor: R$" + String.format("%.2f", valor));
        System.out.println("Pagamento com cartão realizado com sucesso!");
    }
    
    /**
     * Método auxiliar que mascara o número do cartão para exibição
     * @return número do cartão mascarado
     */
    private String mascararNumeroCartao() {
        if (numero.length() < 4) {
            return numero;
        }
        return "****-****-****-" + numero.substring(numero.length() - 4);
    }
    
    // Getters e setters
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
