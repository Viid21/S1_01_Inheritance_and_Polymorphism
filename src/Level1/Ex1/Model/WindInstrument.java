package Level1.Ex1.Model;

public class WindInstrument extends Instrument {
    private String message;

    public WindInstrument(String name, float price) {
        super(name, price);
        this.message = "Està sonant un instrument de vent";
    }

    @Override
    public void Play() {
        System.out.println(this.message);
    };
}
