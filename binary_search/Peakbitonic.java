import java.util.*;

public class Peakbitonic {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] ar = new int[n];
      for(int i = 0;i<n;i++){
        ar[i] = in.nextInt();
      }
      int result =Maximumelementinbitonicarray(n,ar);
      System.out.println(result);
  }
  public static int Maximumelementinbitonicarray(int n,int[] ar){
    int start = 0;
    int end = n-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(mid == 0){
        if(ar[mid]>ar[mid+1]){
          return ar[mid];
        }
      }else if(mid == n-1){
        if(ar[mid]>ar[mid-1]){
          return ar[mid];
        }
      }else if(ar[mid] >ar[mid-1] && ar[mid] >ar[mid+1]){
        return ar[mid];
      }
      if(ar[mid] < ar[mid+1]){
        start= mid+1;
      }else{
        end = mid-1;
      }
    }
    return -1;
  }
}