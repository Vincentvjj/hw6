package hw6;

import java.util.Set;
import java.util.TreeSet;



public class Anagrams {
	
	private Set<String> dictionary;

	public Anagrams(Set<String> dictionary) {
		if(dictionary == null) {
			throw new IllegalArgumentException();
		}
		dictionary = new TreeSet<String>();

		this.dictionary = dictionary; 
	}
	
	public Set<String> getWords(String phrase) {
		if(phrase == null) {
			throw new IllegalArgumentException();
		}
		
		
		Set<String> chosen = new TreeSet<String>();
		
		LetterInventory a = new LetterInventory();
		
		for(String s : dictionary) {
			
			
			
			
		}
		
		return chosen;
		
	}
	
	
	public void print(String phrase) {
		
		
	}

	public void print(String phrase, int max) {
		
		
		
	}


}
