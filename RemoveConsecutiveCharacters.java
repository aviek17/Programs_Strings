/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;
import java.util.*;

/**
 *
 * @author aviek
 */
public class RemoveConsecutiveCharacters {
    public static void SolveDuplicateCharacter(String str){
        Stack <Character> stk = new Stack<Character> ();
        for(int i=0;i<str.length()-1;i++){
            if(!stk.contains(str.charAt(i))){
                stk.push(str.charAt(i));
            }
        }
        Iterator it = stk.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        SolveDuplicateCharacter(str);
    }
}
