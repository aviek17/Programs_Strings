package String;
// import java.util.*;
// public class DuplicateCharacters {
//     static void findDuplicates(String str){
//         char ch[] = new char[str.length()];
//         ch = str.toCharArray();
//         int len = str.length();
//         int flag=0;
//         HashSet <Character> hash = new HashSet<>();
//         // HashSet <Character> hs = new HashSet<>();
//         hash.add(ch[0]);
//         for(int i=1;i<len;i++){
//             if(hash.contains(ch[i])){
//                 // hs.add(ch[i]);
//                 System.out.println(ch[i]);
//                 flag=1;
//             }
//             else{
//                 hash.add(ch[i]);
//             }
//         }
        
//         if(flag==0){
//             System.out.println("No Duplicates");
//         }
//     }
//     public static void main(String[] args){
//         String str;
//         Scanner sc = new Scanner (System.in);
//         str = sc.next();
//         findDuplicates(str);
//         sc.close();

//     }
// }


// Using HashMap

import java.util.*;
public class DuplicateCharacters{
    static void printDups(String str)
    {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        
        for (int i = 0; i < str.length(); i++) {
            if (!count.containsKey(str.charAt(i)))
                count.put(str.charAt(i), 1);
            else
                count.put(str.charAt(i),
                          count.get(str.charAt(i)) + 1);
        }
 
        /*Print duplicates in sorted order*/
//        for (Map.Entry mapElement : count.entrySet()) {
//            char key = (char)mapElement.getKey();
//            int value = ((int)mapElement.getValue());
// 
//            if (value > 1)
//                System.out.println(key
//                                   + ", count = " + value);
//        }
    }
    // Driver code
    public static void main(String[] args)
    {
        String str = "test string";
        printDups(str);
    }
}