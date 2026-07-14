// Last updated: 7/14/2026, 2:43:26 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 0) return -1;
        int[] trustCount = new int[n + 1]; 
        for (int[] relation : trust) {
            int a = relation[0]; 
            int b = relation[1]; 
            trustCount[b]++; 
            trustCount[a]--;
        }
        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i; 
            }
        }
        return -1; 
    }

}