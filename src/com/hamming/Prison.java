package com.hamming;

import java.util.ArrayList;

public class Prison {

    private ArrayList<Prisoner> prisoners = new ArrayList<>();

    public void addPrisoner(String name, String crime, int age, int sentencedFor, boolean solitary){
        Prisoner prisoner = new Prisoner(name,crime,age,sentencedFor,solitary);
        prisoners.add(prisoner);
    }

    @Override
    public String toString(){
        return prisoners.toString();
    }

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

    public void addPrisonersBulk(ArrayList<Prisoner> prisonerBulk) {
        for (Prisoner p : prisonerBulk){
            Prisoner prisoner = new Prisoner(p.getName(),p.getCrime(),p.getAge(),p.getSentencedFor(),p.getSolitary());
            prisoners.add(prisoner);
        }
    }

    public String letPrisonerFree(String userInput) {
        int tempIndex = 0;
        for (Prisoner p : prisoners){
            if(p.getName().equals(userInput)){
                prisoners.remove(tempIndex);
                return "the prisoner has been set free!";
            }
            tempIndex++;
        }
        return "the prisoner has not been found! sorry.";
    }
}
