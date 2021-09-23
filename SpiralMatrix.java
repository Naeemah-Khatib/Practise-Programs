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


//Program to print any matrix in spiral form
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++)
		        arr[i][j] = s.nextInt();
		}
		
		int k=0, l=0;
		while(k<m && l<n){
		    for(int i=l;i<n;i++)
		        System.out.print(arr[k][i]+" ");
		    k++;
		    for(int i=k;i<m;i++)
		        System.out.print(arr[i][n-1]+" ");
		    n--;
		    if(k<m){
		        for(int i=n-1;i>=l;i--)
		            System.out.print(arr[m-1][i]+" ");
		        m--;
		    }
		    if(l<n){
		        for(int i=m-1;i>=k;i--)
		            System.out.print(arr[i][l]+" ");
		        l++;
		    }
		}
	}
}
