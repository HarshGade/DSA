/*
    Find the Floor of a Number in Ascending Sorted array  (Greatest Number that is Smaller or equal to target number)   

    Explanation :- array = [2,3,5,9,14,16,18]  target = 15 
    Know find all the Smaller numbers then target = [2,3,5,9,14] in them find the GREATES ELEMENT WHICH IS SMALLER OR EQUAL TO TARGET = 14 

    If the target-element is itself present then Floor for the target-element is the TARGET Itself
    
    Logic :- If the target is present in the arrray return itself 
    If not the in this question we are doing the opposite of Ceiling of number in which in last we returns the array[start] pointer Know here in Floor of an number we will do oppodite will return the array[end] pointer Cause the loop will terminate at such scenario where our end pointer will be at the Greates element which is Smaller or Equal to target

*/


import java.util.*;

public class floorOfNumber{
    static void inputArray(int[] array){
        Scanner sc = new Scanner(System.in);
        int n = array.length;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }

    static int floorOfNumber(int[] array, int target){
        int start = 0;  int end = array.length-1;
        
        while(start<=end){
            // mid element 
            int mid = start+(end-start)/2;
            // if target itself is present at the mid then return itself
            if(target==array[mid]){
                return array[mid];
            }
            if(target<array[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        // return the end pointer 
        return array[end];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter "+n+" no of elements in sorted (ascending): ");
        inputArray(array);


        System.out.println("Enter an target elements to search for its Floor Greates no Smaller or Equal to target : ");
        int target = sc.nextInt();

        floorOfNumber(array, target);
        System.out.println("Floor for "+target+" is : "+floorOfNumber(array, target));
    }
}