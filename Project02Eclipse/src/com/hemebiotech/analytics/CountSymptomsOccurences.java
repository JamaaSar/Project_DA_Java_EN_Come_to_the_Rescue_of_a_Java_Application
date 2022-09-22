package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSymptomsOccurences implements ISymptomCounter {

	

	/**
	 * 
	 * @param listOfSymptoms : list of the symptoms
	 * @return map of the symptoms as key and their occurence as value
	 */

	public Map<String, Integer> symptomsCounter(List<String> listOfSymptoms) {
		
		Map<String, Integer> mapOfSymptoms = new HashMap<String, Integer>();
		int nombreOccurance = 0;
 
		if (listOfSymptoms.size() != 0) {
			for (String symptom: listOfSymptoms) {
			    if (mapOfSymptoms.get(symptom) == null) {
			    	
			    	mapOfSymptoms.put(symptom, 1);
			    
			    } else {
			    	nombreOccurance = mapOfSymptoms.get(symptom);
			        mapOfSymptoms.put(symptom, nombreOccurance+1);
			    }
			}
		}else {
			System.out.println("The list is empty ! ");
		}
		
		return mapOfSymptoms;
	}

}
