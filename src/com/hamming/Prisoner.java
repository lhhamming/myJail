package com.hamming;

import org.json.JSONObject;

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

    public Prisoner(JSONObject jsonObject) {
        this.Name = jsonObject.getString("name");
        this.Crime = jsonObject.getString("crime");
        this.Age = jsonObject.getInt("age");
        this.SentencedFor = jsonObject.getInt("sentenced_for");
        this.Solitary = jsonObject.getBoolean("solitary");
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
        return "\n"+ Name + " " + "Crime: " + Crime + " " + "Age: " + Age + " " + "Sentenced for years: " + SentencedFor + " " + "In solitary? " + Solitary;
    }

    public JSONObject toJSONObject() {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("name", Name);
        jsonObj.put("crime", Crime);
        jsonObj.put("age", Age);
        jsonObj.put("sentenced_for", SentencedFor);
        jsonObj.put("solitary", Solitary);
        return jsonObj;

    }
}
