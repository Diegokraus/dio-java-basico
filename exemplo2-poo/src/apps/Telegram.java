package apps;
public class Telegram extends ServicoMsgInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo telegram");
    }

    public void receberMensagem(){
    System.out.println("Recebendo mensagem pelo telegram");
    }
}
