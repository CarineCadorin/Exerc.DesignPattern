package exercicio02;

public class FuncionarioSistemaB {
    private String primeiroNome;
    private String ultimoNome;
    private double salarioAnual;

    public FuncionarioSistemaB(String primeiroNome, String ultimoNome, double salarioAnual) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.salarioAnual = salarioAnual;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }
}
