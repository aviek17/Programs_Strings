// Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

// Its length is at least .
// It contains at least one digit.
// It contains at least one lowercase English character.
// It contains at least one uppercase English character.
// It contains at least one special character. The special characters are: !@#$%^&*()-+

// Here's the set of types of characters in a form you can paste in your solution:

// numbers = "0123456789"
// lower_case = "abcdefghijklmnopqrstuvwxyz"
// upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
// special_characters = "!@#$%^&*()-+"

// Sample Input 0

// 3
// Ab1
// Sample Output 0

// 3
// Explanation 0

// She can make the password strong by adding  characters, for example, $hk, turning the password into Ab1$hk which is strong.

//  characters aren't enough since the length must be at least .

// Sample Input 1

// 11
// #HackerRank
// Sample Output 1

// 1
// Explanation 1

// The password isn't strong, but she can make it strong by adding a single digit.


#include<stdio.h>
#include<string.h>
int main(){
    int n;
    scanf("%d",&n);
    char str[n];
    scanf("%s",str);
    int count_U = 0,count_L = 0,count_N = 0,count_S = 0;
    for(int i=0;i<strlen(str);i++){
        if(str[i]>=65&&str[i]<=90){
            count_U++;
        }
        else if(str[i]>=97&&str[i]<=122){
            count_L++;
        }
        else if(str[i]>=48&&str[i]<=57){
            count_N++;
        }
        else if((str[i]==43)||(str[i]==45)||(str[i]==64)||(str[i]==94)||(str[i]>=35&&str            [i]<=38)||(str[i]>=40&&str[i]<=42)||str[i]==33){
            count_S++;
        }
    }
    int a,b;
    if(strlen(str)<6){
        a = 6-n;
    }
    else{
        int sum=0;
        if(count_S==0){
            sum=sum+1;
        }
        if(count_U==0){
            sum=sum+1;
        }
        if(count_L==0){
            sum=sum+1;
        }
        if(count_N==0){
            sum=sum+1;
        }
       b= sum;
    }
    if(a>=b){
        printf("%d",a);
    }
    else{
        printf("%d",b);
    }
    return 0;
}
