package Level1.Ex1.Model;

public class WindInstrument extends Instrument {
    private String message;

    public WindInstrument(String name, float price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");
    };
}
