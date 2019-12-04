package com.hamming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Prison prison = new Prison();
	/*
	prison.addPrisoner("Luuk Hamming", "Murder", 19,40,false);
	prison.addPrisoner("Joyce Richter", "Robbed a bank", 20,5,false);
	prison.addPrisoner("Sven Rolleman", "Murder", 21,5,false);
	prison.addPrisoner("Thijmen Hogenkamp", "Loli Rape", 20,5,true);
	prison.addPrisoner("Pim Wingelaar", "Illegal Internet Usage", 20,50,false);
	prison.addPrisoner("Felix Ruwe", "Loli Rape", 19,16,true);
	    System.out.println(prison);
		System.out.println("Prisoner byt the age of 20");
        System.out.println(prison.getPrisonersByAge(20));
		System.out.println("Prisoner by the crime of Murder");
		System.out.println(prison.getPrisonersByCrime("Murder"));
		System.out.println("Prisoner in Solitary");
		System.out.println(prison.getPrisonersInSolitary());
		System.out.println("Prisoner in solitary and older than 20");
		System.out.println(prison.getPrisonersInSolitaryandAge(20));
		System.out.println("Average of the sentenced years of the prisoners");
		System.out.println(prison.getAverageSentecedYears());
		System.out.println("Average of the prisoners ages");
		System.out.println(prison.getAverageAge());

		Prisoner Luuk = new Prisoner("Luuk Hamming", "Murder", 19,40,false);
		Prisoner Zyax = new Prisoner("Zyax", "Stole from the AH", 20,12,true);
		Prisoner Weazy = new Prisoner("Weazy", "Being weeb", 18,2,false);
		ArrayList<Prisoner> prisoners = new ArrayList<>();
		prisoners.add(Luuk);
		prisoners.add(Zyax);
		prisoners.add(Weazy);

		System.out.println("Bulk adding Prisoner");
		prison.addPrisonersBulk(prisoners);
		System.out.println(prison);

		System.out.println("We are going to let 1 prisoner free! Type in his or her Name!");
		Scanner userInput = new Scanner(System.in);
		String prisonerToBeLetFree = userInput.nextLine();
		System.out.println(prison.letPrisonerFree(prisonerToBeLetFree));
		System.out.println(prison);

	 */
	/*
        prison.addPrisoner("Luuk Hamming", "Murder", 19,40,false);
        prison.addPrisoner("Joyce Richter", "Robbed a bank", 20,5,false);
        prison.addPrisoner("Sven Rolleman", "Murder", 21,5,false);
        prison.addPrisoner("Thijmen Hogenkamp", "Loli Rape", 20,5,true);
        prison.addPrisoner("Pim Wingelaar", "Illegal Internet Usage", 20,50,false);
        prison.addPrisoner("Felix Ruwe", "Loli Rape", 19,16,true);
        System.out.println(prison.Cells());
        System.out.println(prison.getPrisonersAmountHoldingCell());
        System.out.println(prison.getHoldingCellMaxCapacity());
        System.out.println(prison.isHoldingCellFull());
        Prisoner p = new Prisoner("Luuk Hamming", "Murder", 19,40,false);
        prison.HoldingCellAddPrisoner(p);
        System.out.println(prison.HoldingCell());
	 */
	Menu m = new Menu();
	m.startMenu();
    }
}
