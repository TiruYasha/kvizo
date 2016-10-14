package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;

public class Thema extends Vertaling {

	private List<Vragenlijst> vragenlijsten;

    public Thema(String taal, String vertaling){
        super(taal,vertaling);
        vragenlijsten = new ArrayList<Vragenlijst>();
    }

    public void voegVragenLijstToe(Vragenlijst vragenlijst){
        vragenlijsten.add(vragenlijst);
    }

    public void voegVragenLijstToe(List<Vragenlijst> vragenlijsten){
        this.vragenlijsten.addAll(vragenlijsten);
    }

}
