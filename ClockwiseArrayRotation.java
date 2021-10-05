//T - O(n)
// Rotate by k elements

import java.util.*;
public class Main
{
    static int n, a[];
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++){
		    a[i] = s.nextInt();
		}
		int k = s.nextInt();
		rotate(0, n-k-1, a);
		rotate(n-k, n-1, a);
		rotate(0,n-1, a);
		for(int i=0;i<n;i++) System.out.print(a[i]+" ");
	}
	
	static void rotate(int x, int y, int[] a){
	    while(x<y){
	        int temp = a[x];
	        a[x++] = a[y];
	        a[y--] = temp;
	    }
	   
	}
}
