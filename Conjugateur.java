package fr.mds.tpverbe.launcher;

public class Conjugateur {

	private final String[][] proAndTerm = {{"Je","Tu","Il","Nous","Vous","Ils"},{"e","es","e","ons","ez","ent"}};
	
	
	public Conjugateur() {
	
	}

	
	public String[][] conjug(String verbe) {
	
	
	String conjugList[][] = new String[1][6];
	verbe = verbe.substring(0, verbe.length() - 2);
	
	
	for(var i = 0;i < proAndTerm[1].length;i++) {
		
		conjugList[0][i] = proAndTerm[0][i]+" "+verbe+proAndTerm[1][i];
		
	}
		return conjugList;
	}
	
	
	
	public String[][] conjug(String verbeList[]) {
		
		
		String conjugList[][] = new String[verbeList.length][6];
		
		for(var i = 0;i < verbeList.length;i++) {
		verbeList[i] = verbeList[i].substring(0, verbeList[i].length() - 2);
		}
		
		
		for(var v = 0;v < verbeList.length;v++) {
		
		for(var i = 0;i < proAndTerm[1].length;i++) {
			
			conjugList[v][i] = proAndTerm[0][i]+" "+verbeList[v]+proAndTerm[1][i];
			
		}
		
		
		}
		
			return conjugList;
		}
	
}
