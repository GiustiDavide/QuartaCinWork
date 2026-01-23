public class App {
    public static void main(String[] args) {
        // Esempio di utilizzo delle classi Porto, Barca e PostoBarca
        try {
            // Crea un porto
            Porto porto = new Porto();

            // Crea alcune barche
            Barca b1 = new Barca("Aurora", "Italia", 12, 0, "vela");
            Barca b2 = new Barca("Zeus", "Grecia", 0, 5, "motore");

            // Assegna le barche ai posti nel porto
            porto.assegnaPosto(b1);
            porto.assegnaPosto(b2);

            // Ottieni informazioni su un posto specifico
            double costo = porto.liberaPosto(1, 3);
            System.out.println("Costo da pagare: " + costo + " €");

        } catch (Exception e) { // Gestione delle eccezioni
            System.out.println("Errore: " + e.getMessage());
        }
    }
}