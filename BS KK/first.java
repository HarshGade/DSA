/*
   BINARY SEARCH CODE FOR SORTED ARRAY IN ASCENDING ORDER
   
   WAP using Binary Search Algorithm to find target element in 
   Sorted array in ascending order If target found return its index otherwise return -1

   REMEMBER : 
   Know if the length is in ODD example :- 11 then the middle element will not be 5.5 It will be 5 (because we dont have decimal point index in arrays like 5.5 Also we are storing middle-element in the Integer(int) variable)

   To find middle element , we are using start and end ponter bcs if we just use aray.length/2 which will be able to find the first middle element But after that we change the start or end pointer positions , where we cannot find the middle element using the above method , if we do it will be wrong 

 */

 import java.util.*;

 public class first{
    static void inputArray(int[] array){
        int n = array.length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }
    static int searchTarget(int[] array, int target){
        int start = 0; int end = array.length-1;

        while (start<=end) {
            int mid = start+(end-start)/2;  // find the middle element and check if target == middle-element if yes return mid = index
            if(target==array[mid]){
                return mid;
            }
            // Write logic for Asscending Order
            if(target<array[mid]){  // Target hai vo middle elements se smaller hai And smaller elements are on left side in Ascending order 
                end = mid-1;
            }else{  // target is > than middle element And Greater elements are on the right side in Ascending order
                start = mid+1;
            }
            
        }
        return -1;  // if target element not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter "+n+" no of elements  in Ascending order : ");
        inputArray(array);
        
        System.out.println();
        System.out.println("Enter an target element to search : ");
        int target = sc.nextInt();

        // call the method
        searchTarget(array, target);
        // System.out.println(searchTarget(array, target)+" index ");
        if(searchTarget(array, target)>-1){
            System.out.println(target+" element is ar "+searchTarget(array, target)+" index");
        }else{
            System.out.println(target+" not found ");
        }




    }
 }