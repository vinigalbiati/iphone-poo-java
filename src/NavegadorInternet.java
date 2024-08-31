public interface NavegadorInternet {
    default public void exibirPagina(String url){
        System.out.println("Exibindo a pagina de url: " + url);
    }

    default public void adicionarNovaAba(){
        System.out.println("Adicionando uma nova guia");
    }

    default public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }
}
