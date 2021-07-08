// longest common subsequence without character at the same index
package String;
import java.util.*;
public class LongestRepeatingSubsequence {
    static int findLongestCommonSubsequence(char[]c1 , char[]c2){
        int m = c1.length;
        int n = c2.length;
        int [][]t = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    t[i][j] =0;
                }
                else if(c1[i-1]==c2[j-1] && i!=j){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x ;
        x=sc.next();
        // y=sc.next();
        char [] c1 = x.toCharArray();
        char [] c2 = x.toCharArray();
        System.out.println(findLongestCommonSubsequence(c1,c2));
        sc.close();
    }
}
