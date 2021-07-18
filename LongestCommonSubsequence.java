package String;
import java.util.*;
public class LongestCommonSubsequence {
    static int findLongestCommonSubsequence(char[]c1 , char[]c2){
        int m = c1.length;
        int n = c2.length;
       
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0){
                    dp[i][j]=0;
                }else if(j==0){
                    dp[i][j]=0;
                }
                else if(c1[i-1]==c2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x , y;
        x=sc.next();
        y=sc.next();
        char [] c1 = x.toCharArray();
        char [] c2 = y.toCharArray();
        System.out.println(findLongestCommonSubsequence(c1,c2));
        sc.close();

    }
}
