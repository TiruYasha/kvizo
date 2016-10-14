package ica.oose.ooad.remi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Speler speler = new Speler(100, "mire", "welkom01", "engels", new Vragenlijst(), new Vragenlijst());

        speler.speelIndividueleQuiz();
    }
}
