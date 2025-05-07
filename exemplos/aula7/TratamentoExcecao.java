public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== CALCULADORA DE DIVISÃO ===");
            
            // Leitura do numerador
            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();
            
            // Leitura do denominador
            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();
            
            // Verifica se o denominador é zero
            if (denominador == 0) {
                throw new ArithmeticException("Não é possível dividir por zero!");
            }
            
            // Calcula e exibe o resultado
            double resultado = (double) numerador / denominador;
            System.out.println("Resultado: " + numerador + " / " + denominador + " = " + resultado);
            
        } catch (ArithmeticException e) {
            // Tratamento de exceção de divisão por zero
            System.out.println("Erro matemático: " + e.getMessage());
            
        } catch (Exception e) {
            // Tratamento de qualquer outra exceção
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            
        } finally {
            // Este bloco sempre será executado
            System.out.println("Operação finalizada!");
            System.out.println("Lembre-se: divisão por zero não é permitida em matemática.");
            scanner.close();
        }
        
        System.out.println("Programa encerrado normalmente.");
    }
}

