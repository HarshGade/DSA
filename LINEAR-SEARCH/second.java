/*
 WAP to search for an character in the string 
 Logic :- using string-name.charAt() we can search for an character 
  We cannot directly take input for an character , 1) We need to take the character in the form of String from the user 
  2) Then using charAt(index-no) we can get the first character 
  syntax :- char store(variabe-name) = string-name.charAt(0);
 */

import java.util.*; // imported all the classes 

public class second{

    static boolean isPresent(String userInput ,char target){
        // check if user keeps the input empty
        if(userInput.length()==0){
            return false;
        }
        for(int i=0;i<userInput.length();i++){
            if(userInput.charAt(i)==target){  // userInput.charAt(i) to cheak at every iteration of string if it matches to target 
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an string here :- ");
        String userInput = sc.nextLine();  // using nextLine() we will be able to take inputs having spaces-in-between

        System.out.println();
        System.out.print("Enter target/character to search in above string :-  ");
        String userInput2 = sc.next();
        
        // know store the first character which is at 0th index using .charAt(0) from above userInput2
        char target = userInput2.charAt(0);  // this is how we can take input for an Character 

        if(isPresent(userInput, target)){
            System.out.println("Yest "+target+" is present in the string ");
        }else{
            System.out.println("No "+target+" is not present in the string ");
        }


    }
}