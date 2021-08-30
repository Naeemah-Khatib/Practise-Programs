import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int bin = s.nextInt();
	    int dec=0, rem, n=0;
	    while(bin!=0){
	        rem = bin%10;
	        dec += (rem*Math.pow(2,n));
	        bin /= 10;
	        n++;
	    }
	    
	    String oct ="";
	    while(dec!=0){
	        oct = String.valueOf(dec%8) + oct;
	        dec /= 8;
	    }
		System.out.println(oct);
	}
}
