package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		

		Analyse analyse = new Analyse(new ReadSymptomDataFromFile() , new CountSymptomsOccurences(), new OrderSymptoms(), new WriteInDocument());
 		
		try {
			List<String> listeSymptomes = analyse.getSymptoms("symptoms.txt");
	 		Map<String, Integer> mapSymptomes = analyse.countSymptomsOccurences(listeSymptomes);
	 		analyse.writeInDoc(analyse.orderSymptomsByAlpDesc(mapSymptomes), "result.out");
	 		System.out.println("");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
}
