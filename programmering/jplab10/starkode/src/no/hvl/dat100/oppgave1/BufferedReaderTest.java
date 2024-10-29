package no.hvl.dat100.oppgave1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import javax.swing.JOptionPane;

public class BufferedReaderTest {
	
	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/oppgave1/";


	public static void main(String[] args) {
		

		String filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);
		File file = new File(MAPPE_STR + filnavn);

		
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while((line = reader.readLine()) != null) {
				
				System.out.println(line);
			}
			
			
			reader.close();

			
			
		} catch (FileNotFoundException e) {
			
//			JOptionPane.showMessageDialog(null, e);
			JOptionPane.showMessageDialog(null,"'" + filnavn + "'" + " ikke funnet i " + MAPPE_STR + "!");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
	}


	
}
