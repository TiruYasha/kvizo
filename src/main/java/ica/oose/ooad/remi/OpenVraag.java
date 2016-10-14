package ica.oose.ooad.remi;

public class OpenVraag extends Vraag{

	private Antwoord[] antwoorden;

    public OpenVraag(String taal, String vertaling) {
        super(taal, vertaling);
    }

    public boolean beantwoordVraag(String antwoord) {
		return false;
	}

	public void getAntwoorden() {

	}
}
