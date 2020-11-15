package mainTask2;

import java.util.*;

import static mainTask2.Main.Peremen.a;

public class Sort {

    private static int n;

    public static void Sorting() {

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);

            System.out.println(Arrays.toString(a));

            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int r = 0; r < a.length - 1; r++) {
                    if (a[r] < a[r + 1]) {
                        isSorted = false;

                        buf = a[r];
                        a[r] = a[r + 1];
                        a[r + 1] = buf;


                    }
                }
            }
        }
    }
}