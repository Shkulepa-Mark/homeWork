package Lesson0;

import java.util.Scanner;

public class HelloUser {
    public void userName() {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();

        System.out.println("Hello " + user);
    }
}
