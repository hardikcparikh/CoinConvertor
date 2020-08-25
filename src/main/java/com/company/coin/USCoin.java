package com.company.coin;

import java.util.HashMap;

public class USCoin extends Coin {

   private final static int DOLLARS = 100;             // number of cents in dollar
   private final static int QUARTERS = 25;             // number of cents in quarter
   private final static int DIMES = 10;                // number of cents in dime
   private final static int NICKELS = 5;               // number of cents in nickel

   private final static int coins[]=new int[]{DOLLARS,QUARTERS,DIMES,NICKELS};

    private HashMap<Integer,String> coinMap=new HashMap<Integer, String>();

   public USCoin()
   {
       super.setCoins(coins);
       coinMap.put(0,"Dollars");
       coinMap.put(1,"Quarters");
       coinMap.put(2,"Dimes");
       coinMap.put(3,"Nickels");
       coinMap.put(4,"Cents");
       super.setCoinMap(coinMap);
   }

}
