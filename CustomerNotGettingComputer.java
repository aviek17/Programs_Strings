/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Function to find Number of customers who could not get a computer   GeeksForGeeks

package String;
import java.util.*;

/**
 *
 * @author aviek
 */
public class CustomerNotGettingComputer {
    public static int SolveComputer(int n, String str){
        int len = str.length();
        int flag=0;
        int count=0;
        if(n==0)
            return 0;
        Stack <Character> stk = new Stack<Character> ();
        Iterator it = stk.iterator();
        for(int i=0;i<len;i++){
            if(n!=0){
                if(stk.contains(str.charAt(i))){
                    stk.push(str.charAt(i));
                    n++;
                    
                }else{
                    stk.push(str.charAt(i));
                    n--;
                }
            }
            else if(n==0){
                 if(stk.contains(str.charAt(i))){
                    stk.push(str.charAt(i));
                    n++;
                }
                 else if(!stk.contains(str.charAt(i))){
                          count++;
//                          stk.push(str.charAt(i));
                     }
                    
                 }
            }
        return (count/2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str=sc.next();
        System.out.println(SolveComputer(n,str));
    }
}
