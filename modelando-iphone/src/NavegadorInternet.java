public interface NavegadorInternet {
    
    static void exibirPagina(String url) {
        System.out.println("Exibindo página web: " + url);
    }

    static void adicionarNovaAba() {
        System.out.println("Abrindo nova aba.");
    }

    static void atualizarPagina() {
        System.out.println("Atualizando página web.");
    }

}
