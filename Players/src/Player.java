public class Player {

    String name;
    int valore;

    public Player( String name) {
        this.name = name;
        valore = 0;
    }


    public void setValore(int valore) {
        this.valore = valore;
    }

    public void save() {
        File f = new File("data/" + name + ".dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    public static Player load(String name) {
        File f = new File("data/" + name + ".dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            return (Player) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", valore=" + valore + "]";
    }

    

}
