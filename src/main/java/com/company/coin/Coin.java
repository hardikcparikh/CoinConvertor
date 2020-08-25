package com.company.coin;

import java.util.HashMap;

public  class Coin {
    public int coins[];
    private HashMap<Integer,String> coinMap=new HashMap<Integer, String>();
    public void setCoins(int [] coins)
    {
        this.coins=coins;
    }
    public  int[]  convertCoin(int cents)
    {
        int result[]=new int[coins.length+1];
        int i=0;
        for(i=0;i<coins.length;i++) {
            result[i] = cents / coins[i];
            cents = cents % coins[i];
        }
        result[i]=cents;
        return result;
    }
    public void printAmount(int result[])
    {
        for(int i=0;i<result.length;i++)
        {
            if(result[i]>0)
                System.out.println(coinMap.get(i)+" = " + result[i]);
        }
    }

    public void setCoinMap(HashMap<Integer, String>  coinMap) {
        this.coinMap=coinMap;
    }
}
