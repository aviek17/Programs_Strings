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
public class IsomorphicString {
    public static boolean SolveIsoString(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        
        HashMap<Character,Character> map1 = new HashMap<Character,Character>();
        HashMap <Character,Boolean> map2 = new HashMap<Character, Boolean>();
        
        for(int i=0;i<str1.length();i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if(map1.containsKey(ch1)==true){
//                checking the matching character for ch1 in map1
                    if(map1.get(ch1)!=ch2){
                        return false;
                    }
            }else{
//                if ch1 is not present in map1 then we will add but for that ch2 should not be present in map2
//                  if present then return false else add that character in map2 and subsequently in map 1
                    if(map2.containsKey(ch2)==true){
                        return false;
                    }else{
                        map1.put(ch1, ch2);
                        map2.put(ch2, true);
                    }
            }
        }
//        if everything gets added in map1 and map2 we will return true
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 =sc.next();
        
        System.out.println(SolveIsoString(str1,str2));
    }
}
