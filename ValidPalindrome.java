public class ValidPalindrome {
    private static boolean isPalindrome(String s) {
        // We can use two pointers to check if the string is a palindrome
        // We can use the Character.isLetterOrDigit() method to check if the character is a letter or digit
        // We can use the Character.toLowerCase() method to convert the character to lowercase
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testString1 = "A man, a plan, a canal: Panama";
        String testString2 = "race a car";
        System.out.println(isPalindrome(testString1)); // should return true
        System.out.println(isPalindrome(testString2)); // should return false
    }
}
