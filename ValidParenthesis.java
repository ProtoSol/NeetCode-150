import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    // We will be using stack and hashmap to solve this question
    // We will be using stack to store the characters
    // We will be using hashmap to store the mapping of the characters

    // We will iterate through the string
    // If the character is an opening bracket, we will push it to the stack
    // If the character is a closing bracket, we will check if the stack is empty
    // If the stack is empty, we will return false
    // If the stack is not empty, we will check if the character is the closing
    // bracket of the opening bracket at the top of the stack
    // If it is not, we will return false
    // If it is, we will pop the opening bracket from the stack

    public boolean isValid(String s) {
        // if the string is null or empty
        if (s == null || s.length() == 0) {
            return true;
        }

        // Initialize the stack and the hashmap
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        // iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // if the character is an opening bracket
            if (map.containsValue(c)) {
                stack.push(c);
            }
            // if the character is a closing bracket
            else {
                // if the stack is empty
                if (stack.isEmpty()) {
                    return false;
                }
                // if the character is not the closing bracket of the opening bracket at the top
                // of the stack
                if (stack.peek() != map.get(c)) {
                    return false;
                }
                // if the character is the closing bracket of the opening bracket at the top of
                // the stack
                stack.pop();
            }
        }

        // if the stack is empty
        return true;
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        String s = "()[]{}(())";
        System.out.println(vp.isValid(s));
    }
}
