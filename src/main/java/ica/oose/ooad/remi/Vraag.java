package ica.oose.ooad.remi;

public class Vraag extends Vertaling {

	private int tijd;

	private int punten;

    public Vraag(String taal, String vertaling) {
        super(taal, vertaling);
    }

    public boolean beantwoordVraag(String antwoord) {
		return false;
	}

}
