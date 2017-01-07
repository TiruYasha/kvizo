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
        List<Integer> indexAlreadyUsed = new ArrayList<>();
        int i = 0;
        while( i < 10)
        {
            int index = Utility.getRandomWaarde(0, vragen.size());
            if(!indexAlreadyUsed.contains(index)) {
                indexAlreadyUsed.add(index);
                tienvragen.add(vragen.get(index));
                i++;
            }
        }

        return tienvragen;
	}

    public void voegVraagToe(Vraag vraag) {
        this.vragen.add(vraag);
    }
}
