public class ComputadorCliente {
    public static void main(String[] args) {
        // System.out.println("MSN");
        // Msn msn = new Msn();
        // msn.enviarMensagem();
        // msn.receberMensagem();
        
        // System.out.println("FACEBOOK");
        // Facebook fcb = new Facebook();
        // fcb.enviarMensagem();
        // fcb.receberMensagem();

        // System.out.println("TELEGRAM");
        // Telegram tlg = new Telegram();
        // tlg.enviarMensagem();
        // tlg.receberMensagem();

        ServicoMsgInstantanea smi = null;

        String appEscolhido = "tlg";

        if(appEscolhido.equals("msn"))
            smi = new MsnMessenger();
    }
}
