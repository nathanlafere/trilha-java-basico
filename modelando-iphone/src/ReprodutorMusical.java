public interface ReprodutorMusical {
    static void tocar() {
        System.out.println("Tocando música.");
    }

    static void pausar() {
        System.out.println("Música pausada.");
    }

    static void selecionarMusica(String musica) {
        System.out.println(String.format("Música %s selecionada.",musica));
    }
    
}
