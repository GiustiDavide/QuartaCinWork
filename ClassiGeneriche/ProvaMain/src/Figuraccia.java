public class Figuraccia extends Figura implements Camaleonte {

    public Figuraccia(String tipo, int perimetro) {
        super("viola", tipo, perimetro);
    }

    @Override
    public void cambiaColore(String nuovoColore) {
        this.colore = nuovoColore;
    }
}
