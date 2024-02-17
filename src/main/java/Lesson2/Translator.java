package Lesson2;

import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    Scanner scanner = new Scanner(System.in);
    public void translate(){
        HashMap<String, String> words = new HashMap<>();

        words.put("тепло","Warm");
        words.put("холодно","Cold");
        words.put("солнечно","Sunny");
        words.put("снежно","Snowy");
        words.put("ветрено","Windy");
        words.put("дождливо","Rainy");
        words.put("туманно","Foggy");
        words.put("облачно","Cloudy");
        words.put("ясно","Clear");
        words.put("жарко","Hot");

        System.out.println("Введите русское слово: ");
        String inputByUser = scanner.next();
        String engTranslator = words.get(inputByUser.toLowerCase());

        if(engTranslator!=null)
        {
            System.out.println("Перевод вашего слова - " + engTranslator);
        }
        else
        {
            System.out.println("Такого слова нет");
        }
    }
}
