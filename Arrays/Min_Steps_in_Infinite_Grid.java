public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        
        int n = A.size();
        if(n == 0 || n == 1) return 0;
        int distance = 0;
        for(int i = 0; i < n-1; i ++)
        {
            int dx = Math.abs(A.get(i) - A.get(i+1));
            int dy = Math.abs(B.get(i) - B.get(i+1));
            if(dx <= dy)
                distance += dy;   //dx + (dy - dx);
            else if(dy < dx)
                distance += dx;    //dy + (dx - dy);
        }
        return distance;
    }
}
