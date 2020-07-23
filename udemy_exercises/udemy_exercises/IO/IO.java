package udemy_exercises.IO;

import java.util.Scanner;

public class IO {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter your ssn: \n");
        String input = scanner.nextLine();

        System.out.println("You have entered: " + input + " and now your credit is my credit! Thanks! ;) ");
    }
}
