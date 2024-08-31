public class Iphone{
    public static void main(String[] args) throws Exception {
        Smartphone iphone = new Smartphone();
        iphone.ligar("17993524367");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        
        iphone.selecionarMusica("AC/DC");
        iphone.tocar();
        iphone.pausar();
        
    }
}
