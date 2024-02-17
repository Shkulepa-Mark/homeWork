package Lesson2;

import java.util.Scanner;

public class NumberInterval {
    Scanner scanner = new Scanner(System.in);
    public void interval(){
        System.out.println("Enter ur number(0-100): ");
        int number = scanner.nextInt();

        if(number>=0 && number<=100)
        {
            if(number<15)
            {
                System.out.println("Число входит в промежуток [0;14]");
            }
            else if(number<36)
            {
                System.out.println("Число входит в промежуток [15;35]");
            }
            else if(number<51)
            {
                System.out.println("Число входит в промежуток [36;50]");
            }
            else
            {
                System.out.println("Число входит в промежуток [51;100]");
            }
        }
        else
        {
            System.out.println("Число не входит в промежуток");
        }
    }
}
