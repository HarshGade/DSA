/*
   Facebook Question
   https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


   Question :-
   Given an array of integers nums sorted in non-decreasing order(ascending), find the starting and ending position of a given target value.
   If target is not found in the array, return [-1, -1].

   Example 1:
   Input: nums = [5,7,7,8,8,10], target = 8
   Output: [3,4]



   Brute Force Approach : 
   We can say that we can run 2 loops seprately one for Starting and second for Ending index in 
   1)First loop as we get the first index where are target is found will store that index ans stop iteration
   2) Second loop iterates from Last to First element and store the first occurence (index) from back 


   Optimal Approach : 
   For Starting Index :- Starting index will lies on the Left Side cause array is sorted in Ascending order
   1) Find mid if target==mid (then store mid-index) know it can be possible that there can more target lying os left side so end = mid-1 And we repeat the whole process till the while loop condition(star<=end) terminates and every-time we find the target at array[mid] we store the index of the mid 

   For Ending Index :- Ending index will lie on the Right Side cause array is sorted in Ascending order 
   Find the mid if target == mid (store the mid-index) know it can be possible that more target lying on Right side 
   so start = mid+1 And we repeat the whole process till the while loop conditon(start<=end) terminates and everytime we find the target at array[mid] we store the index of the mid 

   Using boolean we can decide what we are searching for Start or End inder of the target 

*/

import java.util.*;

public class firstLastIndex {

    static void inputArray(int[] array){
        Scanner sc = new Scanner(System.in);
        int n = array.length;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }

     // here using boolean true / false we can decide for what index to search 
     static int search(int[] array , int target , boolean findStartingIndex){
        int ans = -1; // potential answer if target not found
        int start = 0;   int end = array.length-1;
        while(start<=end){
            // find the middle element 
            int mid = start+(end-start)/2;
            if(target<array[mid]){
                end = mid-1;
            }else if(target>array[mid]){
                start = mid+1;
            }else{
                // potential ans found Might be possible we can get another potential answer
                ans = mid; 
                if(findStartingIndex){ // true(searching for starting index Means there might be another answe that may lie in the more left side ) 
                    end = mid-1;
                }else{  // findStartingIndex = false (searching for End index Means there might be another target lies on the more Right hand side cause we are searching for End index)
                    start = mid+1;
                }
            }
        }
        return ans;
    }

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter "+n+" no of elements in ascending order (repeated elements) : ");
        inputArray(array);


        System.out.println("Enter an target element to seac : ");
        int target = sc.nextInt();

        // will ask the user what he wants to Starting or Ending index
        System.out.println("Enter 1 to get First and 2 for Last index for "+target+" : ");
        int userInput = sc.nextInt();

        if(userInput==1){
            System.out.print("First occurence at index : "+search(array, target, true));
        }else{
            System.out.println("Last occurence at index : "+search(array, target, false));
        }
    }
}
