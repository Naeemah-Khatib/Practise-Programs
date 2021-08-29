import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int n1 = n;
	    int sum=0, fact, rem;
	    while(n1!=0){
	        rem = n1%10;
	        fact = 1;
	        for(int i=1;i<=rem;i++){
	            fact *= i;
	        }
	        sum += fact;
	        n1 /= 10;
	    }
	    if(sum == n)
	        System.out.println("Yes, it's a strong number");
	    else
	        System.out.println("No, it's not");
	}
}
