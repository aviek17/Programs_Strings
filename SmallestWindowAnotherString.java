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
public class SmallestWindowAnotherString {
    static String SolveSWAS(String str1, String str2){
        boolean f1=false, f2=false;
        String result ="";
        
//        Checking frequency of characters for String to match
        HashMap<Character, Integer>map2 = new HashMap<Character, Integer> ();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            map2.put(ch,map2.getOrDefault(ch, 0)+1);
        }
        
//        for matching string in original array
        int match = 0;
        int len = str1.length();
        HashMap<Character, Integer> map1 = new HashMap<Character,Integer>();
        
        int i =-1, j=-1;
        while(true){
            //acquire
            
            //matching character in original string upto matching frequency in string to match
            while(i<str2.length() && match<len){
                i++;
                char ch= str2.charAt(i);
                map1.put(ch,map1.getOrDefault(ch, 0)+1);
                
//                checking if the frequency of original string is less than or equal to desired string
                if((map1.getOrDefault(ch,0)+1)<(map2.getOrDefault(ch, 0)+1)){
                            match++;
                }
                
                f1=true;
            }
//            collecting the string  and releasing 
                while(j<i && match==len){
                    String ans = str2.substring(j+1,i+1);
                    if(result.length()==0 || ans.length()<result.length()){
                            result = ans;
                    }
                    j++;
                    char ch = str2.charAt(j);
                    if(map1.get(ch)==1){
                        map1.remove(ch);
                    }else{
                        map1.put(ch,map1.get(ch)-1);
                    }
                    if(map1.getOrDefault(ch, 0)<map2.getOrDefault(ch, 0)){
                        match--;
                    }
                    
                    f2=true;
                }
                if(f1==false && f2==false)
                        {break;}
                
        }
        
        return result;
      
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();                          //   String to match
        String str2 = sc.next();                         //    Origiinal String
        System.out.println(SolveSWAS(str1,str2));
        
    }
}
