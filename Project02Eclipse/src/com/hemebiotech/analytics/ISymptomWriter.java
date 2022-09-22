package com.hemebiotech.analytics;

import java.util.Map;

/**
 * 
 * Create a file with given file name and write results in that file  
 * 
 */

public interface ISymptomWriter {
	
	
	/**
	 * @param sorted : sorted map of the symptoms and their occurences
	 * @param file name
	 */
	void writeInDoc(Map<String, Integer> mapOfSymptoms, String fileName);
	
	


}
