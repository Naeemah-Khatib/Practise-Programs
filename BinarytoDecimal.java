import java.util.*;
public class Main
{
     public static void main(String[] args) {
	     
		Scanner s = new Scanner(System.in);
		String num = s.next();
		int sum = 0, j = 0;
		for(int i=num.length()-1;i>=0;i--){
		    sum += (num.charAt(i)-'0')*(Math.pow(2,j));
		    j++;
		}
		System.out.println(sum);
	     
	}
}
