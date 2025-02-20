import java.util.Stack;

public class EvaluateRevPolish {
    // I think we will be using simple Stack
    // We will iterate through the tokens
    // when we encounter a mathematical symbol
    // we pop out 2 elements from the stack
    // perform the operation and push the result back to the stack
    // finally we will return the top of the stack

    public int evalRPN(String[] tokens) {
        // if the tokens is null or empty
        if (tokens == null || tokens.length == 0) {
            return 0;
        }

        // Initialize the stack
        Stack<Integer> stack = new Stack<>();

        // iterate through the tokens
        for (String token : tokens) {
            // if the token is a mathematical symbol
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // pop out 2 elements from the stack
                int b = stack.pop();
                int a = stack.pop();
                // perform the operation
                int result = 0;
                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else if (token.equals("/")) {
                    result = a / b;
                }
                // push the result back to the stack
                stack.push(result);
            } else {
                // push the element to the stack
                stack.push(Integer.parseInt(token));
            }
        }

        // return the top of the stack
        return stack.peek();
    }

    public static void main(String[] args) {
        EvaluateRevPolish erp = new EvaluateRevPolish();
        String[] tokens = { "2", "1", "+", "3", "*" };
        System.out.println(erp.evalRPN(tokens));
    }
}
