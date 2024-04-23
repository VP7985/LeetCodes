import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int curr = 0, ret = 0;
        while (curr < s.length && ret < g.length) {
            if (s[curr] >= g[ret]) 
                ret ++;
            curr ++;
        }
        return ret;
    }
}