package com.hamming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Prison prison = new Prison();
	prison.addPrisoner("Luuk Hamming", "Murder", 19,40,false);
	prison.addPrisoner("Joyce Richter", "Robbed a bank", 20,5,false);
	prison.addPrisoner("Sven Rolleman", "Murder", 21,5,false);
	prison.addPrisoner("Thijmen Hogenkamp", "Loli Rape", 20,5,true);
	prison.addPrisoner("Pim Wingelaar", "Illegal Internet Usage", 20,50,false);
	prison.addPrisoner("Felix Ruwe", "Loli Rape", 19,16,true);
	    System.out.println(prison);
		System.out.println("Prisoners byt the age of 20");
        System.out.println(prison.getPrisonersByAge(20));
		System.out.println("Prisoners by the crime of Murder");
		System.out.println(prison.getPrisonersByCrime("Murder"));
		System.out.println("Prisoners in Solitary");
		System.out.println(prison.getPrisonersInSolitary());
		System.out.println("Prisoners in solitary and older than 20");
		System.out.println(prison.getPrisonersInSolitaryandAge(20));
		System.out.println("Average of the sentenced years of the prisoners");
		System.out.println(prison.getAverageSentecedYears());
		System.out.println("Average of the prisoners ages");
		System.out.println(prison.getAverageAge());

		Prisoners Luuk = new Prisoners("Luuk Hamming", "Murder", 19,40,false);
		Prisoners Zyax = new Prisoners("Zyax", "Stole from the AH", 20,12,true);
		Prisoners Weazy = new Prisoners("Weazy", "Being weeb", 18,2,false);
		ArrayList<Prisoners> prisoners = new ArrayList<>();
		prisoners.add(Luuk);
		prisoners.add(Zyax);
		prisoners.add(Weazy);

		System.out.println("Bulk adding Prisoners");
		prison.addPrisonersBulk(prisoners);
		System.out.println(prison);

		System.out.println("We are going to let 1 prisoner free! Type in his or her Name!");
		Scanner userInput = new Scanner(System.in);
		String prisonerToBeLetFree = userInput.nextLine();
		prison.letPrisonerFree(prisonerToBeLetFree);
		System.out.println(prison);
    }
}
