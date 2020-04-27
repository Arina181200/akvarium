package com.company;

public class  Fish {
    private String name;
    private String colour;
    private int age;

    public Fish(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
