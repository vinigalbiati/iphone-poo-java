public interface AparelhoTelefonico {
    default public void ligar(String numero){
        System.out.println("Ligando para o numero " + numero);
    }

    default public void atender(){
        System.out.println("Atendendo ligação");
    }

    default public void iniciarCorreioVoz(){
        System.out.println("Chamada direcionada para a caixa postal. \n Gravando correio de voz...");
    }
}
