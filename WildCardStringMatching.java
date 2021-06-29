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
public class WildCardStringMatching {
    
    public static boolean SolveStringMatching(String str1, String str2){
        boolean dp [] [] = new boolean[str1.length()+1][str2.length()+1];
        for(int i= dp.length-1;i>=0;i--){
            for(int j = dp[0].length-1;j>=0;j--){
                if(i==dp.length-1 & j==dp[0].length-1){
                        dp[i][j]=true;
                }
                else if(i==dp.length-1){
                    dp[i][j]=false;
                }
                else if(j==dp[0].length-1){
                    if(str1.charAt(i)=='*'){
                        dp[i][j]=dp[i+1][j];
                    }else{
                        dp[i][j]=false;
                    }
                }else{
                    if(str1.charAt(i)=='?'){
                        dp[i][j]=dp[i+1][j+1];
                    }else if(str1.charAt(i)=='*'){
                        dp[i][j]=dp[i+1][j] || dp[i][j+1];
                    }else if(str1.charAt(i)==str2.charAt(j)){
                            dp[i][j]=dp[i+1][j+1];
                    }else{
                        dp[i][j]=false;
                    }
                }
        }
        }
        return dp[0][0];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String wild = sc.next();
        String pattern = sc. next();
        System.out.println(SolveStringMatching(wild,pattern));
    }
}
