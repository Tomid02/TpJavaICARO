package Personajes;

public class Mago extends Personaje{

    private String magia;

    public Mago(int salud, String magia) {
        super(salud);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public void entrenar() {
    }
}
