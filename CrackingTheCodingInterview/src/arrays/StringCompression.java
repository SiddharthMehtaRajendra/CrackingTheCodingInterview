package arrays;

public class StringCompression {
	
	public static void main(String[] args) {
		System.out.println(compress("aabbccc".toCharArray()));
	}
	
	public static int compress(char[] chars) {
        if(chars == null || chars.length == 0) return 0;
        int count = 1;
        int answer = 0;
        if(chars.length == 1){
            return 1;
        }
        for(int i = 0; i < chars.length; i++){
            while((i + 1) < chars.length && chars[i] == chars[i+1]){
                i++;
                count++;
            }
            chars[answer++] = chars[i];
            if(count > 1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[answer++] = c;
                }
                count = 1;
            }
        }
        System.out.print(chars);
        System.out.print("\n");
        return answer;
    }
}
