package mainTask5;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();

        HashMap<Integer, String> numberAndMonth = new HashMap<>();

        numberAndMonth.put(1, "Январь");
        numberAndMonth.put(2, "Февраль");
        numberAndMonth.put(3, "Март");
        numberAndMonth.put(4, "Апрель");
        numberAndMonth.put(5, "Май");
        numberAndMonth.put(6, "Июнь");
        numberAndMonth.put(7, "Июль");
        numberAndMonth.put(8, "Август");
        numberAndMonth.put(9, "Сентябрь");
        numberAndMonth.put(10, "Октябрь");
        numberAndMonth.put(11, "Ноябрь");
        numberAndMonth.put(12, "Декабрь");
        System.out.println(numberAndMonth.get(a));

    }
}
