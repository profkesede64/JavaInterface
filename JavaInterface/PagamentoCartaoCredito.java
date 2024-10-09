// Implementando a interface em uma classe
public class PagamentoCartaoCredito implements Pagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " com Cartão de Crédito: " + numeroCartao);
    }
}
