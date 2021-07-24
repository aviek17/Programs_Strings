package String;
import java.util.*;

public class StringIntoEquivalentMobileNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Arr[] = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999"
                    };
        String str ;
        str = sc.next();
        StringBuffer st = new StringBuffer();
        int len = str.length();
        // char arr[] = new char[len];
        // arr = str.toCharArray();
        for(int i=0;i<len;i++){
            if (str.charAt(i) == ' ')
                st = st.append(0);
      
            else
            {
                // Calculating index for each 
                // character
                int position = str.charAt(i) - 'A';
                st = st.append(Arr[position]) ;
            }

        }
        System.out.println(st);
        sc.close();
    }
}
