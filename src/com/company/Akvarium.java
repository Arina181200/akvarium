package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Akvarium {
    private ArrayList<Fish> fishes = new ArrayList<Fish>();

    void fillFish(Fish fish) {
        this.fishes.add(fish);
    }

    void removeFish(Fish fish) {
        this.fishes.remove(fish);
    }

    void allFish()
    {
        for(Fish f:fishes)
        {
            System.out.println(fishes);
        }


    }

    @Override
    public String toString() {
        return "Akvarium{" +
                "fishes=" + fishes +
                '}';
    }
}
