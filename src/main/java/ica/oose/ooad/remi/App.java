package ica.oose.ooad.remi;

import java.util.Dictionary;
import java.util.List;

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

        VoegOpenVraagToe("NL","Wie is ouder, Frank of Ronald de Boer?", new String[]{"Ronald","Ronald de boer"},20,30,voetbal );
        VoegOpenVraagToe("NL","Welke engelse club heeft als bijnaam Tractor Boys?", new String[]{"Ipswich Town"},20,30,voetbal );
        VoegOpenVraagToe("NL","Welke eredivisieclub heeft een paard in zijn clubembleem?", new String[]{"Twente","FC Twente", "Twente FC"},20,30,voetbal );
        VoegOpenVraagToe("NL","Welke club hebben Ruud van Nistelrooy, Nigel de Hong en Joris Mathijsen met elkaar gemeen?", new String[]{"Hamburger SV","Hamburger"},20,30,voetbal );
        VoegOpenVraagToe("NL","Welke club hebben Pierre van Hooydonk, Glenn Helder en Gaston Taument met elkaar gemeen?", new String[]{"Benfica"},20,30,voetbal );

        VoegMeerkeuzeVraagToe("NL", "Hoe vaak werd Peter van Velzen topscorer van de Eerste Divisie?",
                new Positie[]{
                    new Positie(
                            'A',
                            new Antwoord(
                                    "NL",
                                    "1 keer"),
                            false),
                    new Positie(
                            'B',
                            new Antwoord(
                                    "NL",
                                    "2 keer"),
                            false),
                    new Positie(
                            'C',
                            new Antwoord(
                                    "NL",
                                    "3 keer"),
                            true),
                    new Positie(
                            'D',
                            new Antwoord(
                                    "NL",
                                    "4 keer"),
                            false)
                }, 20, 30, voetbal
        );

        VoegMeerkeuzeVraagToe("NL", "Hoe groot moet de afstand tussen 2 doelpalen zijn?",
                new Positie[]{
                        new Positie(
                                'A',
                                new Antwoord(
                                        "NL",
                                        "7.58 meter"),
                                false),
                        new Positie(
                                'B',
                                new Antwoord(
                                        "NL",
                                        "6.53 meter"),
                                false),
                        new Positie(
                                'C',
                                new Antwoord(
                                        "NL",
                                        "7.32 meter"),
                                true),
                        new Positie(
                                'D',
                                new Antwoord(
                                        "NL",
                                        "7 meter"),
                                false)
                }, 20, 30, voetbal
        );

        VoegMeerkeuzeVraagToe("NL", "In welk jaar is de FIFA opgericht?",
                new Positie[]{
                        new Positie(
                                'A',
                                new Antwoord(
                                        "NL",
                                        "1937"),
                                false),
                        new Positie(
                                'B',
                                new Antwoord(
                                        "NL",
                                        "1904"),
                                true),
                        new Positie(
                                'C',
                                new Antwoord(
                                        "NL",
                                        "1929"),
                                false),
                        new Positie(
                                'D',
                                new Antwoord(
                                        "NL",
                                        "1943"),
                                false)
                }, 20, 30, voetbal
        );

        VoegMeerkeuzeVraagToe("NL", "Wat is het afrikaanse woord voor voetbalteam?",
                new Positie[]{
                        new Positie(
                                'A',
                                new Antwoord(
                                        "NL",
                                        "Foebalploegie"),
                                false),
                        new Positie(
                                'B',
                                new Antwoord(
                                        "NL",
                                        "Goalies"),
                                false),
                        new Positie(
                                'C',
                                new Antwoord(
                                        "NL",
                                        "Sokkerspan"),
                                true),
                        new Positie(
                                'D',
                                new Antwoord(
                                        "NL",
                                        "Foebalmannen"),
                                false)
                }, 20, 30, voetbal
        );

        VoegMeerkeuzeVraagToe("NL", "Hoeveel interlands speelde Edwin van der Sar voor het Nederlands elftal?",
                new Positie[]{
                        new Positie(
                                'A',
                                new Antwoord(
                                        "NL",
                                        "117"),
                                false),
                        new Positie(
                                'B',
                                new Antwoord(
                                        "NL",
                                        "122"),
                                false),
                        new Positie(
                                'C',
                                new Antwoord(
                                        "NL",
                                        "125"),
                                false),
                        new Positie(
                                'D',
                                new Antwoord(
                                        "NL",
                                        "130"),
                                true)
                }, 20, 30, voetbal
        );



        speler = new Speler(100, "mire", "welkom01", "engels", voetbal , schietsport );
    }

    private void VoegOpenVraagToe(String taal, String vraag, String[] antwoorden, int tijd, int punten, Vragenlijst vragenlijst){

        OpenVraag openVraag = new OpenVraag(taal,vraag,tijd,punten);

        for (String antwoord: antwoorden) {
            openVraag.voegAntwoordToe(new Antwoord(taal,antwoord));
        }

        vragenlijst.voegVraagToe(openVraag);
    }

    private void VoegMeerkeuzeVraagToe(String taal, String vraag, Positie[] posities, int tijd, int punten, Vragenlijst vragenlijst)
    {
        MeerkeuzeVraag meerkeuzeVraag = new MeerkeuzeVraag(taal, vraag, tijd, punten);

        for (Positie pos: posities) {
            meerkeuzeVraag.voegPositieToe(pos);
        }

        vragenlijst.voegVraagToe(meerkeuzeVraag);
    }
}
