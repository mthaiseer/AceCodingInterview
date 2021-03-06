package common;

import java.util.Arrays;

/**
 * This class used to find a String contains unique characters or not
 * if String contains unique characters returns true, else return false.
 * 
 * there are 3 versions of implementation are available in this class 
 * 
 * input : abcxyz = true;
 * input : abccab = false;
 * 
 * @author mohamed.thaiseer
 *
 */
public class StringUniqueCharacterChecker {

	public static void main(String[] args) {

		String text = "abcxyza";
		System.out.println(isCharactersUniqueON2(text));
		System.out.println(isUniqueCharBetterSolution(text));
		System.out.println(isUniqueCharWithSorting(text));

	}

	/**
	 * Time complexity : O(N2) Space complexity : O(1)
	 * 
	 * @param text
	 * @return boolean
	 */
	public static boolean isCharactersUniqueON2(String text) {

		if (text == null || text.length() == 0) {
			return false;
		}

		char[] textArray = text.toCharArray();

		for (int i = 0; i < textArray.length; i++) {
			for (int j = 0; j < textArray.length; j++) {
				// if both index are same, ignore it
				if (i == j) {
					continue;
				}
				// if identical characters are found, return false.
				if (textArray[i] == textArray[j]) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Time complexity : O(N)
	 * 
	 * @param inputText
	 * @return
	 */
	public static boolean isUniqueCharBetterSolution(String inputText) {

		if (inputText == null || inputText.length() == 0) {
			return false;
		}

		if (inputText.length() > 128) {
			return false;
		}

		int[] charArray = new int[128];

		for (int i = 0; i < inputText.length(); i++) {
			int charIndex = inputText.charAt(i);
			if (charArray[charIndex] != 0) {
				return false;
			}
			charArray[charIndex] = charIndex;
		}

		return true;
	}

	/**
	 * Time complexity O(N)
	 * @param inputText
	 * @return
	 */
	public static boolean isUniqueCharWithSorting(String inputText) {
		if (inputText == null || inputText.length() == 0) {
			return false;
		}
		if (inputText.length() > 128) {
			return false;
		}
		char[] charArray = inputText.toCharArray();
		Arrays.sort(charArray);

		for (int i = 0; i < charArray.length - 1; i++) {

			if (charArray[i] == charArray[i + 1]) {
				return false;
			}
		}

		return true;
	}
}
