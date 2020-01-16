package com.hamming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Prison p = new Prison();
    boolean run = true;
    JSONReaderWriter r = new JSONReaderWriter(p, "src/prisoners.json");


    public void startMenu(){
        p.addPrisonersBulk(r.getPrisoners());
        while (run) {
            System.out.println("Prison Menu!");
            System.out.println("-----------------------");
            System.out.println("1. Add prisoner to cell");
            System.out.println("2. Add prisoner to holding cell");
            System.out.println("3. Release prisoner from holding cell");
            System.out.println("4. Show prisoners in cells");
            System.out.println("5. Create a test set of prisoners");
            System.out.println("6. Create a test set of prisoners using an csv file");
            System.out.println("9. Exit the Prison");
            System.out.println("-----------------------");
            Scanner sc = new Scanner(System.in);
            while(!sc.hasNextInt()){
                System.out.println("Please input a number");
                sc.next();
            }
            menuSelection(sc.nextInt());
        }
    }

    public void menuSelection(int menuChoice){
        switch (menuChoice){
            case 1:
                p.addPrisoner(createPrisoner());
                System.out.println(p);
                break;

            case 2:
                p.HoldingCellAddPrisoner(createPrisoner());
                break;

            case 3:
                String prisonerName = getName();
                System.out.println(p.letPrisonerFree(prisonerName));
                break;

            case 4:
                System.out.println(p);
                break;

            case 5:
                Prisoner Luuk = new Prisoner("Luuk Hamming", "Murder", 19,40,false);
                Prisoner Zyax = new Prisoner("Zyax", "Stole from the AH", 20,12,true);
                Prisoner Weazy = new Prisoner("Weazy", "Being weeb", 18,2,false);
                ArrayList<Prisoner> prisoners = new ArrayList<>();
                prisoners.add(Luuk);
                prisoners.add(Zyax);
                prisoners.add(Weazy);
                p.addPrisonersBulk(prisoners);
                break;

            case 6:
                p.addPrisonersBulk(getPrisonersFromFile());
                break;
            /*
            case 7:
                p.addPrisonersBulk(r.getPrisoners());
                break;

             */


            case 9:
                r.SavePrison();
                run = false;
                break;

            default:
                System.out.println("Please choose something from the menu");
                break;
        }
    }

    private ArrayList<Prisoner> getPrisonersFromFile() {
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        File PrisonerFile = new File(new File("src/prisoners.csv").getAbsolutePath());
        String PrisonerData = "";
        try {
            Scanner PrisonerReader = new Scanner(PrisonerFile);
            PrisonerReader.nextLine();
            while(PrisonerReader.hasNextLine()){
                    PrisonerData = PrisonerReader.nextLine();
                    String[] PrisonerDataArray = PrisonerData.split(";");
                    if(PrisonerDataArray.length == 5) {
                        try {
                            if(PrisonerDataArray[4].equalsIgnoreCase("yes")) {
                                prisoners.add(new Prisoner(PrisonerDataArray[0], PrisonerDataArray[1], Integer.parseInt(PrisonerDataArray[2]), Integer.parseInt(PrisonerDataArray[3]), true));
                            }
                            else{
                                    prisoners.add(new Prisoner(PrisonerDataArray[0], PrisonerDataArray[1], Integer.parseInt(PrisonerDataArray[2]), Integer.parseInt(PrisonerDataArray[3]), false));
                                }
                            }
                        catch (Exception e){
                            System.out.println("Found a faultive line. Skipped");
                        }
                    }
                    else{
                        System.out.println("Found a faultive line. Skipped");
                    }
            }
            PrisonerReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return prisoners;
    }


    private String getName() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private Prisoner createPrisoner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is his or her full name?");
        String name = sc.nextLine();
        System.out.println("What was his or her Crime.");
        String Crime = sc.nextLine();
        System.out.println("What was his or her age.");
        while(!sc.hasNextInt()){
            System.out.println("Please type in his or her age in numbers. E.X: 40 or 24 ");
            sc.next();
        }
        int Age = sc.nextInt();
        System.out.println("For how many years has he or she been sentenced for?");
        while(!sc.hasNextInt()){
            System.out.println("Please fill in the years, for example: 2 or 10 ");
            sc.next();
        }
        int SentencedFor = sc.nextInt();
        boolean solitary = false; //TODO: Create an way to check if the person enters an valid answer for the prisoner beeing solitary

        Prisoner prisoner = new Prisoner(name,Crime,Age,SentencedFor,solitary);
        return prisoner;
    }
}
