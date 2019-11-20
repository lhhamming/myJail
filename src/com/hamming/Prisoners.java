package com.hamming;

public class Prisoners {

    private String Name;
    private String Crime;
    private int Age;
    private int SentencedFor;
    private boolean Solitary;


    public Prisoners(String name, String crime, int age, int sentencedFor, boolean solitary){
        this.Name = name;
        this.Crime = crime;
        this.Age = age;
        this.SentencedFor = sentencedFor;
        this.Solitary = solitary;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCrime() {
        return Crime;
    }

    public void setCrime(String crime) {
        Crime = crime;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSentencedFor() {
        return SentencedFor;
    }

    public void setSentencedFor(int sentencedFor) {
        SentencedFor = sentencedFor;
    }

    public boolean isSolitary() {
        return Solitary;
    }

    public void setSolitary(boolean solitary) {
        Solitary = solitary;
    }


    @Override
    public String toString(){
        return "\n"+ Name + "\n" + "Crime: " + Crime + "\n" + "Age: " + Age + "\n" + "Sentenced for years: " + SentencedFor + "\n" + "In solitary? " + Solitary;
    }

}
