package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;

public class Analyse {
	
	private ISymptomReader reader;
	private ISymptomCounter counter;
	private ISymptomOrder order;
	private ISymptomWriter writer;
	
	
	public Analyse(ISymptomReader reader, ISymptomCounter counter,ISymptomOrder order, ISymptomWriter writeToFile) {
		this.reader = reader;
		this.counter = counter;
		this.order = order;
		this.writer = writeToFile;
	}

	public List<String> getSymptoms (String filePath){
		return this.reader.getSymptoms(filePath);
		
	}
	

	public Map<String, Integer> countSymptomsOccurences(List<String> listOfSymptoms) {
		
		return this.counter.symptomsCounter(listOfSymptoms);
	}
	
	
	public Map<String, Integer> orderSymptomsByAlpDesc(Map<String, Integer> mapOfSymptoms) {
		  return this.order.orderSymptomsByAlpDesc(mapOfSymptoms);
		
	}

	public void writeInDoc(Map<String, Integer> mapOfSymptoms, String fileName) {
		
		 this.writer.writeInDoc(mapOfSymptoms, fileName);
	}
	
}
