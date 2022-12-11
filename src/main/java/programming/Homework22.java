package programming;

import java.util.Scanner;

public class Homework22 {
    public static void main(String [] args) {

        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please re-enter your name:");
        String rename =scanner.next();
        boolean equals1 = name.equals(rename);
        System.out.println("\"" + name + "\" equals \"" + rename + "\"? " + equals1);
    }
}
