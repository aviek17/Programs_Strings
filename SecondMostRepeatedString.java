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
public class SecondMostRepeatedString {
    static String SolveSMRS(String arr[]){
        String result="";
        int count =0;
        HashMap<String,Integer> map = new HashMap<String, Integer> ();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String arr[] =new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println(SolveSMRS(arr));
    }
}
