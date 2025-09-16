package Level1.Ex1.Model;

public class Stringinstrument extends Instrument{
    private String message;

    public Stringinstrument(String name, float price) {
        super(name, price);
        this.message = "Està sonant un instrument de corda";
    }

    @Override
    public void Play() {
        System.out.println(this.message);
    };
}
