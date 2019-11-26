package com.hamming;

public class Prisoner {

    private String Name;
    private String Crime;
    private int Age;
    private int SentencedFor;
    private boolean Solitary;


    public Prisoner(String name, String crime, int age, int sentencedFor, boolean solitary){
        this.Name = name;
        this.Crime = crime;
        this.Age = age;
        this.SentencedFor = sentencedFor;
        this.Solitary = solitary;

    }

    public String getName() {
        return Name;
    }

    public String getCrime() {
        return Crime;
    }

    public int getAge() {
        return Age;
    }

    public int getSentencedFor() {
        return SentencedFor;
    }

    public boolean getSolitary() {
        return Solitary;
    }


    @Override
    public String toString(){
        return "\n"+ Name + "\n" + "Crime: " + Crime + "\n" + "Age: " + Age + "\n" + "Sentenced for years: " + SentencedFor + "\n" + "In solitary? " + Solitary;
    }

}
