import java.util.HashSet;

public class TwoSum {

    private boolean twoSumPresent(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }
        return false;
    }

    private int[] twoSumValues(int[] arr, int target) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                result[0] = target - num;
                result[1] = num;
                return result;
            }
            set.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        System.out.println(ts.twoSumValues(arr, target));
    }

}
