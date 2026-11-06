
class Solution {
    public int divide(int dividend, int divisor) {

        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to long to avoid overflow
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long result = 0;

        while (a >= b) {

            long temp = b;
            long multiple = 1;

            // Double divisor using left shift
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract largest possible multiple
            a -= temp;
            result += multiple;
        }

        // Apply sign
        if (negative) {
            result = -result;
        }

        return (int) result;
    }
}
