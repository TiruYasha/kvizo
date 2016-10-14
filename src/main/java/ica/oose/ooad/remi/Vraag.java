package ica.oose.ooad.remi;

public class Vraag extends Vertaling {

	private int tijd;

	private int punten;

    public Vraag(String taal, String vertaling, int tijd, int punten) {
        super(taal,vertaling);
        this.tijd = tijd;
        this.punten = punten;
    }

    public boolean beantwoordVraag(String antwoord) {
		return false;
	}

}
