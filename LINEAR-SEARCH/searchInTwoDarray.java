// WAP to seach a element in 2D-Array 

import java.util.*;

public class searchInTwoDarray {
    static void inputArray(int[][] array, int r, int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++){   
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }

    static void searchTarget(int[][] array, int target){
        for(int i=0;i<array.length;i++){  // array.length represents no of rows 
            for(int j=0;j<array[i].length;j++){   // array[i].length   represents in particular row How many no of columns are there 
                if(array[i][j] == target){
                    System.out.println(target+" yes is present");
                    return ;  // when return statement gets hit loop stops iterating
                }else{
                    System.out.println(target+" is not present ");
                    return ;  // same here
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows :- ");
        int r = sc.nextInt();
        System.out.println("Enter no of columns :- ");
        int c = sc.nextInt();

        int[][] array = new int[r][c];

        System.out.println();
        System.out.println("Enter " + r * c + " no of elements here :- ");
        inputArray(array, r, c);

        System.out.println();
        System.out.print("Enter an target element to search in 2d array :  ");
        int target = sc.nextInt();

        searchTarget(array, target);

    }
}