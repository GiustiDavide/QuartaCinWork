public class Barca {
    // Attributi della barca
    private String nome;
    private String nazionalita;
    private double lunghezza;
    private double stazza;
    private String tipo; // "vela" o "motore"

    // Costruttore
    public Barca(String nome, String nazionalita, double lunghezza, double stazza, String tipo) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipo = tipo;
    }

    // Metodo per calcolare il costo di ormeggio
    public double calcolaCosto(int giorni) {
        // Costo basato sul tipo di barca
        if (tipo.equalsIgnoreCase("vela")) {
            return 10 * lunghezza * giorni;
        } else {
            return 20 * stazza * giorni;
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }
}