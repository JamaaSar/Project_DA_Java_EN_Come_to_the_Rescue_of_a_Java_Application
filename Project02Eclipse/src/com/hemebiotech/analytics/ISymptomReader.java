package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	
	/**
	 * 
	 * return list of the all symptoms that was in the file
	 */

	List<String> getSymptoms(String filePath);


	
}
