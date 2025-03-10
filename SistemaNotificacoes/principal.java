package SistemaNotificacoes;

public class principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João");

        Notificacao email = new EmailNotificacao();
        Notificacao sms = new SmsNotificacao();
        Notificacao push = new PushNotificacao();

        usuario.receberNotificacao(email, "Você tem um novo e-mail!");
        usuario.receberNotificacao(sms, "Você recebeu uma mensagem de texto.");
        usuario.receberNotificacao(push, "Você tem uma nova notificação de aplicativo.");
    }
}
