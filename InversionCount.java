
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends



class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    //static long count = 0;
    static long inversionCount(long a[], long N)
    {
        // Your Code Here
        /*long count=0;
        for(long i=1;i<N;i++){
            for(long j=0;j<i;j++){
                if(a[(int)j]>a[(int)i]) count++;
            }
        }
        return count;*/
        
        return MSort(a,0,N-1);
        
    }
    
    static long MSort(long a[], long l, long r){
        if(l>=r) return 0;
        long s=0;
        long m = (l+r)/2;
        s+=MSort(a,l,m);
        s+=MSort(a,m+1,r);
        
        s+=sort(a,l,m,r);
        
        return s;
    }
    
    static long sort(long a[], long l, long m, long r){
        long n1 = m-l+1;
        long n2 = r-m;
        long count = 0;
        long a1[] = new long[(int)n1];
        long a2[] = new long[(int)n2];
        
        int k = (int)l;
        for(int i=0;i<(int)n1;i++,k++) a1[i] = a[k];
        for(int i=0;i<(int)n2;i++, k++) a2[i] = a[k];
        
        int i=0, j=0;
        k=(int)l;
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]) a[k++] = a1[i++];
            else{ count += (m+1 - (l+i)); a[k++] = a2[j++];}
        }
        while(i<n1){ a[k++] = a1[i++];}
        while(j<n2){ a[k++] = a2[j++];}
        
        return count;
    }
}
