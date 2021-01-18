package ch01_ArraysAndStrings;

public class Problem_02 {
	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} 
		else if (s1.equals(s2)) {
			return true;
		}
		
		int[] char_array = new int[128];
		int index;
		
		for (int i = 0; i < s1.length(); i++) {
			index = (int) s1.charAt(i);
			char_array[index]++;
		}
		
		for (int j = 0; j < s2.length(); j++) {
			index = (int) s2.charAt(j);
			char_array[index]--;
			
			if (char_array[index] < 0) {
				return false;
			}
		}
		
		return true;
	}
}
