package ica.oose.ooad.remi;

import java.io.IOException;
import java.util.Scanner;

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
        System.out.println("Welke vragenlijst wil je spelen?");
        for(Vragenlijst vragenlijst : speler.getVragenlijsten()){
            System.out.println(vragenlijst.getId() + ": " + vragenlijst.getVertaling("NL"));
        }


        int gekozenVragenlijst = Integer.parseInt(ConsoleHandler.getInstance().getInvoer("Kies vragenlijst"));

        new Quiz(speler.getVragenlijst(gekozenVragenlijst));
    }

    private void init(){
        Vragenlijst voetbal = new Vragenlijst(1,"NL","Voetbal",30);
        Vragenlijst schietsport = new Vragenlijst(2,"NL","Schietsport",30);

        for(int i = 0; i < 10; i ++)
        {
            OpenVraag vraag = new OpenVraag("NL", "Antwoord is Marco van Barsten ("+i+")", 20, 30);
            voetbal.voegVraagToe(vraag);

            Antwoord antwoord = new Antwoord("NL", "Marco van Barsten");
            vraag.voegAntwoordToe(antwoord);
        }

        for(int i = 0; i < 10; i ++)
        {
            MeerkeuzeVraag vraag = new MeerkeuzeVraag("NL", "Antwoord is D ("+i+")", 20, 30);
            voetbal.voegVraagToe(vraag);

            char letter = 'A';
            Antwoord antwoord = new Antwoord("NL", "Marco van Barsten");

            for(int i2 = 0; i2 < 3; i2++)
            {
                vraag.voegPositieToe(new Positie(letter, antwoord, false));
                letter ++;
            }

            vraag.voegPositieToe(new Positie(letter, antwoord, false));
        }


        speler = new Speler(100, "mire", "welkom01", "engels", voetbal , schietsport );
    }
}
