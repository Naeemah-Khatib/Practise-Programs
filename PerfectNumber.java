import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	  
	    int sum=0;
	    for(int i=1;i<=n/2;i++){
	        if(n%i == 0)
	            sum += i;
	    }
	    if(sum == n)
	        System.out.println("Yes, it's a perfect number");
	    else
	        System.out.println("No, it's not");
	}
}
