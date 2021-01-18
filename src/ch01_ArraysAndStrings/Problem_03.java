package ch01_ArraysAndStrings;

public class Problem_03 {
	public static String URLify (String s1, int trueLength) {
		char[] string = s1.toCharArray();
		
		int numSpaces = 0;
		
		for (int i = 0; i < trueLength; i++) {
			if (string[i] == ' ') {
				numSpaces++;
			}
		}
		
		int index = trueLength + (2 * numSpaces) - 1;
				
		for (int i = trueLength - 1; i >= 0; i--) {
			if (string[i] != ' ') {
				string[index] = string[i];
				index--;
			}
			else {
				string[index] = '0';
				string[index - 1] = '2';
				string[index - 2] = '%';
				index -= 3;
			}
		}
		
		return String.valueOf(string).trim();
	}
}
