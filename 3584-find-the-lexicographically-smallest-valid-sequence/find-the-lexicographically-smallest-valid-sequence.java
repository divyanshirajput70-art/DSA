class Solution {
    public int[] validSequence(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        if (n2 > n1) return new int[0];

        // g[i] = smallest j such that word2[j:] is a subsequence of word1[i:]
        int[] g = new int[n1 + 1];
        g[n1] = n2;
        for (int i = n1 - 1; i >= 0; i--) {
            g[i] = g[i + 1];
            if (g[i] > 0 && word1.charAt(i) == word2.charAt(g[i] - 1)) {
                g[i]--;
            }
        }

        int[] res = new int[n2];
        int p = 0;
        boolean usedSub = false;

        for (int k = 0; k < n2; k++) {
            int i = p;
            boolean found = false;
            while (i < n1) {
                if (word1.charAt(i) == word2.charAt(k)) {
                    res[k] = i;
                    p = i + 1;
                    found = true;
                    break;
                } else if (!usedSub && g[i + 1] <= k + 1) {
                    res[k] = i;
                    p = i + 1;
                    usedSub = true;
                    found = true;
                    break;
                }
                i++;
            }
            if (!found) return new int[0];
        }
        return res;
    }
}