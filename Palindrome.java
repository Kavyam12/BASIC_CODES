// Write a program to take a string from the user and print if the string is palindrome or not.


import java.util.*;
public class Palindrome
{
  public static void main (String args [])
  {
    // Create a scanner object to take Input from the user.
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String Original_string = sc.nextLine();//This is the original string which has to be checked for the condition of palindrome
        String Reversed_String = "";// This variable will store the reversed string
        int length_of_string = s.length();
    // Traverse the string from behind and concatenate the letters in the reversed_string variable
        for (int i = l - 1; i >= 0; i--) {
            Reversed_String = Reversed_String + Original_string.charAt(i);

        }
  // If the reversed_string is same as the original_string then it is a palindrome string
        if (Original_string.equalsIgnoreCase(Reversed_String)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome ");
        }
        sc.close();
  }
}
