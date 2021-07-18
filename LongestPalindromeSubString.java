package String;
import java.util.*;
public class LongestPalindromeSubString {
    static int expandFromMiddle(String s, int left, int right){
        if(s==null || left>right){
            return 0;
        }
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    static String longestPalindrome(String s){
        int start=0;
        int end=0;
        if(s.length()<1 || s==null){
            return "";
        }
        for(int i=0;i<s.length();i++){
            int len1=expandFromMiddle(s, i, i);   // this is for staring like racecar
            int len2= expandFromMiddle(s, i,i+1);   // this is for string like abbabaab .....
            int len = Math.max(len1, len2);
            if(len>(end-start)){
                start = i-((len-1)/2);
                end = i+(len/2);
            }
        }
        return s.substring(start, end+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        System.out.println(longestPalindrome(s));
        sc.close();

    }
}
// https://www.youtube.com/watch?v=y2BD4MJqV20&t=619s        Check this video 
