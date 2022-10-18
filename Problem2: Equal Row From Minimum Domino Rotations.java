//O(n) time and O1) space complexity

//without HashMap
class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int result = check(tops, bottoms, tops[0]);
        if (result != -1) return result;
        return check(tops, bottoms, bottoms[0]);
    }
    private int check(int[] tops, int[] bottoms, int candidate){
        int n = tops.length;  
        int topRotation = 0;
        int bottomRotation = 0;
        for(int i=0;i<n;i++){
            if (tops[i] != candidate && bottoms[i] != candidate) return -1;
            if (tops[i] != candidate) topRotation++;
            if (bottoms[i] != candidate) bottomRotation++;
        }
        return Math.min(topRotation,bottomRotation);
    }
}
