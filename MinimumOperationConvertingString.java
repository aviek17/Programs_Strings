/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;
import java.util.*;
/**
 *
 * @author aviek
 */
public class MinimumOperationConvertingString {
    public static int Min(int a , int b,int c){
        if (a <= b && a <= c)
        return a;
 
    else if (b <= a && b <= c)
        return b;
 
    else
        return c;
    }
    public static int SolveString(char str1[], char str2[], int m, int n){
//        if(m==0)
//            return n;
//        if(n==0)
//            return m;
//        if (str1.equals(str2)){
//            return 0;
//        }
//        if(str1.charAt(m)==str2.charAt(n)){
//                return SolveString(str1,str2,m-1,n-1);
//        }
//        else 
//            return (1+Min(SolveString(str1,str2,m-1,n-1),SolveString(str1,str2,m,n-1),SolveString(str1,str2,m-1,n)));
//    }
   
    int dp[][] = new int[m+1][n+1];
    for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
            if(i==0){
                dp[i][j]=j;
            }
            else if(j==0){
                dp[i][j]=i;
            }
            else if(str1[i-1]==str2[j-1]){
                dp[i][j]=dp[i-1][j-1];
            }
            else{
                dp[i][j]= 1 + Min(dp[i-1][j-1],dp[i][j-1],dp[i-1][j]);
            }
        }
    }
    return dp[m][n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int m = str1.length();
        int n = str2.length();
        char arr1[] = new char[m];
        char arr2[] = new char[n];
        arr1 = str1.toCharArray();
        arr2 = str2.toCharArray();
        System.out.println(SolveString(arr1,arr2,m,n));
    }
}
