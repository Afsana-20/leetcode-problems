// Last updated: 7/14/2026, 2:43:48 PM
class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
            return i;
            }

        }
    return -1;
    }
}