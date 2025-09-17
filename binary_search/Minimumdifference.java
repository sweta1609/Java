import java.util.*;

public class Minimumdifference {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int key = in.nextInt();
      int[] ar = new int[n];
      for(int i=0;i<n;i++){
        ar[i]=in.nextInt();
      }
      int result = MinimumDifference(n,key,ar);
      System.out.println(result);
  }
  public static int MinimumDifference(int n,int key,int[] ar){
    int start = 0,end=n-1;
    
    if(key < ar[0]){
      return ar[0];
    }
    if(key > ar[n-1] ){
      return ar[n-1];
    }


    while(start <= end){
      int mid=start+(end-start)/2;
      if(ar[mid] == key){
        return ar[mid];
      }
      if(key < ar[mid]){
        end = mid-1;
      }else{
        start = mid+1;
      }
      
    }
    if(Math.abs(ar[start]-key)< Math.abs(ar[end]-key)){
      return ar[start];
    }else{
      return ar[end];
    }
  }
}