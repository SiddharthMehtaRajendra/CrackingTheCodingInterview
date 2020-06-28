package arrays;

import java.util.Arrays;

public class StringUniqueChars {

	public static void main(String[] args) {
		StringUniqueChars obj = new StringUniqueChars();
		String input = "Caulifl"; 
		  
        if (obj.uniqueCharactersWithoutDataStructure(input)) 
            System.out.println("The String " + input 
                               + " has all unique characters"); 
        else
            System.out.println("The String " + input 
                               + " has duplicate characters"); 
	}
	
	public boolean bruteForceUniqueCharacters(String str) {
		char[] chArray = str.toCharArray();
		Arrays.sort(chArray);
		
		for(int i = 0; i < chArray.length - 1; i++) {
			if(chArray[i] != chArray[i + 1]) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean optimizedUniqueCharacters(String str) {
		int MAX_CHARACTERS = 256;
		
		if(str.length() > MAX_CHARACTERS) {
			return false;
		}
		
		boolean[] chars = new boolean[MAX_CHARACTERS];
		
		for(int i = 0; i < str.length(); i++) {
			int index = (int) str.charAt(i);
			if(chars[index]) {
				return false;
			}
			chars[index] = true;
		}
		return true;
	}
	
	public boolean uniqueCharactersWithoutDataStructure(String str) {
		int checker = 0;	//bit index
		for(int i = 0; i < str.length(); i++) {
			int bitAtIndex = str.charAt(i) - 'a';
			if((checker & (1 << bitAtIndex)) > 0) {
				return false;
			}
			checker = checker | (1 << bitAtIndex);
		}
		return true;
	}
}
