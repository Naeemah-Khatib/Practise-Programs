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
		System.out.println(dec);
	}
}
