package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

	private int score = 0;

	private Vragenlijst vragenlijst;

	private List<VraagUitQuiz> vragenUitQuiz;

	private VraagUitQuiz huidigeVraagUitQuiz;

    public Quiz(Vragenlijst vragenlijst) {
        this.vragenlijst = vragenlijst;
        setTienVragen();

        int quizLengte = vragenUitQuiz.size();

        for(int i = 0; i < quizLengte; i++)
        {
            setNieuweVraag();
            huidigeVraagUitQuiz.toonVraag();

            String antwoord = ConsoleHandler.getInstance().getInvoer("Antwoord:");
            huidigeVraagUitQuiz.beantwoordVraag(antwoord);
            System.out.println();
        }

        berekenPunten();
    }

    private void berekenPunten() {
        for (VraagUitQuiz vraag: vragenUitQuiz) {
            if(vraag.getResultaat())
                score += vraag.getPunten();
        }
        ConsoleHandler.getInstance().println("Uw score is " + score);
    }

    public VraagUitQuiz getHuidigeVraagUitQuiz()
    {
        return huidigeVraagUitQuiz;
    }

    private void setTienVragen() {
        //TODO 5 open en 5 meerkeuze
        vragenUitQuiz = new ArrayList<VraagUitQuiz>();
        List<Vraag> vragen = vragenlijst.getTienVragen();

        for (Vraag vraag : vragen) {
            vragenUitQuiz.add(new VraagUitQuiz(vraag));
        }
    }

    public void setNieuweVraag() {
        int listLength = vragenUitQuiz.size();

        VraagUitQuiz vraag;
        do {
            int randomVraag = Utility.getRandomWaarde(0, listLength);
            vraag = vragenUitQuiz.get(randomVraag);
        }while (vraag.getResultaat() != null);

        huidigeVraagUitQuiz = vraag;
    }
}
