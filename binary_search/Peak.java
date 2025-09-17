// Use binary search on the array to find a peak (O(log n)).

// Check neighbors of mid:

// If arr[mid] < arr[mid + 1] → peak is on the right side → move start = mid + 1.

// Else → peak is on the left side or mid itself → move end = mid.

// Edge cases:

// If mid == 0 → only check arr[mid] > arr[mid + 1].

// If mid == n - 1 → only check arr[mid] > arr[mid - 1].

// Termination:

// Loop continues while start < end.

// When start == end, that index is pointing to a peak element.



import java.util.*;

public class Peak {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int[] ar = new int[n];
      for(int i = 0;i<n;i++){
        ar[i]=in.nextInt();
      }
      int result = Peakelement(n,ar);
      System.out.println(result);
  }
  public static int Peakelement(int n,int[] ar){
    int start = 0;
    int end = n-1;
    int peakelement = -1;
    
    
    while(start <= end){
      int mid= start+(end-start)/2;
      if(mid == 0){
        if(ar[mid] > ar[mid+1]){
          peakelement = mid;
        }
      }else if(mid == n-1){
        if(ar[mid]>ar[mid-1]){
          peakelement= mid;
        }
      }else if (ar[mid] > ar[mid+1] && ar[mid] > ar[mid-1]){
        peakelement = ar[mid];
      }
      if(ar[mid]<ar[mid+1]){
        start=mid+1;
      }else{
        end = mid-1;
      }
    }
    return peakelement;
  }
}