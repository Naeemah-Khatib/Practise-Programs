import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dividend = s.nextInt();
		int divisor = s.nextInt();
		if(dividend==0){
		    System.out.println(divisor);
		    return;
		}
		else if(divisor==0){
		    System.out.println(dividend);
		    return;
		}
		
		int rem = 1;
		while(rem!=0){
		    rem = dividend % divisor;
		    if(rem!=0){
		        dividend = divisor;
		        divisor = rem;
		    }
		}
		System.out.println(divisor);
	}
}
