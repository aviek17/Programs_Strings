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
public class RomanToDecimal {
    static void ConvertToDecimal(String str){
        HashMap <Character,Integer> map = new HashMap<Character,Integer>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map.put('i', 1);
        map.put('v', 5);
        map.put('x', 10);
        map.put('l', 50);
        map.put('c', 100);
        map.put('d', 500);
        map.put('m', 1000);
        
         int sum =0;
         for(int i=0;i<str.length();i++){
             char c= str.charAt(i);
             if(i+1<str.length()){
                 if(map.get(c)>=map.get(str.charAt(i))){
                     sum = sum + map.get(c);
                 }else{
                     sum = sum + map.get(str.charAt(i))-map.get(c);
                 }
             }else {
                 sum = sum + map.get(c);
             }
         }
         System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        ConvertToDecimal(str);
    }
}
