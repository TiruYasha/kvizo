package ica.oose.ooad.remi;

public class VraagUitQuiz {

	private boolean resultaat;

	private int tijdInSec;

	private Vraag vraag;

    public VraagUitQuiz(Vraag vraag) {
        this.vraag = vraag;
    }

    public boolean isResultaat() {
        return resultaat;
    }

    public void setResultaat(boolean resultaat) {
        this.resultaat = resultaat;
    }

    public int getTijdInSec() {
        return tijdInSec;
    }

    public void setTijdInSec(int tijdInSec) {
        this.tijdInSec = tijdInSec;
    }

    public Vraag getVraag() {
        return vraag;
    }

    public void beantwoordVraag(String antwoord) {

	}

	public void toonVraag(){
        ConsoleHandler.getInstance().getInvoer(vraag.getVertaling("NL"));
    }

}
