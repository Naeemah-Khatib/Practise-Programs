import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sen = s.nextLine();
		int key = s.nextInt();
		String ans ="";
		if(key<0){
		    System.out.println("Invalid Input");
		}
		else if(key==0){
		    System.out.println(sen);
		}
		else{
    		for(int i=0;i<sen.length();i++){
    		    char ch = sen.charAt(i);
    		    if(ch=='-'){
    		        ans += String.valueOf(ch); 
    		    }
    		    else if(Character.isDigit(ch)){
    		        if((ch+key)<=57){
    		            ans += String.valueOf((char)(ch+key));
    		        }
    		        else{
    		            int n = ch + key - 57;
    		            ans += String.valueOf((char)(48 + n));
    		        }
    		    }
    		    else if(ch==32){
    		        ans += " ";
    		    }
    		    else if(Character.isLetter(ch)){
    		        if(Character.isUpperCase(ch)){
    		            if((ch+key)<=90)
    		                ans += String.valueOf((char)(ch+key));
    		            else{
    		                int n = ch + key - 90;
    		                ans += String.valueOf((char)(65 + n));
    		            }
    		        }
    		        else if(Character.isLowerCase(ch)){
    		            if((ch+key)<=122)
    		                ans += String.valueOf((char)(ch+key));
    		            else{
    		                int n = ch + key - 122;
    		                ans += String.valueOf((char)(97 + n));
    		            }
    		        }
    		    }
    		}
    		System.out.println(ans);
		}
	}
}
