package SistemaPagamentos;

class Compra {
    private double valor;

    public Compra(double valor) {
        this.valor = valor;
    }

    public void realizarPagamento(MetodoPagamento metodo) {
        metodo.pagar(valor);
    }
}
