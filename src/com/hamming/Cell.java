package com.hamming;

public class Cell {
    private Prisoner prisoner;
    private int cellNumber;
    private static int counter = 0;

    public Cell(Prisoner prisoner){
        this.prisoner = prisoner;
        cellNumber = getCellNumber();
    }

    private int getCellNumber() {
        counter++;
        cellNumber = counter;
        return cellNumber;
    }

    public String getPrisonerName(){
        return this.prisoner.getName();
    }

    public void removePrisoner(){
        this.prisoner = null;
    }

    public Prisoner getPrisoner(){
        return this.prisoner;
    }

    @Override
    public String toString() {
        if(this.prisoner == null){
            return "";
        }
        else{
            return "Cell number: " + this.cellNumber + "\n" +
                    "Prisoner: " + this.prisoner + "\n";
        }

    }

    public void setPrisoner(Prisoner p) {
        this.prisoner = p;
    }
}
