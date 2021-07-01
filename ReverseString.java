package String;
import java.util.*;
public class ReverseString {
    public static void main(String []args){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        char ch[] = s.toCharArray();
        char[] str = new char[s.length()];
        for (int i=0;i<(s.length()-1);i++){
            str[i] = ch[ch.length-1-i];
        }

       for(int i=0;i<str.length;i++){
           System.out.print(str[i]);
       }
       sc.close();
    }
    

}
