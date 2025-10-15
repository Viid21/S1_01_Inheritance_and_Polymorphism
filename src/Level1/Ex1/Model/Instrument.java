package Level1.Ex1.Model;

public abstract class Instrument {
    private String name;
    private float price;

    public Instrument(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public static void instrumentCreated(){
        System.out.println("Classe instrument creada");
    }
    public abstract void play();
}
