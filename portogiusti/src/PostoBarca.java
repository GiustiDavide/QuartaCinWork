public class PostoBarca {
    // Attributi
    private int numero;
    private Barca barca;

    // Costruttore
    public PostoBarca(int numero) {
        this.numero = numero;
        this.barca = null;
    }

    // Metodo per verificare se il posto è occupato
    public boolean occupato() {
        return barca != null;
    }

    // Assegna una barca al posto
    public void assegna(Barca b) {
        this.barca = b;
    }

    // Libera il posto e restituisce la barca precedentemente assegnata
    public Barca libera() {
        Barca temp = barca;
        barca = null;
        return temp;
    }

    // Getters
    public Barca getBarca() {
        return barca;
    }

    public int getNumero() {
        return numero;
    }
}