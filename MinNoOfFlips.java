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
public class MinNoOfFlips {
    static int SolveFlip(String str){
        int countEven=0;                                     //0101010101
        int countOdd=0;                                     //1010101010
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                if(str.charAt(i)=='1'){
                    countEven++;
                }else if(str.charAt(i)=='0'){
                    countOdd++;
                }
            }else{
                if(str.charAt(i)=='0'){
                    countEven++;
                }else if(str.charAt(i)=='1'){
                    countOdd++;
                }
            }
        }
        return (Math.min(countEven, countOdd));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        System.out.println(SolveFlip(str));
    }
}
