public class Figura implements Comparable{
    String colore;
    String tipo;
    int perimetro;

    @Override
    public int compareTo(Object o) {
        Figura f = (Figura) o;
        if(perimetro<f.perimetro) {
            return -1;
        }
        if(perimetro>f.perimetro) {
            return 1;
        }
        return 0;
    }

    public Figura(String colore, String tipo, int perimetro) {
        this.colore = colore;
        this.tipo = tipo;
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "colore='" + colore + "\n" +
                ", tipo='" + tipo + "\n" +
                ", perimetro=" + perimetro +
                '}';
    }   
    
}
