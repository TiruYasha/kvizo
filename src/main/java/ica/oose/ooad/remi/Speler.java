package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;

public class Speler {

	private int saldo;

	private String gebruikersnaam;

	private String wachtwoord;

	private String gekozenTaal;

	private Vragenlijst[] vragenlijsten;

    private Winkel winkel;

	private Quiz[] quizes;

    public Speler(int saldo, String gebruikersnaam, String wachtwoord, String gekozenTaal, Vragenlijst vragenlijst1, Vragenlijst vragenlijst2) {
        this.saldo = saldo;
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.gekozenTaal = gekozenTaal;
        vragenlijsten = new Vragenlijst[] {vragenlijst1, vragenlijst2};
    }

	public void speelIndividueleQuiz() {

	}

	public void selecteerVragenlijst(int id) {

	}

}
