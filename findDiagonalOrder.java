// Time Complexity : O(m+n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m*n];
        int r = 0, c = 0;

        boolean dir = true;

        // Iterate through matrix for length rows x columns
        for(int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];

            // Move up if dir == true
            if(dir) {
                if(c == n - 1) {
                    r++;
                    dir = false;
                }
                else if(r == 0) {
                    c++;
                    dir = false;
                }
                else {
                    r--; c++;
                }
                // Move down if dir == false
            } else {
                if(r == m - 1) {
                    c++;
                    dir = true;
                }
                else if(c == 0) {
                    r++;
                    dir = true;
                }
                else {
                    r++; c--;
                }
            }
        }

        return result;
    }
}
