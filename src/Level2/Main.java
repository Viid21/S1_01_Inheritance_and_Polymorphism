package Level2;

import Level2.Model.SmartPhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone phone = new SmartPhone("Xiaomi", "Poco f3");

        System.out.println("What number do you want to call?");
        phone.call(sc.next());

        phone.takePhoto();
        phone.alarm();
    }
}
