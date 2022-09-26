package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		
		String filePath = "symptoms.txt";
		String outputFilePath = "results.out";
		

		Analyse analyse = new Analyse(new ReadSymptomDataFromFile() , new CountSymptomsOccurences(), new OrderSymptoms(), new WriteInDocument());
 		
		try {
			List<String> listeSymptomes = analyse.getSymptoms(filePath);
	 		Map<String, Integer> mapSymptomes = analyse.countSymptomsOccurences(listeSymptomes);
	 		analyse.writeInDoc(analyse.orderSymptomsByAlpDesc(mapSymptomes ), outputFilePath);
	 		System.out.println("Succes, please check " + outputFilePath + " file");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
}
