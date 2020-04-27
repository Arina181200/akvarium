package com.company;

public class FishName extends Akvarium {
    @Override
    public String toString() {
        return "FishName{}";
    }

    public FishName() {
        FishName fishes = new FishName();
        Fish fantik = new Fish("Fantik", "blue", 2);
        Fish sharfik = new Fish("Sharfik", "red", 1);
        Fish zhuzha = new Fish("Zhuzha", "yellow", 3);
        fishes.fillFish(sharfik);
        fishes.fillFish(fantik);
        fishes.fillFish(zhuzha);
        fishes.allFish();

    }
}
