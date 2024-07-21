/*
    https://leetcode.com/problems/search-insert-position/
    WAP to find Ceiling of an Number in Ascending Sorted Array 

    Ceiling of Number : Smallest element in array Greater or Equal to the Target element 

    1) If the Target element is itself present in the array then the Target element Itself is the Smallest element in array greater or equal to the target 
    2) Know if the the Target element is not present istself Then all the elements which are Greater than the target in those elements We need to Search for the Smallest element which must be Greater or Equal to the target-element 

    Example :
    1) If the Target element is present  array itself  array = [1,2,3,4,5] target = 5 , Ceiling = 5 
    2) If the Target element is not present itself    arrray = [1,2,4,6,10,11]  target = 5, Ceiling = 6
    Know here the Target itself is not present Know we search for All elements Greater = 6,10,11 = And in this 6 is the Smallest element which is Greater or Equal to the Target element 

    
    LOGIC :- To find Ceiling for an target element 

    1) If the TargetElement is present itself in the array then it itself is the smallest elements which is Greater or Equal to the Target Ceiling will be the TargetElement itself 

    2) If TargetElement is not present Itself then Same steps we follow to search for an element And in last return 
    ----- Start Pointer (which will be the Smallest element Greater or Equal to the targetElement)
    Cause in this steps the loop conditon start<=end gets Terminate at such condition where the Start pointer is at the element which will be Smallest element Greater or Equal to the Target 



*/

import java.util.*;

public class ceilingOfNumber{

    static void inputArray(int[] array){
        int n = array.length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }
    static int targetceiling(int[] array, int target){
        // two pointers for start and end 
        int start = 0; int end = array.length-1;

        // if the target-elemen is greater than last element Than return -1 = Ceiling for target-element not present
        if(target>array[end]){
            return -1;
        }

        while(start<=end){
            // search for mid element 
            int mid = start+(end-start)/2;
            // know if the target itself is present in the Array then Ceiling  will be the Target itself
            if(target==array[mid]){
                return array[mid];   
            }
            if(target<array[mid]){  // target is in left
                end = mid-1;
            }
            if(target>array[mid]){  // target is in right 
                start = mid+1;
            }
            // By completeting all these steps our Start pointer will reach to the Element which is the Smallest element Greater or Equal to the Target element 
        }
        // will return the start(index or element as uare asked in question)
        return array[start];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want in array : ");
        int n = sc.nextInt();
        
        int[] array = new int[n];

        System.out.println("Enter "+n+" no of elements in ascending sorted manner : ");
        inputArray(array);


        System.out.println("Enter an target element to find its Ceiling : ");
        int target = sc.nextInt();

        targetceiling(array, target);
        System.out.println(targetceiling(array, target)+" Ceiling for "+target);


    }
    
}