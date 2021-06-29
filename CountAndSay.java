package String;
import java.util.*;
public class CountAndSay {
    static String returnCountAndSay(int n){
        String val = "1";
        for(int i=0;i<n;i++){
            char c = val.charAt(0);
            int count =1;
            StringBuilder s = new StringBuilder();
            for(int j=1;j<val.length();j++){
                if(c!=val.charAt(j)){
                    s.append(count);
                    s.append(c);
                    count =0;
                    c =val.charAt(j);
                }
                count++;

            }
            s.append(count);
            s.append(c);
            val=s.toString();
        }
        return val;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.println(returnCountAndSay(n));
    }
}
