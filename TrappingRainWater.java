public class TrappingRainWater {
    public int trap(int[] height) {
        int total = 0;
        int left = 0;
        int right = height.length - 1;

        int leftMax = height[left];
        int rightMax = height[right];

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                total += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                total += rightMax - height[right];
                right--;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        TrappingRainWater obj = new TrappingRainWater();
        System.out.println(obj.trap(height));
    }
}
