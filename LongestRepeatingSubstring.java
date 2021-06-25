package String;
import java.util.*;
public class LongestRepeatingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();

        StringBuilder sb = new StringBuilder();

        char [] ch = s.toCharArray();
        int len = ch.length;
        int count = 0;

        for(int i=0;i<len-1;i++){
            if(ch[i]==ch[i+1]){
                sb.append(ch[i]);
                count=count+1;
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
