package mainTask4;
import java.util.Scanner;

import static mainTask4.Main.Peremen.a;
import static mainTask4.Main.Peremen.b;

public  class calcPlus {

    static Scanner scan = new Scanner(System.in);

    public static int Plus() {
        System.out.println("Введите пожалуйста целые которые нужно сложить.");
        System.out.println("Введите первое число: ");
        if (scan.hasNextInt()) {
            a = scan.nextInt();
            System.out.println("Вы ввели число " + a);
        } else {
            System.out.println("Вы ввели не целое число! Повторите....");
            scan.next();
            a = Plus();
        }
        return a;
    }

        public static int Plus2(){
        System.out.println("Введите второе число: ");
        if(scan.hasNextInt()){
            b = scan.nextInt();
            System.out.println("Вы ввели число " + b);
        }else{
            System.out.println("Вы ввели не целое число! Повторите....");
            scan.next();
            b = Plus();
        }
        return b;
  }
}