package Lesson2;


import java.util.Scanner;

public class ParityOfNumbers {
    Scanner scanner = new Scanner(System.in);
    public void parity(){
        int num = scanner.nextInt();
        //1 solution
        if(num%2 == 0)
        {
            System.out.println("Число " + num + " четное");
        }
        else
        {
            System.out.println("Число " + num + " нечетное");
        }

        //2 solution
        if(num % 10 == 0 || num % 10 == 2 || num % 10 == 4 || num % 10 == 6 || num % 10 == 8)
        {
            System.out.println("Число " + num + " четное");
        }
        else
        {
            System.out.println("Число " + num + " нечетное");
        }
    }

}
