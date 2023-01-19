package lesson_03;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner input = new Scanner(System.in);
//        input.useLocale(Locale.US); // Вводим для того, чтобы вводить double через точку, а не через зпаятую

//      Блочный комментарий
/*      System.out.println("Please enter your name: ");
        name = input.nextLine();
        System.out.println("Please enter your age: ");
        age = input.nextInt();
*/
        System.out.println("Please enter your grade: ");
        double grade = input.nextDouble();

// строчный комментарий
//        System.out.println("name = " + name);
//        System.out.println("age = " + age);
        System.out.println("grade = " + grade);
        System.out.println("Finished");

    }
}
