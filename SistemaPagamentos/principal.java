package SistemaPagamentos;

public class principal {
    public static void main(String[] args) {
        Compra compra = new Compra(1500.00);

        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento paypal = new PayPal();
        MetodoPagamento boleto = new Boleto();

        compra.realizarPagamento(cartao);
        compra.realizarPagamento(paypal);
        compra.realizarPagamento(boleto);
    }
}
