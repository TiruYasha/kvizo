package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;

public class Speler {

	private int saldo;

	private String gebruikersnaam;

	private String wachtwoord;

	private String gekozenTaal;

    private Winkel winkel;

	private List<Vragenlijst> vragenlijsten;

	private List<Quiz> quizes;

    public Speler(int saldo, String gebruikersnaam, String wachtwoord, String gekozenTaal, Vragenlijst vragenlijst1, Vragenlijst vragenlijst2) {

        this.saldo = saldo;
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.gekozenTaal = gekozenTaal;

        vragenlijsten = new ArrayList<Vragenlijst>();
        vragenlijsten.add(vragenlijst1);
        vragenlijsten.add(vragenlijst2);
    }

    public List<Vragenlijst> getVragenlijsten() {
        return vragenlijsten;
    }

	public Vragenlijst getVragenlijst(int id) {
        for(Vragenlijst vragenlijst : vragenlijsten)
        {
            if(vragenlijst.getId() == id)
            {
                return vragenlijst;
            }
        }
        return null;
	}
}
