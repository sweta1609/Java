// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/



// ### **1. Deciding if a given element is the k-th smallest in a matrix**

// **Scenario:** Suppose we have taken the first and last element of a sorted matrix and got a candidate element (example: 8), and we want to find the 9th smallest element.

// **Step (i): Check position of candidate**

// * Count how many elements in the matrix are smaller than the candidate (8).
// * If only 4 elements are smaller than 8, obviously 8 **cannot be the 9th smallest element**.
// * It can be **at most the 5th smallest element**.
// * **Action:** Move the search window **down** (`low = mid + 1`) because the smallest element we want is greater than 8.

// **Step (ii): If candidate is mid (8) and we need the 2nd smallest element**

// * Count elements less than 8. Suppose there are 4 elements smaller.
// * This means the 2nd smallest is **less than mid**.
// * **Action:** Move the search window **up** (`high = mid`).

// ---

// ### **2. Deciding where to start searching in a sorted matrix**

// * You can start **from bottom-left** `[n-1, 0]` or **top-right** `[0, m-1]`.

// **Reason bottom-left is simpler:**

// * You don’t have to check **all elements**.

// * At bottom-left:

//   * If current element is **smaller**, move **right**.
//   * If current element is **larger**, move **up**.

// * This allows systematic traversal without counting every element manually.







class Sortedmatrix {
    public int kthSmallest(int[][] matrix, int k) {
      int n = matrix.length;
    //   taking largest and smalledt element as we know matrix is sorted
      int start = matrix[0][0];
      int end = matrix[n-1][n-1];
    //   conditio we used in binary search
      while(start<end){
        int mid = start+(end-start)/2;
        int count = Countless(matrix,mid);
        if(count <k){
            start =mid+1;
        }else{
            end = mid;
        }

      }
      return end;
        
    }
    private int Countless(int[][] matrix,int mid){
        int n = matrix.length;
        // we need to start from bottom left so we took row = n-1
         int row = n-1;
         int col = 0;
         int count = 0;
         while(row >= 0 && col <n){
            if(matrix[row][col] <=mid){
                // if value is less then mid means above value is also less then mid we can go up column and check value
                count += row+1;
                col++;
            }else{
                row--;
            }
         }
         return count;
    }
}