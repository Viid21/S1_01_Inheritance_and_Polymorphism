package Level1.Ex1.Model;

public class initializer {
    WindInstrument flute = new WindInstrument("flauta", 65);
    Stringinstrument guitar = new Stringinstrument("guitarra", 73);
    PercusionInstrument maracas = new PercusionInstrument("maracas", 22);

    public void play()
    {
        System.out.println("S'ha carregat la classe \"Initializer\"");
        Instrument.instrumentCreated();
        playInstruments();
    }

    private void playInstruments(){
        flute.play();
        guitar.play();
        maracas.play();
    }
}
