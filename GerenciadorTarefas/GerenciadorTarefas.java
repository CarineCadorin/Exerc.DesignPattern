package GerenciadorTarefas;

import java.util.ArrayList;
import java.util.List;

class GerenciadorTarefas {
    private List<String> tarefas;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa \"" + tarefa + "\" adicionada.");
    }

    public void listarTarefas() {
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }

    public void removerTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            String tarefaRemovida = tarefas.remove(index);
            System.out.println("Tarefa \"" + tarefaRemovida + "\" removida.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
