//Program to print NXN matrix in spiral form
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		int b = n-1;
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++)
		        arr[i][j] = s.nextInt();
		}
		int r,c;
		while(a<b){
		    r = a;
    		for(c=a;c<=b;c++)
    		    System.out.print(arr[r][c]+" ");
    		c=b;
    		for(r=a+1;r<=b;r++)
    		    System.out.print(arr[r][c]+" ");
    		r = b;
    		for(c=b-1;c>=a;c--)
    		    System.out.print(arr[r][c]+" ");
    		c = a;
    		for(r=b-1;r>a;r--)
    		    System.out.print(arr[r][c]+" ");
    		a++; b--;
    	//	System.out.println("***"+a+" "+b+"***");
	    }
	    if(a==b)
	        System.out.print(arr[a][b]);
	}
}
