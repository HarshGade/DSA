/*
    Question :- Search in Matrix (Sorted in Row and Column wise)  


    
    Logic : 
    1) If element == target 
    2) If the element < target (All the elements in that row will be Smaller than target So skip that row) = row++ (row++ because we are starting fro 0th row to nth row )
    3) If the element > target (All the elements in that column will be Greater than targer So skip that column)  = column-- (coulmn-- because we are starting from nth to 0th coulmn)
    
    
    // Time Complexity in Worst Case : 1) first loop iterates from 0th to n row 2) second loop iterates from nth to 0th row  = n + n = 2n (constants are ignored ) = O(n)

*/

import java.util.*;

public class first { static void inputMatrix(int[][] matrix , int r, int c){
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            matrix[i][j] = sc.nextInt();
        }
    }
}
// method to return array which consists the index where the target found and if not found return {-1,-1}
static int[] searchTarger(int[][] matrix , int target){
    int row = 0; 
    int col= matrix.length-1;
    while (row<matrix.length && col >= 0) { // row will be increasing and column will be decreasing 
        if(matrix[row][col]==target){
            return new int[] {row,col};
        }
       // If the element < target (All the elements in that row will be Smaller than target So skip that row) = row++ (row++ because we are starting fro 0th row to nth row )
       if(matrix[row][col]<target){
           row++;
       }else{ // If the element > target (All the elements in that column will be Greater than targer So skip that column)  = column-- (coulmn-- because we are starting from nth to 0th coulmn)
          col--;
       }
    }
    return new int[] {-1,-1};
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no of rows : ");
    int r = sc.nextInt();
    System.out.println("Enter no of columns : ");
    int c = sc.nextInt();

    int[][] matrix = new int[r][c];

    System.out.println("Enter "+r*c+" no of elements in sorted row and column wise manner : ");
    inputMatrix(matrix, r, c);


    System.out.println("Enter an target element to search : ");
    int target = sc.nextInt();


    // In order to get arrays[] mathod print in sout statement we need to put Arrays.toString(method_name) this in sout statement
    System.out.print(target+" presenet at index : ");
    System.out.println(Arrays.toString(searchTarger(matrix, target)));

}

    
}
