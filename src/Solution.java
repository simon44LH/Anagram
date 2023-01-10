import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {
	//bring both strings all to upper case
	a = a.toUpperCase();
	b = b.toUpperCase();
	
	//check if the strings are equally long if not return false 
	if (a.length() != b.length()) {
		return false;
	}
	
	//create arrays to store the frequencies of each character in the strings
	int[]charCountA = new int[26];
	int[]charCountB = new int[26];
	
	
	//iterate through each character in the strings and increment 
	//the corresponding element in the frequency arrays
	//the 'A' has to be big because i converted the Strings to allUpperCase otherwise it would be 'a' for allLowerCase
	for (int i = 0; i < a.length(); i++) {
		charCountA[a.charAt(i) - 'A']++;
		charCountB[b.charAt(i) - 'A']++;
	}
	
	//check if the frequency arrays are equal
	for(int i = 0; i < 26; i++) {
		if (charCountA[i] != charCountB[i]) {
			return false;
		}
	}
	
	//if the code reaches this point, the strings are anagrams
		return true;
		
		
	}

	public static void main(String[] args) {

		Scanner friday = new Scanner(System.in);
		//develop
		String a = "Hello";
		String b = "hellO";
		friday.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
