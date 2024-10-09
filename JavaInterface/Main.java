public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartaoCredito("1234-5678-9012-3456");
        Pagamento pagamento2 = new PagamentoPayPal("usuario@paypal.com");

        // Processando pagamentos
        pagamento1.processarPagamento(250.00); // Saída: Processando pagamento de R$ 250.0 com Cartão de Crédito: 1234-5678-9012-3456
        pagamento2.processarPagamento(100.00); // Saída: Processando pagamento de R$ 100.0 via PayPal. Conta: usuario@paypal.com
    }
}
