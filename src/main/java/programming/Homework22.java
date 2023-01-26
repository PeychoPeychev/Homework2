package programming;

import java.util.Scanner;

public class Homework22 {
    public static void main(String [] args) {

        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please enter your username:");
        String username =scanner.next();
        System.out.println(name.equalsIgnoreCase(username));
    }
}
