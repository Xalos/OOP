package fr.mds.tpverbe.launcher;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		String[][] verbeConjuge;
		String[] verbeList = {"manger","jouer"};
		
		Conjugateur conjug = new Conjugateur();
		
		
		
		 verbeConjuge = conjug.conjug("manger");
		 
		 logResult(verbeConjuge);
		
		 
		 
		 
		 verbeConjuge = conjug.conjug(verbeList);
		
		 logResult(verbeConjuge);
		 
		 
		 
		 
		 Scanner sc = new Scanner(System.in); 
		 
		 String verbe = sc.nextLine(); 
		 
		 verbeConjuge = conjug.conjug(verbe);
		
		 logResult(verbeConjuge);
		 
		 
		 
	}
	
	
	private static void logResult(String[][] verbeConjuge) {
		
		 
		 for(var f = 0;f < verbeConjuge.length;f++) {
			 System.out.println(" ");
		 for(String i : verbeConjuge[f]) {
			 System.out.println(i);
		 }
		 
		
		 }
		 
	}
	

	
}
