package com.hamming;

import java.util.ArrayList;

public class Prison {

    //The prisoners Array is now obsolete. it has been replaced by the cells array.
    //private ArrayList<Prisoner> prisoners = new ArrayList<>();
    private ArrayList<Cell> cells = new ArrayList<>();
    private Holdingcell hc = new Holdingcell(5);

    public void addPrisoner(String name, String crime, int age, int sentencedFor, boolean solitary){
        Prisoner prisoner = new Prisoner(name,crime,age,sentencedFor,solitary);
        //prisoners.add(prisoner);
        Cell cell = new Cell(prisoner);
        cells.add(cell);
    }

    public void addPrisoner(Prisoner p){
        //This function will also check for empty prison cells so a prisoner can be put into an empty cell.
        if(cells.size() == 0){
            //If there is no one in the prison then we can add them right away
            Cell cell = new Cell(p);
            cells.add(cell);
        }
        else {
            //There are prisoners in the cells.
            //Lets check for an empty one.
            int tempindex = 0;
            for (Cell cell: cells){
                //If the index is bigger than the amount of cells that means that there are no empty ones, we can just add the prisoners in a new cell
                if(tempindex > cells.size()){
                    Cell newCell = new Cell(p);
                    cells.add(newCell);
                }
                //Check if the cell has an prisoner or not.
                if (cell.getPrisoner() != null) {
                    //There is someone in the prison cell.
                    tempindex++;
                } else {
                    cells.get(tempindex).setPrisoner(p);
                    //There isnt someone on that specefic spot.
                }
            }
        }

    }

    public String letPrisonerFree(String userInput) {
        int tempIndex = 0;
        for (Cell c : cells){
            if(c.getPrisonerName().equals(userInput)){
                cells.get(tempIndex).removePrisoner();
                return "the prisoner has been set free!";
            }
            tempIndex++;
        }
        return "the prisoner has not been found! sorry.";
        /*
        for (Prisoner p : prisoners){
            if(p.getName().equals(userInput)){
                prisoners.remove(tempIndex);
                return "the prisoner has been set free!";
            }
            tempIndex++;
        }
        return "the prisoner has not been found! sorry.";
         */
    }

    public String Cells() {
        StringBuilder sb = new StringBuilder();
        for (Cell c : cells){
            sb.append(c);
        }
        return sb.toString();
    }

    public int getPrisonersAmountHoldingCell(){
        return hc.getPrisonerAmount();
    }

    public int getHoldingCellMaxCapacity(){
        return hc.getMaxPrisoners();
    }


    public boolean isHoldingCellFull() {
        if(hc.getPrisonerAmount() >= hc.getMaxPrisoners()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean HoldingCellAddPrisoner(Prisoner p) {
        if(!isHoldingCellFull()){
            hc.addPrisoner(p);
            return true;
        }
        else{
            return false;
        }
    }

    public String HoldingCell(){
        if(hc.getPrisonerAmount() == 0){
            return "The HoldingCell is empty";
        }
        else{
            return hc.getPrisoners();
        }
    }

    public ArrayList<Prisoner> getPrisonersBulk(){
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        for (Cell cell : cells){
            prisoners.add(cell.getPrisoner());
        }
        return prisoners;
    }

    @Override
    public String toString(){
        return cells.toString();
    }

    public void addPrisonersBulk(ArrayList<Prisoner> prisonerBulk) {
        for (Prisoner p : prisonerBulk){
            Cell c = new Cell(p);
            cells.add(c);
        }
    }

        /*
    public String getPrisonersByAge(int age) {
        StringBuilder sb = new StringBuilder();
        for (Prisoner p : prisoners){
            if(p.getAge() >= age){
                sb.append(p.toString() + "\n");
            }
        }
        return sb.toString();
    }

    public String getPrisonersByCrime(String crime) {
        StringBuilder sb = new StringBuilder();
        for (Prisoner p : prisoners){
            if(p.getCrime().equals(crime)){
                sb.append(p.toString() + "\n");
            }
        }
        return sb.toString();
    }

    public String getPrisonersInSolitary() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < prisoners.size(); i++) {
            if(prisoners.get(i).getSolitary()){
                sb.append(prisoners.get(i).toString() + "\n");
            }
        }
        return sb.toString();
    }

    public String getPrisonersInSolitaryandAge(int Age) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < prisoners.size(); i++) {
            if(prisoners.get(i).getSolitary()){
                if(prisoners.get(i).getAge() >= Age){
                sb.append(prisoners.get(i).toString() + "\n");
                }
            }
        }
        return sb.toString();
    }

    public double getAverageSentecedYears() {
        int total =0;
        for (int i = 0; i < prisoners.size(); i++) {
            total += prisoners.get(i).getSentencedFor();
        }
        double average = total / prisoners.size();

        return average;
    }

    public double getAverageAge() {
        int total =0;
        for (int i = 0; i < prisoners.size(); i++) {
            total += prisoners.get(i).getAge();
        }
        double average = total / prisoners.size();

        return average;
    }
     */
}
