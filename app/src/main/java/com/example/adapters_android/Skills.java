package com.example.adapters_android;

import java.util.ArrayList;

public class Skills {
    private String Name;
    private String language;

    public Skills(String name, String language) {
        Name = name;
        this.language = language;
    }

    public String getName() {
        return Name;
    }

    public String getLanguage() {
        return language;
    }

    public static ArrayList<Skills> get10Random(){
        ArrayList<Skills> arr = new ArrayList<>();
        arr.add(new Skills("Arshad", "JAVA"));
        arr.add(new Skills("Navin", "C++"));
        arr.add(new Skills("GPMuthu", "Comedy"));
        arr.add(new Skills("Nikhil", "Python"));
        arr.add(new Skills("Vairamuthu", "Lyrics"));
        arr.add(new Skills("Bala", "Direction"));
        arr.add(new Skills("Gajini", "MemoryLoss"));
        arr.add(new Skills("Frank", "JAVA"));
        arr.add(new Skills("Yedukondalu", "Money Making"));
        arr.add(new Skills("Ayyappa", "Black"));
        arr.add(new Skills("Pullingo", "Unity"));
        arr.add(new Skills("Stalin", "Victory"));

        return arr;
    }
}
