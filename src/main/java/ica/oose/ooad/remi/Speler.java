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

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public String getGekozenTaal() {
        return gekozenTaal;
    }

    public void setGekozenTaal(String gekozenTaal) {
        this.gekozenTaal = gekozenTaal;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public List<Vragenlijst> getVragenlijsten() {
        return vragenlijsten;
    }

    public List<Quiz> getQuizes() {
        return quizes;
    }

    public void speelIndividueleQuiz() {

	}

	public void selecteerVragenlijst(int id) {

	}

	public void voegVragenlijstToe(Vragenlijst vragenlijst){
        vragenlijsten.add(vragenlijst);
    }

    public void voegQuizToe(Quiz quiz){
        quizes.add(quiz);
    }

}
