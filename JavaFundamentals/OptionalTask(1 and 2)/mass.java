package optionalTask1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class mass {

    public static int mas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество которое будет в массиве: ");

        int UserNumbAmount;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (scan.hasNextInt()) {
            UserNumbAmount = scan.nextInt();
        } else {
            System.out.println("Введите целое число: ");
            scan.next();
            UserNumbAmount = mas();
        }
        if (UserNumbAmount > 0) {
            System.out.println("количество " + UserNumbAmount);
        } else {
            System.out.println("Число должно быть ЦЕЛОЕ и больше 0 : ");
            scan.next();
            UserNumbAmount = mas();
        }

        System.out.println("Введите числа по одному после каждого числа нажать ВВОД: ");

        for (int i = 0; i < UserNumbAmount; i++) {
            int num = 0;
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                arrayList.add(num);
                System.out.println("Число " + num);

            } else {
                System.out.println("Вы ошиблись! Начните сначала и перезагрузите программу.");
            }
        }
        System.out.println("Вот ваш массив: " + arrayList.toString());

        List<Integer> finalList = arrayList.stream().sorted(Comparator.comparing(el -> el.toString().length())).collect(Collectors.toList());

        System.out.println(finalList);
        System.out.println(finalList.get(0) + " " + finalList.get(0).toString().length() );
        System.out.println(finalList.get(finalList.size() - 1) + " " + finalList.get(finalList.size() - 1).toString().length());

        return UserNumbAmount;
    }
}
