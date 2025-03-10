package Banco;
import java.util.HashMap;
import java.util.Map;

class Banco {
    private Map<Integer, Conta> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public void criarConta(int numero, double saldoInicial) {
        contas.put(numero, new Conta(numero, saldoInicial));
        System.out.println("Conta " + numero + " criada com saldo inicial de R$" + saldoInicial);
    }

    public Conta buscarConta(int numero) {
        return contas.get(numero);
    }
}