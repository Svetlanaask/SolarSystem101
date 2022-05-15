package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.moon="4";
        FactorX.Planet="2";
        FactorX.Stars="1000";

        //adding features to our sun
        FeatureSun Xfact=new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1 000 000 000 km";
        Xfact.heat="2548963kj";

    }

}
