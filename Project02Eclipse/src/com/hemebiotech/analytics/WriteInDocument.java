package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteInDocument implements ISymptomWriter {
	

	
	/**
	 * @param sorted : sorted map of the symptoms and their occurences
	 * @param file name
	 * 
	 */
	public void writeInDoc( Map<String, Integer> sorted, String fileName) {
		
		try {
			FileWriter writer = new FileWriter (fileName);
			writer.write("The list of the symptoms with their occurences and ordered by alphabetic \n");
			writer.write("\n");
			
			for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
			     writer.write(entry.getKey().substring(0,1).toUpperCase() + entry.getKey().substring(1) + " : " + entry.getValue() + "\n");
			}
		
			writer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		 
	}
}
