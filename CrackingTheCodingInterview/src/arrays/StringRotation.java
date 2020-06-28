package arrays;

public class StringRotation {
    public boolean rotateString(String A, String B) {
        if(A.length() == 0 && B.length() == 0) return true;
        if(A.length() != B.length()) return false;
        String concat = A + A;
        if(concat.indexOf(B) > -1) return true;
        return false;
    }
}
