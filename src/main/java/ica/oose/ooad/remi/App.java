package ica.oose.ooad.remi;

/**
 * Hello world!
 *
 */
public class App 
{
    private Speler speler;

    public static void main( String[] args )
    {
        new App();
    }

    public App(){
        init();
    }

    private void init(){
        speler = new Speler(100, "mire", "welkom01", "engels", new Vragenlijst(), new Vragenlijst());
    }
}
