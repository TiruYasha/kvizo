package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;

public class MeerkeuzeVraag extends Vraag {

	private List<Positie> posities;

    public MeerkeuzeVraag(String taal, String vertaling, int tijd, int punten) {
        super(taal, vertaling, tijd, punten, VraagType.MEERKEUZE);
        posities = new ArrayList<Positie>();
    }

    public boolean beantwoordVraag(String antwoord) {
        for (Positie positie : posities) {
            if(positie.getPositie() == antwoord.toUpperCase().toCharArray()[0])
            {
                if(positie.getIsGoedAntwoord())
                    return true;
                else
                    return false;
            }
        }

        return false;
	}

	public void voegPositieToe(Positie positie){
        posities.add(positie);
    }

    public void toonPosities() {

        for (Positie positie: posities) {
            positie.toonAntwoord();
        }
    }
}
