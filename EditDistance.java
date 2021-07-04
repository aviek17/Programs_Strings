// https://www.youtube.com/watch?v=AuYujVj646Q

package String;
import java.util.*;
public class EditDistance {
    static int Minimum(int x, int y, int z){
        return Math.min(Math.min(x, y),z);
    }
    static int findMaxDistance(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();
        int [][]dp = new int [m+1][n+1];
        for (int i = 0; i <= m; i++) { 
            for (int j = 0; j <= n; j++) { 
                // If first string is empty, only option is to 
                // insert all characters of second string 
                if (i == 0) 
                    dp[i][j] = j; // Min. operations = j 
    
                // If second string is empty, only option is to 
                // remove all characters of second string 
                else if (j == 0) 
                    dp[i][j] = i; // Min. operations = i 
    
                // If last characters are same, ignore last char 
                // and recur for remaining string 
                else if (ch1[i - 1] == ch2[j - 1]) 
                    dp[i][j] = dp[i - 1][j - 1]; 
    
                // If the last character is different, consider all 
                // possibilities and find the minimum 
                else
                    dp[i][j] = 1 + Minimum(dp[i][j - 1], // Insert 
                                    dp[i - 1][j], // Remove 
                                    dp[i - 1][j - 1]); // Replace 
            } 
        } 
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,t;
        s=sc.next();
        t=sc.next();
        System.out.println(findMaxDistance(s,t));
        sc.close();
    }
}
