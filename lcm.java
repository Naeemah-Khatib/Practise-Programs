import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n1 = s.nextInt();
	    int n2 = s.nextInt();
	    int a = n1>n2?n1:n2;
	    int i;
	    for(i=a;i<=n1*n2;i+=a){
	        if(i%n1==0 && i%n2==0)
	            break;
	    }
		System.out.println(i);
	}
}
