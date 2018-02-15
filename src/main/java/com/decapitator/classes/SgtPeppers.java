package com.decapitator.classes;

import com.decapitator.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

//@Component("niceMusic")
public class SgtPeppers implements CompactDisc {
    private  String titile = "Otherside";
    private String artist = "Red hot chili peppers";
    public void play() {
        System.out.print("Playing "+titile+" by "+artist );
    }
}
