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


//Without changing order

private static void firsteven(int[] arr) {
        int i=-1, j=0;
        for(j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                i++;
                int temp = arr[j];
                int k=j-i, t=j;
                for(int x=0;x<k;x++){    
                    arr[t] = arr[t-1];
                    t--;
                }

                arr[i] = temp;
                System.out.println(j+"--" + Arrays.toString(arr));
            }
            
            
        }
        System.out.println(Arrays.toString(arr));
    }
