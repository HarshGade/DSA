/* 
https://leetcode.com/problems/richest-customer-wealth/description/

 A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example:- 
 Input: accounts = [[1,5],[7,3],[3,5]]
 Output: 10

 Explanation: 
 1st customer has wealth = 6
 2nd customer has wealth = 10 
 3rd customer has wealth = 8
 The 2nd customer is the richest with a wealth of 10.
*/


import java.util.*;


public class sixth {
    static void inputArray(int[][] array,int r , int c){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j] = sc.nextInt();
            }
        }
    }
    // Logic we will have MaxWealth= 0 , and will iterate over every person and check its Wealth and to store its wealth we will have an Sum = 0 and If Persons Sum > MaxWealth then MaxWealth = Sum and in last we will return the MaxWealth 
    static void MaxWealth(int[][] array){
        int maxWealth = 0;
        for(int i=0;i<array.length;i++){   // array.length = row length
            int sum = 0;
            for(int j=0;j<array[i].length;j++){  // array[i].length  = no of columns in ith row 
                sum+=array[i][j];
            }
            if(sum>maxWealth){
                maxWealth = sum;
            }
        }
        System.out.println("Max wealth (row max sum) is :- "+maxWealth);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter no of col : ");
        int c = sc.nextInt();

        int[][] array = new int[r][c];

        System.out.println("Enter input for "+r+" no of person : ");
        inputArray(array, r, c);

        MaxWealth(array);


    }    
}
