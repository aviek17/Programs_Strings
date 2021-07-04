package String;
import java.util.*;
public class PrintAllSubsequences {
    static void printSubsequences(String s, String output){
        if(s.length()==0){
            System.out.println(output);
            return;
        }
        // let xy be a string, considering x , we may or may not choose x
        // for not choosing x
        printSubsequences(s.substring(1), output); // we excluded x and not included it in output
        printSubsequences(s.substring(1), output+s.charAt(0));

    }
    static void printSubsequences(String s){
        printSubsequences(s,"");
    }
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner (System.in);
        s = sc.next();
        printSubsequences(s);
        sc.close();
    }
}
