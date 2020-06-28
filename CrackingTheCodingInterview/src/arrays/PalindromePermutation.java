package arrays;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

	public static void main(String[] args) {
		String str = "aabbddcd";
		System.out.println(isPermutationPalindrome(str.toLowerCase()));
	}
	
	public static boolean isPermutationPalindrome(String str) {
		if(str == null || str == "") return true;
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if(c == ' ') continue;
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		System.out.println(map.values());
		int count = 0;
		for(int i: map.values()) {
			if(i%2 != 0) {
				count++;
			}
		}
		return !(count > 1);
	}
	
}
