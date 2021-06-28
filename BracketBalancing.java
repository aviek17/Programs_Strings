package String;
import java.util.*;

public class BracketBalancing {
    public static int BracketResult(String str){
        Stack <Character> s = new Stack<Character>();
        int length = str.length();
        int result =0,n=0;
        if(length%2!=0){
            result = -1;
        }
        else{
            for(int i=0;i<length;i++){
                if(str.charAt(i)=='}' && s.size()==0){
                    s.push('}');
                }
                else if(str.charAt(i)=='{'){
                    s.add('{');
                }
                else if(str.charAt(i)=='}' && s.peek()=='{'){
                    s.pop();
                }
                
            }
            int k = s.size();
            while(!s.empty()){
                s.pop();
                n++;
            }
            result = (n%2 + k/2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        System.out.println(BracketResult(str));
        sc.close();
    }
}
