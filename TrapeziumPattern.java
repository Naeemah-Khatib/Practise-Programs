//For example,
//  If N = 2
//  1*2*5*6
//    3*4

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int l=1, countl=1, countr=1;
		for(int i=n;i>=1;i--){
		    
		    for(int j=i;j<n;j++)
		        System.out.print(" ");
		    for(int j=1;j<=i;j++)
		        System.out.print((countl++)+"*");
		    for(int j=1;j<i;j++)
		        System.out.print((countr++)+i*i+"*");
		    System.out.print((countr++)+i*i);
		    System.out.println();
		}
	}
}
