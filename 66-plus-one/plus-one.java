public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, set to 0 (carry over)
            digits[i] = 0;
        }

        // If all digits were 9, e.g. 999 + 1 = 1000
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // all others are already 0 by default
        return newNumber;
    }
}
