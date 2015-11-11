package com.itstime2gohunting.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by John on 8/19/2015.
 */
public class ColorWheel {

    public String[] mColor = {
          "#39add1",
          "#3079ab",
          "#c25975",
          "#e15258",
          "#f9845b",
          "#838cc7",
          "#7d669e",
          "#53bbb4",
          "#e0ab18",
          "#637a91",
          "#f092b0",
          "#b7c0c7" };

    public int getColor() {

        String color = "";

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(mColor.length);

        color = mColor[randomNumber];

        int colors = Color.parseColor(color);

        return colors;

    }
}
