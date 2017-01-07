package ica.oose.ooad.remi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtilityTests {

    @Test
    public void randomWaardeMagGeenOutOfRangeExceptionGooien()
    {
        int min = 0;
        int max = 10;
        boolean outOfRange = false;

        for(int i = 0; i < 1000; i++)
        {
            if(!outOfRange)
            {
                int randomWaarde = Utility.getRandomWaarde(min,max);

                System.out.println(randomWaarde);
                outOfRange = randomWaarde < min || randomWaarde >= max;
            }
        }

        Assert.assertFalse(outOfRange);
    }
}
