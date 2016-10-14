package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;

public class Vragenlijst extends Vertaling {

	private int highscore;

	private int aankoopbedrag;

	private int id;

	private List<Vraag> vragen;

    public Vragenlijst(int id, String taal, String vertaling, int aankoopbedrag) {
        super(taal, vertaling);
        vragen = new ArrayList<Vraag>();

        this.id = id;
        this. aankoopbedrag = aankoopbedrag;
    }

    public List<Vraag> getTienVragen() {
        return null;
	}

}
