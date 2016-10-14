package ica.oose.ooad.remi;

public class Positie {

	private boolean isGoedAntwoord;

	private char positie;

	private Antwoord antwoord;

    public Positie(char positie, Antwoord antwoord, boolean isGoedAntwoord){
        this.positie=positie;
        this.antwoord = antwoord;
        this.isGoedAntwoord = isGoedAntwoord;
    }

    public char getPositie() {
        return positie;
    }

    public boolean getIsGoedAntwoord() {
        return isGoedAntwoord;
    }

    public void toonAntwoord() {
        ConsoleHandler.getInstance().println(positie + ": " + antwoord.getVertaling("NL"));
    }
}
