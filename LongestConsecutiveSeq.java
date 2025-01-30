import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {

    public int longestConsecutive(int[] nums) {
        // We need a hashset to store the elements
        // and check if the element is already present in the hashset

        // Intialize a hashset
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        // Loop through the elements in the array
        int maxCount = 0;
        for (int i : set) {
            int count = 0;
            int num = i;
            if (!set.contains(num - 1)) {
                while (set.contains(num)) {
                    count++;
                    num++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        LongestConsecutiveSeq obj = new LongestConsecutiveSeq();
        System.out.println(obj.longestConsecutive(nums));
    }

}
