package Level1.Ex1.Model;

public class PercusionInstrument extends Instrument{
    private String message;

    public PercusionInstrument(String name, float price) {
        super(name, price);
        this.message = "Està sonant un instrument de vent";
    }

    @Override
    public void Play() {
        System.out.println(this.message);
    };
}
