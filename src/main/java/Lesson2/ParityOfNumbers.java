package Lesson2;


import java.util.Scanner;

public class ParityOfNumbers {
    Scanner scanner = new Scanner(System.in);
    public void parity(){
        int num = scanner.nextInt();

        if(num%2 == 0)
        {
            System.out.println("Число четное");
        }
        else
        {
            System.out.println("Число нечетное");
        }
    }

}
