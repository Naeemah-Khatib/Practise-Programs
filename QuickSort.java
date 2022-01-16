// { Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int a[], int s, int e)
    {
        // code here
        if(s>=e) return;
        
        int pivot = partition(a,s,e);
        quickSort(a,s,pivot-1);
        quickSort(a,pivot+1,e);
    }
    
    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    static int partition(int a[], int s, int e)
    {
        // your code here
        int p = s , cnt=0;
        for(int i=p+1;i<=e;i++)
            if(a[i]<=a[p]) cnt++;
        swap(a,p,p+cnt);
        
        int pIndex = p+cnt;
        int i=s, j=e;
        while(i<pIndex && j>pIndex){
            while(a[i]<=a[pIndex]) i++;
            while(a[j]>a[pIndex]) j--;
            
            if(i<pIndex && j>pIndex){
                swap(a,i,j);
                i++; j--;
            }
        }
        return pIndex;
    } 
}
