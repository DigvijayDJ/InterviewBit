public class Solution {
    public int trailingZeroes(int A) {
        int ans = 0;
        for(int i = 5; A/i>0; i*=5){  //0 will occure only when given number contains any 5.
            ans += A/i;               // removing extra 5's in 25,125 etc..    
        }
        return ans;
    }
}
