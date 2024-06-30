

public class IPhone implements AparelhoTelefonico,Camera,Galeria,NavegadorInternet,ReprodutorMusical {
    private double foco;
    private boolean flash;

    // Implementação dos Métodos Getters e Setters de Camera
    @Override
    public double getFoco() {
        return foco;
    }

    @Override
    public void setFoco(double foco) {
        this.foco = foco;
    }

    @Override
    public boolean isFlash() {
        return flash;
    }

    @Override
    public void setFlash(boolean flash) {
        this.flash = flash;
    }

    public static void main(String[] args) {
        IPhone Iphone = new IPhone();
        ReprodutorMusical.tocar();
        ReprodutorMusical.selecionarMusica("Black - Pearl Jam");
        System.out.println(Iphone.getFoco());
        Iphone.setFoco(15.3);
        System.out.println(Iphone.getFoco());
        AparelhoTelefonico.atender();
        Camera.abrirGaleria();
    }
}