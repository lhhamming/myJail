package com.hamming;

import java.util.ArrayList;

public class Holdingcell {
    private int maxPrisoners;
    private ArrayList<Prisoner> prisoners = new ArrayList<>();

    public Holdingcell(int maxPrisoners) {
        this.maxPrisoners = maxPrisoners;
    }

    public int getPrisonerAmount(){
        int counter = 0;
        if(prisoners == null){
            return 0;
        }
        else{
            for (Prisoner p : prisoners){
                counter++;
            }

            return counter;
        }
    }

    public int getMaxPrisoners(){
        return this.maxPrisoners;
    }

    public void addPrisoner(Prisoner prisoner) {
        prisoners.add(prisoner);
    }

    public String getPrisoners() {
        StringBuilder sb = new StringBuilder();
        for (Prisoner p : prisoners){
            sb.append(p);
        }
        return sb.toString();
    }
}
