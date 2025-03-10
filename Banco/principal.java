package Banco;

public class principal {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.criarConta(123, 1000);
        Conta conta = banco.buscarConta(123);
        conta.depositar(500);
        conta.sacar(200);
        conta.consultarSaldo();
    }
}