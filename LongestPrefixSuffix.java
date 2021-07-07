package String;
import java.text.BreakIterator;
import java.util.*;
public class LongestPrefixSuffix {
    static int ReturnLongest(String str){
        String str1, str2;
        int length = str.length();
        if(length%2==0){
            int upper = length/2 ;
            str1 = str.substring(0, upper);
            str2 = str.substring(upper,length);
            // System.out.println("Str1 "+str1);
            // System.out.println("Str2 "+str2);
        }
        else{
            int upper = length/2;
            str1 = str.substring(0, upper);
            str2 = str.substring(upper+1,length);
        }

        int value ;
        value = Result(str1, str2);
        return value;
    }

    static int Result(String str1, String str2){
        int result=0;
        if(str1.equals(str2)){
            result = str1.length();
            // System.out.println("he "+ result);
        }
        else{
            for(int i=1;i<str1.length();i++){
                Result(str1.substring(0,str1.length()-i), str2.substring(0,str2.length()-i));
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str ;
        str = sc.next();
        System.out.println(ReturnLongest(str));
        sc.close();
    }
}
