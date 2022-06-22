package it.develhope.for4.entities;

import java.util.Random;

/**
 * This class represents a custom number
 *
 * @author Tania Ielpo
 */

public class CustomNumber {

    private int number;

    //constructor generates and prints a random number between 1 and 12 and assigns it to number
    public CustomNumber(){
        this.number= new Random().nextInt(1,13);
        System.out.println(this.number);
    }

    /**
     *prints all the multiplication table for number in descending order (from 12 to 1)
     */

    public void getMultiplicationTable(){
        for (int i = 12; i >=0 ; i--) {
            System.out.println(this.number+"*"+i+"="+this.number*i);

        }
    }
}
