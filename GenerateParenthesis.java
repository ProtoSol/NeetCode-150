import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    // We need to generate all possible combinations of valid parenthesis
    // We are given the number of pairs of parenthesis
    // I think we will be using backtracking
    // We will keep track of the number of open and close parenthesis
    // We will keep track of the current string
    // If the number of open parenthesis is less than the number of pairs
    // we will add an open parenthesis
    // If the number of close parenthesis is less than the number of open
    // parenthesis
    // we will add a close parenthesis
    // If the number of open and close parenthesis is equal to the number of pairs
    // we will add the current string to the result
    // We will backtrack and remove the last character
    // We will return the result

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}
