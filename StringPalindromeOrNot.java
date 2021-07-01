package String;
import java.util.*;
public class StringPalindromeOrNot {
     public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        char ch[] = new char[str.length()];
        ch = str.toCharArray();
        int val,flag=0;
        val = str.length();
        if(val%2==0){
            for(int i=0;i<(val/2);i++){
                if(ch[i]!=ch[str.length()-1-i]){
                    System.out.println("Not Palindrome");
                    flag=1;
                    break;
                }
            }
            if(flag!=1){
                System.out.println("Palindrome");
            }
        }
        else{
            for(int i=0;i<(val/2);i++){
                if(ch[i]!=ch[str.length()-1-i]){
                    System.out.println("Not Palindrome");
                    flag=1;
                    break;
                }
            }
            if(flag!=1){
                System.out.println("Palindrome");
            }
        }
        sc.close();
    }
}
