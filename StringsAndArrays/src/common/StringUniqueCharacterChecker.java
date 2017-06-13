package common;

public class StringUniqueCharacterChecker {

	public static void main(String[] args) {
		
		String text = "abcdefa";
		System.out.println(isCharactersUniqueON2(text));

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

				if (i == j) {
					continue;
				}

				if (textArray[i] == textArray[j]) {
					return false;
				}

			}
		}

		return true;
	}

}
