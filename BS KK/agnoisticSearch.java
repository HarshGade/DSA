/*
   ORDER-AGNOSTIC BINARY SEARCH (means when you dont know If the array is sorted in Ascending or Descending order)
   
   The array must be Sorted 
   Best Case : to check if the array is sorted in Ascending or Descending order
   We can get to know by just Starting and Ending element in the array 
   1) If the starting element is Smaller than the Ending element that means the array is Sorted in Ascending Order
   2) If the first element is Larger than the last element It means the array is Sorted in Descending Order


   QUESTION :- WAP to search for an Target in an Array using (Binary Search) for an Order-Agnostic array 

 */


import java.util.*;

public class agnoisticSearch {
    static void inputArray(int[] array){
        int n = array.length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }
    // method to retun int (index of target if found) elese return -1
    static int searchTarget(int[] array,int target){
        int start = 0;   int end = array.length-1;
        // Using boolean variable check if the array is asscending or descending 
        boolean isAscending = array[start]<array[end];  // if True = Ascending   else = False = Descending
        while (start<=end) {
            int mid = start+(end-start)/2;  // Middle element if Target = array[mid] if Yes return mid = index
            if(target == array[mid]){
                return mid;
            }
            
            if(isAscending){ // logic for asscending oder sorted array
                if(target<array[mid]){  // target is smaller than array[mid] and in AO smaller ele are on left side
                    end = mid-1;
                }else{  // target is greater than array[mid] and in AO greater ele are on right side = start = mid+1
                    start = mid+1;
                }
            }else{  // logic for descending order sorted array
                if(target<array[mid]){ // target is smaller than array[mid] and in DO small ele are in right side
                    start = mid+1;
                }else{  // target is greater than array[mid] and in DO greater ele are in left side
                    end = mid-1;
                }
            }
        }
        return -1; // if target not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        
        System.out.println("Enter "+n+" no of elements in sorted (Ascending or Descending) order : ");
        inputArray(array);

        System.out.println();
        System.out.println("Enter an target element to search : ");
        int target = sc.nextInt();

        // call the method 
        searchTarget(array, target);

        if(searchTarget(array, target)>-1){
            System.out.println(target+" found at "+searchTarget(array, target)+" index");
        }else{
            System.out.println(target+" not found");
        }


    }
}
