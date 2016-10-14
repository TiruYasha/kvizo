package ica.oose.ooad.remi;

public class MeerkeuzeVraag extends Vraag {

	private Positie[] posities;

    public MeerkeuzeVraag(String taal, String vertaling) {
        super(taal, vertaling);
    }

    public boolean beantwoordVraag(String antwoord) {
		return false;
	}

	public void getAntwoorden() {

	}

}
