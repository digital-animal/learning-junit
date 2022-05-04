package com.zahid;

public class LetterCount {

	public int countLetter(String word) {
		int count = 0;
		for(int i=0; i<word.length(); i++) {
			if((word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
			    || (word.charAt(i) >= 'a'&& word.charAt(i) <= 'z'))
				count++;
		}
		return count;
	}
}