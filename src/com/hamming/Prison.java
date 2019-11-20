package com.hamming;

import java.util.ArrayList;
import java.util.Scanner;

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

    public String getPrisonersByAge(int age) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < prisoners.size(); i++) {
            if(prisoners.get(i).getAge() >= 20){
                sb.append(prisoners.get(i).toString() + "\n");
            }
        }
        return sb.toString();
    }

    public String getPrisonersByCrime(String crime) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < prisoners.size(); i++) {
            if(prisoners.get(i).getCrime().equals(crime)){
                sb.append(prisoners.get(i).toString() + "\n");
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
                if(prisoners.get(i).getAge() >= 20){
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

    public void addPrisonersBulk(ArrayList<Prisoners> prisonersBulk) {
        for (int i = 0; i < prisonersBulk.size(); i++) {
            Prisoners prisoner = new Prisoners(prisonersBulk.get(i).getName(),prisonersBulk.get(i).getCrime(),prisonersBulk.get(i).getAge(),prisonersBulk.get(i).getSentencedFor(),prisonersBulk.get(i).getSolitary());
            prisoners.add(prisoner);
        }

    }

    public String letPrisonerFree(String userInput) {
        for (int i = 0; i < prisoners.size(); i++) {
            if(prisoners.get(i).getName().equals(userInput)){
                prisoners.remove(i);
                return "the prisoner has been set free!";
            }
        }
        return "the prisoner has not been found! sorry.";
    }
}
