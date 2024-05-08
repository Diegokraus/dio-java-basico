import apps.Facebook;
import apps.Msn;
import apps.ServicoMsgInstantanea;
import apps.Telegram;

public class ComputadorCliente {
    public static void main(String[] args) { 

        ServicoMsgInstantanea smi = null;

        String appEscolhido = "tlg";

        if(appEscolhido.equals("msn"))
            smi = new Msn();
        else if(appEscolhido.equals("fb"))
            smi = new Facebook();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
       
    }
}
