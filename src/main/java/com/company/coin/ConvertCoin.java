package com.company.coin;

import java.util.Scanner;

public class ConvertCoin {
    public static void main (String[] args) {

        System.out.println("Convert Coin Program");
        System.out.println("----------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Country (US,INDIA,EUROPE): ");
        String country = input.next();
        System.out.println("Enter total number of cents (positive integer): ");
        int cents = input.nextInt();
        System.out.println();

        Coin coin = CoinFactory.getCoin(country);
        int result[]= coin.convertCoin(cents);
        coin.printAmount(result);

    }
}
