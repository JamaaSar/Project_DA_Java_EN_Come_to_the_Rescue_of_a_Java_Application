package com.hemebiotech.analytics;

import java.util.Map;

/**
 * 
 * Ordering a objects 
 * Will return a ordered list or map
 * 
 */

public interface ISymptomOrder {
	/**
	 * 
	 * @param map : map of the symptoms and their occurences
	 * @return sorted by alphabetic map 
	 */

	Map<String, Integer> orderSymptomsByAlpDesc(Map<String, Integer> mapOfSymptoms);



}
