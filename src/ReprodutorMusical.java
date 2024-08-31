public interface ReprodutorMusical {
    default public void selecionarMusica(String musica){
        System.out.println("Selecionando a musica: " + musica);
    }

    default public void tocar(){
        System.out.println("Tocando musica");
    }

    default public void pausar(){
        System.out.println("Pausando a atual musica");
    }
}
