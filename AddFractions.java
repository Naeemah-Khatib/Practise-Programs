import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num1 = s.nextInt();
	    int den1 = s.nextInt();
	    int num2 = s.nextInt();
	    int den2 = s.nextInt();
	    
	    if(den1==0 || den2==0){
	        System.out.println("Denominator can't be zero");
	        return;
	    }
	    
	    int numr, denr;
	    
	    if(den1==den2){
	        numr = num1 + num2;
	        denr = den1;
	    }
	    else{
	        numr = num1*den2 + num2*den1;
	        denr = den1*den2;
	    }
	    
	    int rem = 1, divisor = numr, dividend = denr;
	    while(rem!=0){
	        rem = dividend%divisor;
	        if(rem!=0){
	            dividend = divisor;
	            divisor = rem;
	        }
	        
	    }
	    
		System.out.println("("+num1+"/"+den1+")"+"+"+"("+num2+"/"+den2+")"+"="+"("+numr/divisor+"/"+denr/divisor+")");
	}
}
