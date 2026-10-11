class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int cookies = 0;
        while(count < g.length && cookies < s.length){
            if(g[count]<=s[cookies]){
                count++;
            }
            cookies++;
        }
        return count;
    }
}