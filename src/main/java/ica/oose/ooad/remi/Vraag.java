package ica.oose.ooad.remi;

public class Vraag extends Vertaling {

    private VraagType type;

	private int tijd;

	private int punten;

    public Vraag(String taal, String vertaling, int tijd, int punten, VraagType type) {
        super(taal,vertaling);
        this.tijd = tijd;
        this.punten = punten;
        this.type = type;
    }

    public VraagType getType() {
        return type;
    }

    public int getPunten() {
        return punten;
    }
}
