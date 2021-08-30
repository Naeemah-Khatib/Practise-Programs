import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    int flag=0;
	    for(int i = 2;i<=num/2;i++){
	        if(isPrime(i)){
	            if(isPrime(num-i)){
	                System.out.println(i+" "+(num-i));
	                flag = 1;
	                
	            }
	        }
	    }
	    if(flag==0)
	        System.out.println("Cannot be expressed as a product of prime numbers");
	}
	
	static boolean isPrime(int num){
	    if(num==1) return false;
	    for(int i=2;i<=num/2;i++){
	        if(num%i == 0)
	            return false;
	    }
	    return true;
	}
}
