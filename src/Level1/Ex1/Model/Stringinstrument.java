package Level1.Ex1.Model;

public class Stringinstrument extends Instrument{
    private String message;

    public Stringinstrument(String name, float price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    };
}
