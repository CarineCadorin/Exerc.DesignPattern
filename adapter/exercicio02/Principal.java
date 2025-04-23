package exercicio02;

public class Principal {
    public static void main(String[] args) {
        FuncionarioSistemaB funcionarioB = new FuncionarioSistemaB("João", "Silva", 60000.0);
        FuncionarioSistemaA funcionarioA = new FuncionarioAdapter(funcionarioB);

        System.out.println("Nome: " + funcionarioA.getNomeCompleto());
        System.out.println("Salário mensal: " + funcionarioA.getSalarioMensal());
    }
}
