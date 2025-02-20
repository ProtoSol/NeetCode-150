import java.util.ArrayList;
import java.util.List;

public class MinStackMain {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.push(8);
        obj.push(9);
        obj.push(10);

        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}

class MinStack {

    private List<int[]> st;

    public MinStack() {
        st = new ArrayList<>();
    }

    public void push(int val) {
        int[] top = st.isEmpty() ? new int[] { val, val } : st.get(st.size() - 1);
        int min_val = top[1];
        if (min_val > val) {
            min_val = val;
        }
        st.add(new int[] { val, min_val });
    }

    public void pop() {
        st.remove(st.size() - 1);
    }

    public int top() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[0];
    }

    public int getMin() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[1];
    }
}
