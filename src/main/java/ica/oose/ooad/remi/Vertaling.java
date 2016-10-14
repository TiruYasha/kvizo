package ica.oose.ooad.remi;

import java.util.HashMap;
import java.util.Map;

public class Vertaling {

    private Map<String,String> dictionary;

    protected Vertaling(String taal, String vertaling){
        dictionary = new HashMap<String, String>();
        voegVertalingToe(taal,vertaling);
    }

    public void voegVertalingToe(String taal, String vertaling) {
        dictionary.put(taal, vertaling);
    }

    public String getVertaling(String taal)
	{
		return dictionary.get(taal);
	}

}