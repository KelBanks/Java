import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your gender (ex. M or F): ");
        char sex = scanner.next().charAt(0);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your phone number: ");
        long mobile = scanner.nextLong();



        System.out.println("My name is: " + name);
        System.out.println("My gender is: " + sex);
        System.out.println("My age is: " + age);
        System.out.println("My phone number is: " + mobile);

    }
}