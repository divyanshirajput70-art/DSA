class Solution {
    public void reverseString(char[] s) {
        int i =0;
        int j = s.length-1;
        while(i < j){
            char temp = s[j];
            s[j] = s[i];
            s[i] =  temp;
            i++;
            j--;
        }


        // StringBuilder sb = new StringBuilder(new String(s));

        // int i = 0;
        // int j = sb.length() - 1;

        // while (i < j) {
        //     char temp = sb.charAt(i);
        //     sb.setCharAt(i, sb.charAt(j));
        //     sb.setCharAt(j, temp);
        //     i++;
        //     j--;
        // }

        
        // for (int k = 0; k < s.length; k++) {
        //     s[k] = sb.charAt(k);
        // }
    }
}