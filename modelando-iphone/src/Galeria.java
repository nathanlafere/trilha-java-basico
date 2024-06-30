public interface Galeria {
    static void main(String[] args) {
        System.out.println("Galeria aberta.");
    }

    static void exibirVideos() {
        System.out.println("Exibindo vídeos.");
    }

    static void exibirFotos() {
        System.out.println("Exibindo fotos.");
    }

    static void filtrarImagens(String textoFiltro) {
        System.out.println("Filtrando imagens por: "+textoFiltro);
    }
    
    static void expandirImagem() {
        System.out.println("Expandindo imagem.");
    }

    static void deletarImagem() {
        System.out.println("Deletando Imagem.");
    }

}
