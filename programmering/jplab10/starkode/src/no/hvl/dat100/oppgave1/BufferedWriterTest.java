package no.hvl.dat100.oppgave1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) {
		
		String[] names = {"adw", "awdad", "adawdw"};
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			
			
			for(String name : names) {
				
		
				writer.write(name);
				writer.write("\n");
				
				
			}
			
			writer.write("Test skrive til fil");
			writer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		

	}

}
