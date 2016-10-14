package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;

public class OpenVraag extends Vraag{

	private List<Antwoord> antwoorden;

    public OpenVraag(String taal, String vertaling, int tijd, int punten) {
        super(taal, vertaling, tijd, punten);
        antwoorden = new ArrayList<Antwoord>();
    }

    public boolean beantwoordVraag(String antwoord) {
		return false;
	}

	public List<Antwoord> getAntwoorden() {
        return antwoorden;
	}

	public void voegAntwoordToe(Antwoord antwoord){
        antwoorden.add(antwoord);
    }
}
