import Lesson0.HelloUser;
import Lesson2.Calculator;
import Lesson2.NumberInterval;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер задачи");
        int select = scanner.nextInt();

        switch (select)
        {
            case 1:
            {
                HelloUser helloUser = new HelloUser();//0
                helloUser.userName();
                break;
            }
            case 2:
            {
                Calculator calculator = new Calculator();//1
                calculator.calculate();
                break;
            }
            case 3:
            {
                NumberInterval numberInterval = new NumberInterval();//2
                numberInterval.interval();
                break;
            }
        }
    }
}
