package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;

public class Vragenlijst extends Vertaling {

	private int highscore;

	private int aankoopbedrag;

	private int id;

    public int getId() {
        return id;
    }

    private List<Vraag> vragen;

    public Vragenlijst(int id, String taal, String vertaling, int aankoopbedrag) {
        super(taal, vertaling);
        vragen = new ArrayList<Vraag>();

        this.id = id;
        this. aankoopbedrag = aankoopbedrag;
    }

    public List<Vraag> getTienVragen() {

        List<Vraag> tienvragen = new ArrayList<Vraag>();

        for(int i = 0; i < 10; i++)
        {
            int index = Utility.getRandomWaarde(0, vragen.size());
            tienvragen.add(vragen.get(index));
        }

        return tienvragen;
	}

    public List<Vraag> getVragen() {
        return vragen;
    }

    public void voegVraagToe(Vraag vraag) {
        this.vragen.add(vraag);
    }
}
