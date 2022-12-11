package programming;

import java.util.Scanner;

    public class Homework2 {
        public static void main(String[] args) {
            String inputString = "Your name is <myName>";
            System.out.println(inputString);
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println(inputString.replace("myName", name));
        }
    }
