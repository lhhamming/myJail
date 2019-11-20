package com.hamming;

public class Main {

    public static void main(String[] args) {
	Prison prison = new Prison();
	prison.addPrisoner("Luuk Hamming", "Murder", 19,40,false);
	prison.addPrisoner("Joyce Richter", "Robbed a bank", 20,5,false);

	    System.out.println(prison);
        System.out.println(prison.getPrisoners(20));
    }
}
