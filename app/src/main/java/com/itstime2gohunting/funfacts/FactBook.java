package com.itstime2gohunting.funfacts;

import java.util.Random;


public class FactBook {

    public String[] mFacts = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    public String getFact() {

        String fact = "";

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;

    }
}
