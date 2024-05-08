package apps;
public class Msn extends ServicoMsgInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo MSN");
    }

    public void receberMensagem(){
    System.out.println("Recebendo mensagem pelo MSN");
    }
    
}
