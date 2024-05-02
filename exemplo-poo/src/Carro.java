public class Carro extends Veiculo{


    public void ligar(){
        verCambio();
        verCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void verCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void verCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}
