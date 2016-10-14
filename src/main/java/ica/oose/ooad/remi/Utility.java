package ica.oose.ooad.remi;

import java.util.Random;

/**
 * Created by Michel Douma on 14-10-2016.
 */
public class Utility {
    public static int getRandomWaarde(int min, int max)
    {
        Random random = new Random();

        int randomNum = random.nextInt((max - min)) + min;

        return randomNum;
    }
}
