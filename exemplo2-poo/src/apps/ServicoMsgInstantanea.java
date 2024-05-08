package apps;
public abstract class ServicoMsgInstantanea{
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // public void enviarMensagem(){
    //     validarConectadoInternet();
    //     System.out.println("enviando mensagem");
    //     salvarHistoricoMensagem();
    // }
    // public void receberMensagem(){
    //     System.out.println("recebendo mensagem");
    // }
    protected void validarConectadoInternet(){
        System.out.println("validadando se esta conectado a internet");
    }
    // private void salvarHistoricoMensagem(){
    //     System.out.println("salvando o historico da mensagem");
    // }
}