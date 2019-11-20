package com.hamming;

import java.util.ArrayList;

public class Prison {

    private ArrayList<Prisoners> prisoners = new ArrayList<>();

    public void addPrisoner(String name, String crime, int age, int sentencedFor, boolean solitary){
        Prisoners prisoner = new Prisoners(name,crime,age,sentencedFor,solitary);
        prisoners.add(prisoner);
    }

    @Override
    public String toString(){
        return prisoners.toString();
    }

    public boolean getPrisoners(int age) {
        return true;
    }
}
