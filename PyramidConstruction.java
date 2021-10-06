//Identify the logic behind the series - 6 28 66 120 190 276….

//If input is 2, output will be
//   00006
//   00028 00066

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 6, num=22, x=0;
		if(n>0) System.out.println("00006");
		for(int r=2;r<=n;r++){
		    for(int c=1; c<=r;c++){
		        String str = "0000" + (a=(a+num+(16*x)));
		        System.out.print(str.substring(str.length()-5,str.length()));
		        System.out.print(" ");
		        x++;
		    }
		    System.out.println();
		}
	}
}
