// WAP to seach for an particular element in the array If is present then return its index and return -1 if not present

import java.util.*;

public class first{
    static void inputArray(int[] array){
        Scanner sc = new Scanner(System.in);
        int n = array.length;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }
    static int indexNo(int[] array, int target){
        int n = array.length;
        for(int i=0;i<n;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter "+n+" no of elements here :- ");
        inputArray(array);

        System.out.println();
        System.out.println("Enter an element to search : ");
        int target = sc.nextInt();
        
        int ans = indexNo(array, target);
        System.out.println(ans);

    }
}