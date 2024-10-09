// Implementando a interface em outra classe
public class PagamentoPayPal implements Pagamento {
    private String emailUsuario;

    public PagamentoPayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via PayPal. Conta: " + emailUsuario);
    }
}
