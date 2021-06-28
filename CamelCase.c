// There is a sequence of words in CamelCase as a string of letters, , having the following properties:

// It is a concatenation of one or more words consisting of English letters.
// All letters in the first word are lowercase.
// For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
// Given s, determine the number of words in s.

// Sample Input

// saveChangesInTheEditor
// Sample Output

// 5
// Explanation

// String  contains five words:

// save
// Changes
// In
// The
// Editor


#include<stdio.h>
#include<string.h>
int main(){
    char str[100000];
    scanf("%s",str);
    long count = 1,flag=0;
    for(long i=0;i<strlen(str);i++){
        if(str[i]>=65&&str[i]<=90){
            count++;
            flag=1;
        }
    }
    printf("%ld",count);
    return 0;
}
