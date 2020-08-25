package com.company.coin;

import java.util.HashMap;

public class IndiaCoin extends Coin {

   private final static int RUPEE = 100;            // number of paise in rupee
   private final static int FIFTY = 50;             // number of paise in fifty
   private final static int TWENTYFIVE = 25;        // number of paise in quarter
   private final static int TEN = 10;               // number of paise in ten
    private final static int PAISE = 1;               // number of paise in ten

   private final static int coins[]=new int[]{RUPEE,FIFTY,TWENTYFIVE,TEN};
   private HashMap<Integer,String> coinMap=new HashMap<Integer, String>();

    public IndiaCoin()
    {
        super.setCoins(coins);
        coinMap.put(0,"Rupee");
        coinMap.put(1,"Fifty Paise");
        coinMap.put(2,"Twenty Five Paise");
        coinMap.put(3,"Ten Paise");
        coinMap.put(4,"Paise");
        super.setCoinMap(coinMap);
    }


}
