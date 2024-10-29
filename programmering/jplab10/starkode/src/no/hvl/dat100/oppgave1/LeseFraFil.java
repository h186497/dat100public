package no.hvl.dat100.oppgave1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeseFraFil {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/oppgave1/";

	static public void main(String[] args) {

	
		int forsok = 5;
		File file = null;
		
		while(forsok > 0) {
			
			String filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);
			file = new File(MAPPE_STR + filnavn);
			
			
			try {
				
				int linenumber = 1;
				Scanner reader = new Scanner(file);
				
				// les innhold i filen linje for linje
				
				String line;
				while (reader.hasNextLine()) {
					line = reader.nextLine();
					System.out.println(linenumber + " " + line);
					linenumber++;
				}
				
				forsok = -1;
				reader.close();
				
				
			} catch(FileNotFoundException fnfe) {
				
				forsok--;
				JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + fnfe.getMessage());
				

			} finally {
				
				System.out.println("test");
				
			}
			
			
			
			
		}
		
		
		if(forsok == 0) {
			JOptionPane.showMessageDialog(null, "For mange mislykkede forsøk programmet avsluttes");
		}
		
	
		
		
		
		



		

		
	}
}
