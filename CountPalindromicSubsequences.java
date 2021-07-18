package String;
import  java.util.*;
public class CountPalindromicSubsequences {
    
    public static int CountPS(String str,int x, int y,int n){
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        
        if(x==y){
            return 1;
        }
        if(x>y){
            return 0;
        }
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        if(str.charAt(x)==str.charAt(y)){
            return (1+CountPS(str,x+1,y,n)+CountPS(str,x,y-1,n));
        }
        else{
             return CountPS(str,x+1,y,n)+CountPS(str,x,y-1,n)-CountPS(str,x+1,y-1,n);
        }
            
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        int n = str.length();
        
        System.out.println(CountPS(str,0,n-1,n));
        
    }
}

   
