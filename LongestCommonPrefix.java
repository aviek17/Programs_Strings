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
public class LongestCommonPrefix {
    static String SolveLCP(String str[], int len){
        if(len==0 || str==null){
            return " ";
        }
        String result = "";
        char ch;
        for(int i=0;i<len;i++){
            char c;
            c=str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                   if(str[j].charAt(i)!=c){
                        return result;
                   }
               } 
            result = result+c;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        int min = arr[0].length();
        for (int i=1;i<n;i++){
            if(arr[i].length()<min){
                min = arr[i].length();
            }
        }
        System.out.println(SolveLCP(arr,min));
    }
}
