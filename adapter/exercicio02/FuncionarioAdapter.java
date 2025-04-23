package exercicio02;

public class FuncionarioAdapter implements FuncionarioSistemaA {
    private FuncionarioSistemaB funcionarioB;

    public FuncionarioAdapter(FuncionarioSistemaB funcionarioB) {
        this.funcionarioB = funcionarioB;
    }

    @Override
    public String getNomeCompleto() {
        return funcionarioB.getPrimeiroNome() + " " + funcionarioB.getUltimoNome();
    }

    @Override
    public double getSalarioMensal() {
        return funcionarioB.getSalarioAnual() / 12;
    }
}
