/*
BINARY SEARCH CODE FOR SORTED ARRAY IN ASCENDING ORDER
   
WAP using Binary Search Algorithm to find target element in 
Sorted array in ascending order If target found return its index otherwise return -1

REMEMBER : 
Know if the length is in ODD example :- 11 then the middle element will not be 5.5 It will be 5 (because we dont have decimal point index in arrays like 5.5 Also we are storing middle-element in the Integer(int) variable)

To find middle element , we are using start and end ponter bcs if we just use aray.length/2 which will be able to find the first middle element But after that we change the start or end pointer positions , where we cannot find the middle element using the above method , if we do it will be wrong 

*/

import java.util.*;

public  class testing{
    static void inputArray(int[] array){
        int n = array.length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }
    static int searchTarget(int[] array , int target){
        int start = 0; int end = array.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;// if target not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter "+n+" no of element in ascending sorted manner : ");
        inputArray(array);

        System.out.println("Enter an target element to ");

    }
}