import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Coppia<Double, Character> c1 = new Coppia<>(0.0, 'a');
        Coppia<Integer, String> c2 = new Coppia<>(12, "Povera Italia");
        System.out.println(c1);
        System.out.println(c2);

        ArrayList<Personcina> elements = new ArrayList<>();

        Timido t1 = new Timido();
        Maranza m1 = new Maranza();

        elements.add(t1);
        elements.add(m1);

        for (Personcina p : elements) {
            p.offenditi();
        }


    }
}
