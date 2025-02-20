public class LongestReCharReplace {
    // We need to find the character that has the highest frequency in a string
    // We will take the length of the string minus the most occured character
    // and if the length is greater than k, we will replace the character with
    // the most occured character.

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }

    private static int characterReplacement(String s, int k) {
        int maxLength = 0;

        int[] count = new int[26];
        int left = 0;
        int right = 0;
        int maxOccured = 0;

        for (; right < s.length(); right++) {
            maxOccured = Math.max(maxOccured, ++count[s.charAt(right) - 'A']);
            if (right - left + 1 - maxOccured > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
