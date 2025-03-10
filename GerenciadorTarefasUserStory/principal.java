package GerenciadorTarefasUserStory;

public class principal {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Tarefa tarefa1 = new Tarefa("Estudar Java");
        Tarefa tarefa2 = new Tarefa("Fazer exercícios");

        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);

        gerenciador.marcarTarefaComoConcluida(0);
        gerenciador.exibirTarefas();
    }
}
