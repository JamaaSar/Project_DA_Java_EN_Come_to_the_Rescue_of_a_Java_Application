package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * 
 * Anything that will count occurence of a symptom from a givin source
 * Will return a object that maps keys (name of the symptom) to values (occurence) 
 * 
 */

public interface ISymptomCounter {
	/**
	 * 
	 * @param listOfSymptoms : list of the symptoms
	 * @return map of the symptoms as key and their occurence as value
	 */

	Map<String, Integer> symptomsCounter(List<String> listOfSymptoms);

	

	

}
