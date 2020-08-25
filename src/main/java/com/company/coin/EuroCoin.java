package com.company.coin;

import java.util.HashMap;

public class EuroCoin extends Coin {

   private final static int EURO = 100;             // number of cents in Euro
   private final static int FIFTY = 50;             // number of cents in Fifty cents
   private final static int TWENTY = 20;            // number of cents in twenty cents
   private final static int TEN = 10;               // number of cents in ten cents
   private final static int FIVE = 5;               // number of cents in five cents

    private final static int coins[]=new int[]{EURO,FIFTY,TWENTY,TEN, FIVE};
    private HashMap<Integer,String> coinMap=new HashMap<Integer, String>();

    public EuroCoin()
    {
        super.setCoins(coins);
        coinMap.put(0,"Euro");
        coinMap.put(1,"Fifty Cents");
        coinMap.put(2,"Twenty Cents");
        coinMap.put(3,"Ten Cents");
        coinMap.put(4,"Five Cents");
        coinMap.put(5,"Cents");
        super.setCoinMap(coinMap);
    }

}
