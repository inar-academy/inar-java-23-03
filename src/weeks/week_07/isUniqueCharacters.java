package weeks.week_07;

import java.util.Scanner;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters.
 * tarik -> true
 * Inar Academy -> false
 */

/*
	 * 1 - Anlat
	 * 2 - Ornekle
	 * 3 - Algoritmani sozel
	 * 4 - Test case olustur
	 * 5 - Kod yaz
	 * 6 - test et
 */

/***
 * @author Sinan Cetin
 */
public class isUniqueCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = input.nextLine();
		if (isUnique(s)) {
			System.out.println(s + " is a unique string");
		} else {
			System.out.println(s + " is not a unique string");
		}
	}

	public static boolean isUnique(String s) {
		s = s.toLowerCase();
		for (int i = 0; i < s.length() - 1; i++) {// tarik
			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;
	}
}
