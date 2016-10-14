package ica.oose.ooad.remi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz {

	private int score;

	private Vragenlijst vragenlijst;

	private List<VraagUitQuiz> vragenUitQuiz;

	private VraagUitQuiz huidigeVraagUitQuiz;
    private VraagUitQuiz willekeurigeVraag;

    public Quiz(Vragenlijst vragenlijst) {
        this.vragenlijst = vragenlijst;
        setTienVragen();
    }

	public void beantwoordVraag(String antwoord) {

	}

    public VraagUitQuiz getHuidigeVraagUitQuiz() {
        return huidigeVraagUitQuiz;
    }

    public void setHuidigeVraagUitQuiz(VraagUitQuiz huidigeVraagUitQuiz) {
        this.huidigeVraagUitQuiz = huidigeVraagUitQuiz;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
        huidigeVraagUitQuiz = getWillekeurigeVraag();
    }

    public VraagUitQuiz getWillekeurigeVraag() {
        int listLength = vragenUitQuiz.size();
        int randomVraag = getRandomWaarde(0, listLength);

        VraagUitQuiz vraag = vragenUitQuiz.get(randomVraag);
        vragenUitQuiz.remove(randomVraag);
        return vraag;
    }

    public int getRandomWaarde(int min, int max)
    {
        Random random = new Random();

        int randomNum = random.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
