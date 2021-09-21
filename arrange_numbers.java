//bring all the even numbers at the beginning of an array

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
		    a[i] = s.nextInt();
		}
		for(int i=0,j=0;i<=n-1 && j<=n-1; ){
		    if(a[i]%2==0 && (a[j]%2==0 || a[j]%2!=0)){
		      i++; j++;  
		    }
		    else if(a[i]%2!=0 && a[j]%2!=0)
		        j++;
		    else{
		        int temp = a[i];
		        a[i] = a[j];
		        a[j] = temp;
		        i++; j++;
		    }
		        
		}
		
		
		for(int i=0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
