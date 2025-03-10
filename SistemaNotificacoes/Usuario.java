package SistemaNotificacoes;

class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void receberNotificacao(Notificacao notificacao, String mensagem) {
        notificacao.enviar(mensagem);
    }
}