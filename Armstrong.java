// Write a java program to take a number from the user and print whether the number is an armstrong number or not.


import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
      // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int number = sc.nextInt();
        String number_to_string = Integer.toString(num);// Convert the integer entered by the user into string for easy traversing
        int length_of_string = s.length();// Stores the length of the string
        int armstrong_check = 0;
        int temporary = 0;
        char u_loop_variable = ' ';
        String y_loop_variable = "";

      // This loop perform the basic operations to check if the entered number is a armstrong number or not.
        for (int i = 0; i < length_of_string; i++) {
            u_loop_varible = s.charAt(i);
            y_loop_varible = String.valueOf(u_loop_varible);
            temporary = Integer.parseInt(y_loop_varible);
            armstrong_check += Math.pow(temporary, length_of_string);
        }

        if (armstrong_check == number) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
