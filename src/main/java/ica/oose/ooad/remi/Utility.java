package ica.oose.ooad.remi;

import java.util.Random;

public class Utility {
    public static int getRandomWaarde(int min, int max)
    {
        Random random = new Random();

        int randomNum = random.nextInt((max - min)) + min;

        return randomNum;
    }
}
