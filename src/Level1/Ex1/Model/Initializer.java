package Level1.Ex1.Model;

public class Initializer {
    static WindInstrument flute = new WindInstrument("flauta", 65);
    static Stringinstrument guitar = new Stringinstrument("guitarra", 73);
    static PercusionInstrument maracas = new PercusionInstrument("maracas", 22);

    public static void Play()
    {
        System.out.println("S'ha carregat la classe \"Initializer\"");
        Instrument.InstrumentCreated();
        PlayInstruments();
    }

    private static void PlayInstruments(){
        flute.Play();
        guitar.Play();
        maracas.Play();
    }
}
