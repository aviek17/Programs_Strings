package String;

import java.util.Scanner;

public class SplitBinaryStringWithEqualNoOf1sAnd0s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();
        char [] ch = s.toCharArray();
        int count0=0, count1=0, count =0;
        int len = ch.length;
        for(int i=0;i<len;i++){
            if(ch[i]=='0'){
                count0++;
            }
            if(ch[i]=='i'){
                count1++;
            }
            if(count0==count1){
                count++;
            }
            
        }
        if(count0!=count1){
            System.out.println("String split not possible");
        }
        else{
            System.out.println(count);
        }

        sc.close();
    }
}
