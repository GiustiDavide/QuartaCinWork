public class Porto {
    // Attributi
    private PostoBarca[] posti;

    // Costruttore
    public Porto() {
        posti = new PostoBarca[24];
        // Inizializza i posti barca
        for (int i = 0; i < 24; i++) {
            posti[i] = new PostoBarca(i + 1);
        }
    }

    // Metodo per assegnare una barca al primo posto libero
    public void assegnaPosto(Barca b) throws Exception {
        // Cerca il primo posto libero
        for (int i = 0; i < posti.length; i++) {
            if (!posti[i].occupato()) {
                posti[i].assegna(b);
                return;
            }
        }
        // Se non ci sono posti liberi, lancia un'eccezione
        throw new Exception("Porto pieno");
    }

    // Metodo per liberare un posto e calcolare il costo di ormeggio
    public double liberaPosto(int numero, int giorni) throws Exception {
        // Controlla che il numero del posto sia valido
        PostoBarca p = posti[numero - 1];
        if (!p.occupato()) {
            throw new Exception("Posto già libero");
        }
        // Libera il posto calcola il costo
        Barca b = p.libera();
        return b.calcolaCosto(giorni);
    }

    // Metodo per ottenere le informazioni sulla barca in un posto specifico
    public Barca infoPosto(int numero) throws Exception {
        // Controlla che il numero del posto sia valido
        PostoBarca p = posti[numero - 1];
        if (!p.occupato()) {
            throw new Exception("Posto libero");
        }
        // Restituisce la barca assegnata al posto
        return p.getBarca();
    }

    // Metodo per ottenere i nomi delle barche di una certa nazionalità
    public String[] barchePerNazionalita(String naz) {
        String[] nomi = new String[24];
        int k = 0;
        // Scorre tutti i posti barca
        for (PostoBarca p : posti) {
            // Se il posto è occupato e la nazionalità corrisponde, aggiungi il nome
            if (p.occupato() && p.getBarca().getNazionalita().equalsIgnoreCase(naz)) {
                nomi[k++] = p.getBarca().getNome();
            }
        }
        // Ridimensiona l'array per restituire solo i nomi trovati
        return nomi;
    }

    public String toString() {

        String s = "Stato del Porto:\n";
        for(int i = 0; i < posti.length; i++) {
            s += "Posto " + (i + 1) + ": ";
            if (posti[i].occupato()) {
                s += posti[i].getBarca().getNome() + " (" + posti[i].getBarca().getNazionalita() + ")\n";
            } else {
                s += "Libero\n";
            }
        }
        return s;           
    }
}