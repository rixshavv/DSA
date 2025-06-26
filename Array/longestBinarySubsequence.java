class Solution{
    public int longestSubsequence(String s, int k) {
        int length=0;
        int powervalue=1; //2^0
        int n=s.length();

        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == '0'){
                length++;

            }
            else if((1*powervalue)<=k){
                length++;
                k=k-(1*powervalue);
            }

            if(powervalue<=k){
                powervalue*=2;
            }
        }





        return length;

    }

}


public class longestBinarySubsequence {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "1001010";
        int k1 = 5;
        System.out.println("Test 1: " + sol.longestSubsequence(s1, k1)); // Expected: 5

        String s2 = "00101001";
        int k2 = 1;
        System.out.println("Test 2: " + sol.longestSubsequence(s2, k2)); // Expected: 6
    }
}
