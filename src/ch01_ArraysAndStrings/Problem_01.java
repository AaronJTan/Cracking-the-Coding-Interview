package ch01_ArraysAndStrings;

public class Problem_01 {
	public static boolean isUniqueChars(String str) {
		if (str == null || str.length() > 128) {
			return false;
		}
		
		boolean[] characters = new boolean[128];
		
		for (int i = 0; i < str.length(); i++) {
			int ascii_dec = (int) str.charAt(i);
			
			if (characters[ascii_dec]) {
				return false;
			}
			
			characters[ascii_dec] = true;
		}
		
		return true;
	}
}

