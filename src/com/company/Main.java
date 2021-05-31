package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random coin = new Random();
        int toss;
        toss = coin.nextInt(2);
        switch(toss){
            case 0 :
                System.out.println("tails");
                break;
            case 1 :
                System.out.println("heads");
                break;
        }
    }
}

