package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class OrderSymptoms implements ISymptomOrder {
	

	
	/**
	 * 
	 * @param map : map of the symptoms and their occurences
	 * @return sorted by alphabetic map 
	 */
	
	public Map<String, Integer> orderSymptomsByAlpDesc(Map<String, Integer> mapOfSymptoms) {
		  return new TreeMap<String, Integer>(mapOfSymptoms);
		
	}

	
	
}
