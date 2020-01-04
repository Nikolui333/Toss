package com.semenov.toss;

public class Random {

    public String randomnicity(){
        double a = Math.random();
        int res;

        if (a>0.5)
            res=0;

        else res = 1;

        String str = res+"";

        return str;
    }
}
