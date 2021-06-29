package String;
import java.util.*;
// import java.lang.*;
public class StringRotation {
    public static void main(String [] args){
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();

        int flag =0;

        int len1 = str1.length();
        int len2 = str2.length();

        char ch1[] = new char[len1];
        char ch2[] = new char[len2];

        ch1 = str1.toCharArray();
        ch2 = str2.toCharArray();

        if(len1!=len2){
            System.out.println("False");
        }

        if(len1==len2){
            for(int i=0;i<len1;i++){
                if(ch1[i]!=ch2[len2-1-i]){
                    System.out.println("False");
                    flag = 1;
                    break;
                }
            }
        }

        if(flag==0){
            System.out.println("True");
        }

        sc.close();

    }
}
