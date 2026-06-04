class Solution {
    public boolean isPalindrome(String s) {
       char[] arr=s.toCharArray();
       String org="";
       for(char ch:arr){
        if(!Character.isLetterOrDigit(ch))
        continue;
        org+=ch;
       } 
       org=org.toLowerCase();
       int l=0;
       int r=org.length()-1;
       while(l<r){
        if(org.charAt(l)!=org.charAt(r)){
            return false;
        }
        l++;
        r--;
       }
       return true;
    }
}
