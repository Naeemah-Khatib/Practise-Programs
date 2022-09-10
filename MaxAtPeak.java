// Array - numbers 1st increasing and then decreasing, find max 

public class maxinpeak {

    static int findmax(int[] a){
        int mid, low =0, high = a.length-1;


        while(low<=high){
            if(low==high)
              return a[low];
            if(low==high-1)
              if (a[low]<a[high])
                return a[high];
              else 
                return a[low];
            mid = (low+high)/2;
            if (a[mid-1]<a[mid] && a[mid]<a[mid+1])
              low = mid+1;
            else if (a[mid-1]>a[mid] && a[mid]>a[mid+1])
              high = mid-1;
            else
              return a[mid];

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,0};
        System.out.println(findmax(arr));
    }


        
}


