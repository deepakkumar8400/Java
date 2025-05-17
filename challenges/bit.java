class FlipMaxConsecutiveOnes {
    public static void main(String[] args) {
        String s = "111111111100010111110100000010000010";
        int k = 2;
        int maxLen = getMaxOnesAfterFlips(s, k);
        System.out.println("Max consecutive 1s after flipping " + k + " zero(s): " + maxLen);
    }

    static int getMaxOnesAfterFlips(String s, int k) {
        int left = 0, right = 0, zeros = 0, maxLen = 0;

        while (right < s.length()) {
            if (s.charAt(right) == '0') {
                zeros++;
            }

            while (zeros > k) {
                if (s.charAt(left) == '0') {
                    zeros--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
