package mainTask2;



import java.util.*;

import static mainTask2.Main.Peremen.n;
import static mainTask2.Main.Peremen.a;

public class Vvod {
    public void Sor() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество переменных ");
        System.out.print("затем ведите ЦЕЛЫЕ числа, по одному, которые будут осортерованы в обратном порядке: ");
        n = in.nextInt();
        if(in.hasNextInt()){
            a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Индекс введённого вами числа и его значение[" + i + "] = ");
                a[i] = in.nextInt();
            }
        }
        System.out.println(Arrays.toString(a));
    }
}