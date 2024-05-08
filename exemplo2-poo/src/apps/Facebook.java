package apps;
public class Facebook extends ServicoMsgInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo facebook");
    }

    public void receberMensagem(){
    System.out.println("Recebendo mensagem pelo facebook");
    }
}
