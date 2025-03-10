package GerenciadorTarefasUserStory;

import java.util.ArrayList;
import java.util.List;

class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
        }
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.exibirDetalhes();
        }
    }
}
