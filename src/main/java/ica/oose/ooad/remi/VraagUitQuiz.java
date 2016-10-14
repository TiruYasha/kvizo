package ica.oose.ooad.remi;

public class VraagUitQuiz {

	private Boolean resultaat = null;

	private int tijdInSec;

	private Vraag vraag;

    public VraagUitQuiz(Vraag vraag) {
        this.vraag = vraag;
    }

    public Boolean getResultaat() {
        return resultaat;
    }

    public boolean beantwoordVraag(String antwoord) {
        switch (vraag.getType()){
            case MEERKEUZE:
                MeerkeuzeVraag meerkeuzeVraag = (MeerkeuzeVraag) vraag;
                resultaat = meerkeuzeVraag.beantwoordVraag(antwoord);
                break;
            case OPEN:
                OpenVraag openVraag = (OpenVraag) vraag;
                resultaat = openVraag.beantwoordVraag(antwoord);
                break;
        }

        if(resultaat)
            ConsoleHandler.getInstance().println("Antwoord is goed");
        else
            ConsoleHandler.getInstance().println("Antwoord is fout");

        return resultaat;
    }

	public void toonVraag(){
        ConsoleHandler.getInstance().println("Vraag: "+ vraag.getVertaling("NL"));
        if(vraag.getType() == VraagType.MEERKEUZE){
            MeerkeuzeVraag meerkeuzeVraag = (MeerkeuzeVraag) vraag;
            meerkeuzeVraag.toonPosities();
        }
    }

    public int getPunten() {
        return vraag.getPunten();
    }
}
