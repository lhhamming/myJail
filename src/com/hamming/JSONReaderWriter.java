package com.hamming;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class JSONReaderWriter {
    private Prison p;
    private String JSONFileLocation;
    public JSONReaderWriter(Prison p, String JSONFileLocation) {
        this.p = p;
        this.JSONFileLocation = JSONFileLocation;
    }

    public void SavePrison() {
        JSONArray jsonArray = new JSONArray();
        for (Prisoner prisoner : p.getPrisonersBulk()) {
            jsonArray.put(prisoner.toJSONObject());
        }
        try {
            String jsonString = jsonArray.toString(2);
            Files.write(Paths.get(JSONFileLocation), jsonString.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Prisoner> getPrisoners() {
        ArrayList<Prisoner> prisonerArrayList = new ArrayList<>();
        try{
            String jsonString = new String(Files.readAllBytes(Paths.get(JSONFileLocation)));
            JSONArray jsonArray = new JSONArray(jsonString);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Prisoner prisoner = new Prisoner(jsonObject);
                prisonerArrayList.add(prisoner);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prisonerArrayList;
    }
}
