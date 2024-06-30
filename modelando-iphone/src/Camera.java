public interface Camera {

    public double getFoco();

    public void setFoco(double foco);

    public boolean isFlash();

    public void setFlash(boolean flash);

    static void gravarVideo() {
        System.out.println("Gravando vídeo.");
    }
    
    static void tirarFoto() {
        System.out.println("Tirando foto.");
    }

    static void abrirGaleria() {
        System.out.println("Abrindo galeria.");
        Galeria.main(new String[0]);
    }
    
}
