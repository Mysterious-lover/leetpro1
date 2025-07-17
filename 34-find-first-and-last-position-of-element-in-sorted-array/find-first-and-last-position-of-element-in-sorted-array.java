class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);  // \U0001f501 make sure this method is defined below
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                right = mid - 1; // search on left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }

    private int findLast(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                left = mid + 1; // search on right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }
}
