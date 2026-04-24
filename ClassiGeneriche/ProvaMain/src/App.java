import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        File reader = new File("data/colori.txt");
        ArrayList<Figura> figure = new ArrayList<>();
        Scanner myReader = new Scanner(reader);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] flds = data.split(",");
            Figura f1 = new Figura(flds[0], flds[1], Integer.parseInt(flds[2]));
            figure.add(f1);
        }
        myReader.close();

        for(int i = 0; i < figure.size(); i++) {
            System.out.println(figure.get(i));
        }

        System.out.println(figure.get(0).compareTo(figure.get(1)));

    }
}
