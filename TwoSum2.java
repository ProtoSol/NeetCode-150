public class TwoSum2 {
    // Similar to two sum but here the array is sorted
    // thus whenever I will see the sorted term then it means
    // we need to approach with two pointers binary search algorithm

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];

            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1}; // If no solution is found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        TwoSum2 obj = new TwoSum2();
        int[] result = obj.twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
