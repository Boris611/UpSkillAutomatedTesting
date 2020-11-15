package mainTask3;
import java.util.Random;
import java.util.Scanner;

public class Rand {

    static Scanner scan = new Scanner(System.in);

    public static int random(){

        System.out.println("Введите количество случайных чисел: ");
        int a;
        if(scan.hasNextInt()) {
            a = scan.nextInt();
            for (int i = 0; i < a; i++) {
                System.out.println(Math.random() * 9999);
            }
        }else {
            System.out.println("Вы ввели не целое число:");
            scan.next();
            a = random();
        }

        return a;
    }



}
