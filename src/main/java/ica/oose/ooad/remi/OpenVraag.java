package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;

public class OpenVraag extends Vraag{

	private List<Antwoord> antwoorden;

    public OpenVraag(String taal, String vertaling, int tijd, int punten) {
        super(taal, vertaling, tijd, punten, VraagType.OPEN);
        antwoorden = new ArrayList<Antwoord>();
    }

    public boolean beantwoordVraag(String antwoord) {
        for (Antwoord antwoordchecken : antwoorden) {
            if(antwoord.toLowerCase().equals(antwoordchecken.getVertaling("NL").toLowerCase()))
                return true;
        }
        return false;
	}

	public void voegAntwoordToe(Antwoord antwoord){
        antwoorden.add(antwoord);
    }
}
