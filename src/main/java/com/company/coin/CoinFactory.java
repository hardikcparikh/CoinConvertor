package com.company.coin;

public class CoinFactory {
    public static final String COUNTRY_US="US";
    public static final String COUNTRY_INDIA="INDIA";
    public static final String COUNTRY_EUROPE="EUROPE";

    public static Coin getCoin(String country)
    {
        Coin coin=null;
        if(country!=null && !country.equalsIgnoreCase(""))
        {
            if(country.equalsIgnoreCase(COUNTRY_US))
                coin=new USCoin();

            if(country.equalsIgnoreCase(COUNTRY_INDIA))
                coin=new IndiaCoin();

            if(country.equalsIgnoreCase(COUNTRY_EUROPE))
                coin=new EuroCoin();

        }
        else
            coin= new USCoin();


        return coin;

    }
}
