// WAP to search for an element in the array in specific range 

import java.util.*;

public class third{
    static void inputArray(int[] array){
        Scanner sc = new Scanner(System.in);
        int n = array.length;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }
    static void searchTarget(int[] array,int target , int start , int end){
        for(int i=start;i<=end;i++){
            if(array[i] == target){
                System.out.println("Yes "+target+" lies in range");
                break;
            } else{
                System.out.println("No "+target+" does not lies in range");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter "+n+" no of elements here : ");
        inputArray(array);

        System.out.println();
        System.out.println("Enter starting index : ");
        int start = sc.nextInt();
        System.out.println("Enter ending index : ");
        int end = sc.nextInt();

        System.out.println();
        System.out.println("Enter target element to search : ");
        int target  = sc.nextInt();

        searchTarget(array, target, start, end);

    }
}