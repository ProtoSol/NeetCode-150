import java.util.HashSet;

public class LongestSubstringWithoutRe {
    // We will use Hashset to store the characters in the current window
    // if the character is already present in the set, we will remove the character from the start of the window
    // and move the start pointer to the right
    // We will keep track of the max length of the window
    public int lengthOfLongestSubstring(String s) {

        // Base cases
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        // Variables
        int n = s.length();
        int start = 0;
        int end = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();

        // Two Pointer Approach
        while (end < n) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                max = Math.max(max, end - start + 1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestSubstringWithoutRe obj = new LongestSubstringWithoutRe();
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}
