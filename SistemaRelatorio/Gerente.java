package SistemaRelatorio;


class Gerente {
    public void solicitarRelatorio(Relatorio relatorio, String[] dados) {
        relatorio.gerar(dados);
    }
}