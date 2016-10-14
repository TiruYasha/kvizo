package ica.oose.ooad.remi;

import java.util.Scanner;

/**
 * Created by Michel Douma on 14-10-2016.
 */
public class ConsoleHandler {

    private static ConsoleHandler instance;
    private static Scanner scanner;

    protected ConsoleHandler(){

    }

    public static ConsoleHandler getInstance(){
        if(instance == null)
        {
            instance = new ConsoleHandler();
            scanner = new Scanner(System.in);
        }

        return instance;
    }

    public void println(String message){
        System.out.println(message);
    }

    public String getInvoer(String message)
    {
        System.out.print(message + " ");
        String inputString = scanner.next();

        return inputString;
    }
}
