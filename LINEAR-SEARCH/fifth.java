/* 

WAP to Find no of no's That have even no of digits 

Given an array NUMS of integers , return how many of them contains Even Number digits
Example :- nums = [12,3,154]   // Means har number mai kitne digits hai vo dekhneka Then wo no of digits evn hai ya odd hai ye return karneka 

Output :- 
12 contains 2 digits (even number of digits)   // 2 digit hai isliyse even no of digits hai 
3 contains 1 digits (odd number of digits)
154 contains 3 digits (odd number of digits)


Logic :- To check if the number is having Even or Odd no of digits in it 
1) Write a method to count the no.of digits
2) Convert the number to String and then using .length function gets its lenght and check if length of string is even or odd And based on that we can return if the number has even or odd no of digits in it

*/

import java.util.*;

public class fifth{

    static void inputArray(int[] array){
        Scanner sc = new Scanner(System.in);
        int n = array.length;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
    }

// method to check if number is having even or odd no of digits in it
// we will be using String method which logic is explained above
    static void evenOdd(int[] array){
        int n = array.length;
        for(int i=0;i<n;i++){
            String stringConversion =  String.valueOf(array[i]);  // this line converts every element of array to String so that 
            int lengthOfNumber = stringConversion.length();   // in this line we can get its length 
            if(lengthOfNumber%2==0){
                System.out.println(array[i]+" consist "+lengthOfNumber+" (even no of digits in it)");
            }else{
                System.out.println(array[i]+" consists "+lengthOfNumber+" (odd no of digits in it)");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements u want :- ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter "+n+" no of elements here :- ");
        inputArray(array);
        
        System.out.println();
        // Calling the method to Find no of digits in the Number 
        evenOdd(array);

        
    }
}