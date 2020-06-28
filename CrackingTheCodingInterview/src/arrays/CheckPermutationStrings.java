package arrays;

import java.util.Arrays;

public class CheckPermutationStrings {

	public static void main(String[] args) {
		CheckPermutationStrings obj = new CheckPermutationStrings();
		System.out.println(obj.optimizedCheckPermutation("ansgram", "nagaram"));
	}
	
	public boolean checkPermutation(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        char[] one = str1.toCharArray();
        char[] two = str2.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one, two);
	}
	
	public boolean optimizedCheckPermutation(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
        int[] counter = new int[26];
        
        for(int i = 0; i < str1.length(); i++){
            counter[str1.charAt(i) - 'a']++;
            counter[str2.charAt(i) - 'a']--;
        }
        
        for(int count: counter){
            if(count != 0) return false;
        }
        return true;
	}
}


