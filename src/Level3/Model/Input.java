package Level3.Model;

import Level3.Exceptions.NameNotValidException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static int askInt(String message) {
        while (true) {
            System.out.println(message);

            try {
                int i = sc.nextInt();
                sc.nextLine();
                return i;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String askString(String message) {
        while (true) {
            System.out.println(message);
            String s = sc.nextLine();

            try {
                if (s.matches("^[A-Za-zÀ-ÿ\\u00f1\\u00d1\\s]+$")) {
                    throw new NameNotValidException("Name not valid.");
                }
                return s;
            } catch (NameNotValidException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
