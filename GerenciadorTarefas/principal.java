package GerenciadorTarefas;

public class principal {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        gerenciador.adicionarTarefa("Estudar Java");
        gerenciador.adicionarTarefa("Fazer exercícios");
        gerenciador.listarTarefas();
        gerenciador.removerTarefa(0);
        gerenciador.listarTarefas();
    }
}