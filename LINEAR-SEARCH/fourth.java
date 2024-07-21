// WAP to print Minimum and Maximum element from the array 

import java.util.*;

public class fourth {
    
    static void inputArray(int[] array){
        int n = array.length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }

    static void minimumMaximum(int[] array){
        int min = array[0];
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        
        System.out.println("Enter "+n+" no of elements here :- ");
        inputArray(array);

        System.out.println();
        minimumMaximum(array);

    }
}
f