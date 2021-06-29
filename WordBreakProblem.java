package String;
import java.util.*;
public class WordBreakProblem {
    public static HashSet <String> dictionary = new HashSet<String>();
    public static Boolean wordBreak(String s){
        if(s.length()==0){
            return true;
        }
        for(int i=1;i<=s.length();i++){
            if(dictionary.contains(s.substring(0,i))&& wordBreak(s.substring(i, s.length()))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String [] dict = {"mobile","samsung","sam","sung", 
        "man","mango","icecream","and", 
        "go","i","like","ice","cream"};

        for (String temp : dict){
            dictionary.add(temp);
        }
        Scanner sc =  new Scanner (System.in);
        String str;
        str = sc.next();
        System.out.println(wordBreak(str));
        sc.close();
    }
}
