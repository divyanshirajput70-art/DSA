class Solution {
    public boolean isPalindrome(String s) {

        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                temp += ch;
            }
        }

        int i = 0;
        int j = temp.length() - 1;

        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}