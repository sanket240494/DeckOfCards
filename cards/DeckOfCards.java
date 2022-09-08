package com.blz.cards;

import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suitCard = {"Clubs","Diamonds","Hearts","Spades"};
        String[] cardRank = {"1","2","3","4","5","6","7","8","9","10","jack","Queen","King","Ace"};
        String[] cardsArray = new String[52];

        int start = 0;
        int end = 12;
        int stop = 0;
        for (int i = 0; i < 4; i++){
            for (int j = start; j <= end; j++){

                cardsArray[j] = " " +suitCard[i] +"  "+ cardRank[stop]+" ";
                stop++;
            }
            stop = 0;
            start = end + 1;
            end += 13;
        }

        Random random = new Random();
        int f1,f2;
        String temp;
        for (int i = 0; i < 52; i++){
            f1 = random.nextInt(51);
            f2 = random.nextInt(51);
            if (f1 != f2){
                temp = cardsArray[f1];
                cardsArray[f1] = cardsArray[f2];
                cardsArray[f2]= temp;

            }
        }

        int collect = 0;

        for (int i = 0; i <= 4; i++){
            for (int j = 0; j < 9; j++){
                System.out.println(cardsArray[collect]);
                collect++;
            }

            System.out.println("\t");
        }

    }
}
