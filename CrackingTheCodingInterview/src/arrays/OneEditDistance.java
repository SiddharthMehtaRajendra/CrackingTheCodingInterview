package arrays;

public class OneEditDistance {

	public static void main(String[] args) {
		String s = "pale";
		String t = "pale";
		System.out.println(isOneEditDistance(s, t));
	}
	
	public static boolean isOneEditDistance(String s, String t) {
        if(s.length() == 0 && t.length() == 0) return false;
        if(Math.abs(s.length() - t.length()) > 1) return false;
        
        if(s.length() == t.length()){
            return oneEditReplace(s, t);
        } else if(s.length() + 1 == t.length()){
            return oneEditInsertOrRemove(s, t);
        } else if(s.length() - 1 == t.length()){
            return oneEditInsertOrRemove(t, s);
        }
        return false;
    }
    
    public static boolean oneEditReplace(String s, String t){
        boolean foundDifference = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                if(foundDifference) return false;
                foundDifference = true;
            }
        }
        return foundDifference;
    }
    
    public static boolean oneEditInsertOrRemove(String s, String t){
        int index1 = 0;
        int index2 = 0;
        while(index1 < s.length() && index2 < t.length()){
            if(s.charAt(index1) != t.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

}
