public class ServicoMsgInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");

        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    public void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
    public void salvarHistoricoMensagem(){
        System.out.println("salvando historico da mensagem");
    }
}