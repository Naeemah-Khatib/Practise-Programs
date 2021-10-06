//Split the word into exactly three palindromic substrings
//the length of the first palindromic substring using left to right processing should be least
/* Input
   aaaabaaaa
   Output
   a
   aaabaaa
   a
  */

import java.util.*;
public class Main
{
    static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        if(String.valueOf(sb.reverse()).equals(str)) return true;
        return false;
    }
	public static void main (String[] args) 
    {
        Scanner s = new Scanner (System.in);
        String str = s.next();
        String str1, str2, str3;
        int flag = 0;
        int len = str.length();
        for(int i=1;i<len;i++){
            str1 = str.substring(0,i);
            if(isPalindrome(str1)){
                for(int j=1;j<len-i;j++){
                    str2 = str.substring(i,j+i);
                    str3 = str.substring(i+j, len);
                    if(isPalindrome(str2) && isPalindrome(str3)){
                        System.out.println(str1+" "+str2+" "+str3);
                        flag = 1;
                        break;
                    }
                }
                if(flag==1) break;
            }
        }
        if(flag==0) System.out.println("Impossible");
	}
}
