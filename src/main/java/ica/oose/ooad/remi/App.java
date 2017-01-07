package ica.oose.ooad.remi;

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
        Vragenlijst gaming = new Vragenlijst(2,"NL","Gaming",30);

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

        //Gaming vragen
        VoegOpenVraagToe("NL","In welk land is de hoofdvestiging van Nintendo gevestigd?", new String[]{"Japan"},20,30,gaming );
        VoegOpenVraagToe("NL","Hoe heet de console van Nintendo die in 2017 is uitgebracht?", new String[]{"Nintendo switch", "Switch"},20,30,gaming );
        VoegOpenVraagToe("NL","Met welk spel kan je voetballen met autootjes?", new String[]{"Rocket league"},20,30,gaming );
        VoegOpenVraagToe("NL","Hoe heet de snelle blauwe egel van SEGA?", new String[]{"Sonic","Sonic the hedgehog"},20,30,gaming );
        VoegOpenVraagToe("NL","Waar staat de afkorting MMORPG voor?", new String[]{"Massive Multiplayer Online Role Playing Game"},20,30,gaming );

        VoegMeerkeuzeVraagToe("NL", "In welk jaar is Nintendo opgericht?",
                new Positie[]{
                        new Positie(
                                'A',
                                new Antwoord(
                                        "NL",
                                        "1889"),
                                true),
                        new Positie(
                                'B',
                                new Antwoord(
                                        "NL",
                                        "1905"),
                                false),
                        new Positie(
                                'C',
                                new Antwoord(
                                        "NL",
                                        "1921"),
                                false),
                        new Positie(
                                'D',
                                new Antwoord(
                                        "NL",
                                        "1994"),
                                false)
                }, 20, 30, gaming
        );

        VoegMeerkeuzeVraagToe("NL", "Hoe heet het apparaat van Steam, waarmee je games kan streamen naar de tv?",
                new Positie[]{
                        new Positie(
                                'A',
                                new Antwoord(
                                        "NL",
                                        "Steam Streaming"),
                                false),
                        new Positie(
                                'B',
                                new Antwoord(
                                        "NL",
                                        "Steam Video"),
                                false),
                        new Positie(
                                'C',
                                new Antwoord(
                                        "NL",
                                        "Steam Link"),
                                true),
                        new Positie(
                                'D',
                                new Antwoord(
                                        "NL",
                                        "SteamViewer"),
                                false)
                }, 20, 30, gaming
        );

        VoegMeerkeuzeVraagToe("NL", "Hoe heet de hoofdpersoon van The Legend of Zelda?",
                new Positie[]{
                        new Positie(
                                'A',
                                new Antwoord(
                                        "NL",
                                        "Zelda"),
                                false),
                        new Positie(
                                'B',
                                new Antwoord(
                                        "NL",
                                        "Link"),
                                true),
                        new Positie(
                                'C',
                                new Antwoord(
                                        "NL",
                                        "Ganondorf"),
                                false),
                        new Positie(
                                'D',
                                new Antwoord(
                                        "NL",
                                        "Epona"),
                                false)
                }, 20, 30, gaming
        );

        VoegMeerkeuzeVraagToe("NL", "Waar staat MOBA voor?",
                new Positie[]{
                        new Positie(
                                'A',
                                new Antwoord(
                                        "NL",
                                        "Multiplayer Online Beta Access"),
                                false),
                        new Positie(
                                'B',
                                new Antwoord(
                                        "NL",
                                        "Multiplayer Online Based Area"),
                                false),
                        new Positie(
                                'C',
                                new Antwoord(
                                        "NL",
                                        "Multiplayer Online Based Adventure"),
                                false),
                        new Positie(
                                'D',
                                new Antwoord(
                                        "NL",
                                        "Multiplayer Online Battle Arena"),
                                true)
                }, 20, 30, gaming
        );

        VoegMeerkeuzeVraagToe("NL", "Welke game haalde binnen 3 dagen meer dan 1 miljard dollar op?",
                new Positie[]{
                        new Positie(
                                'A',
                                new Antwoord(
                                        "NL",
                                        "Call of Duty Black Ops 3"),
                                false),
                        new Positie(
                                'B',
                                new Antwoord(
                                        "NL",
                                        "Battlefield 1"),
                                false),
                        new Positie(
                                'C',
                                new Antwoord(
                                        "NL",
                                        "GTA 5"),
                                true),
                        new Positie(
                                'D',
                                new Antwoord(
                                        "NL",
                                        "Minecraft"),
                                false)
                }, 20, 30, gaming
        );

        speler = new Speler(100, "mire", "welkom01", "engels", voetbal , gaming);
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
