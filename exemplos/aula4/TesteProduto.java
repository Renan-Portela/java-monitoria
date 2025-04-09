package exemplos.aula4;

/**
 * Classe para testar a classe Produto
 * Demonstra criação e manipulação de objetos
 */
public class TesteProduto {
    public static void main(String[] args) {
        // Instanciando objetos
        Produto arroz = new Produto("Arroz Integral", 8.90, 50);
        Produto feijao = new Produto("Feijão Preto", 6.50, 30);
        
        // Usando métodos
        System.out.println("===== INFORMAÇÕES DOS PRODUTOS =====");
        System.out.println(arroz);
        System.out.println("\n----------------------------\n");
        System.out.println(feijao);
        
        // Alterando o estado do objeto
        System.out.println("\n===== OPERAÇÕES DE ESTOQUE =====");
        arroz.adicionarEstoque(10);
        System.out.println("Nova quantidade de " + arroz.getNome() + " em estoque: " + arroz.getQuantidade());
        
        // Realizando uma venda
        int quantidadeVenda = 15;
        System.out.println("\nTentando vender " + quantidadeVenda + " unidades de " + arroz.getNome());
        boolean vendaRealizada = arroz.vender(quantidadeVenda);
        
        if (vendaRealizada) {
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Quantidade restante: " + arroz.getQuantidade());
            System.out.println("Valor da venda: R$ " + String.format("%.2f", arroz.getPreco() * quantidadeVenda));
        } else {
            System.out.println("Estoque insuficiente para a venda.");
            System.out.println("Quantidade disponível: " + arroz.getQuantidade());
        }
        
        // Demonstrando referências
        System.out.println("\n===== REFERÊNCIAS DE OBJETOS =====");
        Produto arroz2 = arroz;  // arroz2 e arroz referenciam o mesmo objeto
        
        System.out.println("Preço inicial do arroz: R$ " + arroz.getPreco());
        
        // Alterando o preço através de arroz2
        arroz2.setPreco(9.50);
        
        // Verificando através de arroz
        System.out.println("Novo preço do arroz (alterado via arroz2): R$ " + arroz.getPreco());
        
        // Explicação sobre referências
        System.out.println("\nObservação: arroz e arroz2 são duas variáveis distintas que");
        System.out.println("apontam para o mesmo objeto na memória. Por isso, qualquer");
        System.out.println("alteração feita por uma variável é refletida na outra.");
    }
}