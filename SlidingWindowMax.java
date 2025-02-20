import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    // We have a sliding window problem
    // We need to find the maximum element in a window of size k

    // What can i do The bruteforce would be to use a nested loop and find the
    // maximum till the iteration

    // But the problem of removing elements remain there
    // maybe i need a queue to solve this question, and the queue will store the
    // index

    // the result can be stored in array

    public int[] maxSlidingWindow(int[] nums, int k) {

        // if the array is empty or k is less than 0
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        // the result array
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // remove the element
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            // remove the elements that are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            // add the element
            deque.offer(i);
            // add the result
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        // return the result
        return result;
    }

    public static void main(String[] args) {
        SlidingWindowMax swm = new SlidingWindowMax();
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] result = swm.maxSlidingWindow(nums, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
