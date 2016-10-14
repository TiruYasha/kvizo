package ica.oose.ooad.remi;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;

public class MeerkeuzeVraag extends Vraag {

	private List<Positie> posities;

    public MeerkeuzeVraag(String taal, String vertaling, int tijd, int punten) {
        super(taal, vertaling, tijd, punten);
        posities = new ArrayList<Positie>();
    }

    public boolean beantwoordVraag(String antwoord) {
		return false;
	}

	public List<Positie> getPosities() {
        return posities;
	}

	public void voegPositieToe(Positie positie){
        posities.add(positie);
    }
}
