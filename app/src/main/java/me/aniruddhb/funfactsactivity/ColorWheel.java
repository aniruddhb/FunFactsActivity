package me.aniruddhb.funfactsactivity;

import java.util.*;
import android.graphics.Color;

public class ColorWheel {

    // Member variable (properties about the object)
    public String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };


    public int getColor() {
        Random randomGen = new Random();
        int randNum = randomGen.nextInt(mColors.length);

        return Color.parseColor(mColors[randNum]);
    }
}
