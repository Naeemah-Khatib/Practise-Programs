import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int oct = s.nextInt();
	    
	    int dec = 0, rem=0, n=0;
	    while(oct!=0){
	        rem = oct%10;
	        dec += rem*Math.pow(8,n);
	        oct /= 10;
	        n++;
	    }
	    
	    String bin ="";
	    while(dec!=0){
	        bin = String.valueOf(dec%2) + bin;
	        dec /= 2;
	    }
		System.out.println(bin);
	}
}
