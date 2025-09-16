package Level1.Ex1.Model;

public abstract class Instrument {
    private String name;
    private float price;

    public Instrument(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String GetName() {
        return this.name;
    }
    public float GetPrice() {
        return this.price;
    }

    public void Setname(String name) {
        this.name = name;
    }
    public void SetPrice(float price) {
        this.price = price;
    }

    public static void InstrumentCreated(){
        System.out.println("Classe instrument creada");
    }
    public abstract void Play();
}
