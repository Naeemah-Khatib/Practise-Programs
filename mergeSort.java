// Only Solution class

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int len1 = m-l+1;
         int len2 = r-m;
         int[] a1 = new int[len1];
         int[] a2 = new int[len2];
         int k = l;
         
         for(int i=0;i<len1;i++) a1[i] = arr[k++];
         for(int i=0;i<len2;i++) a2[i] = arr[k++];
         
         int i=0, j=0;
         k=l;
         while(i<len1 && j<len2){
             if(a1[i]<=a2[j]){
                 arr[k++] = a1[i++];
             } 
             else if(a2[j]<=a1[i])
                 arr[k++] = a2[j++];
         }
         while(i<len1) arr[k++] = a1[i++];
         while(j<len2) arr[k++] = a2[j++]; 
    }
    
    
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r) return;
    
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        
        merge(arr,l,mid,r);
        
    }
}
