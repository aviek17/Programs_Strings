package String;
import java.util.*;
public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int index=0;
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        // System.out.print(index);
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[index]){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index] = temp;
                break;
            }
        }
        for(int i=0;i<=index;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1;i>index;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
