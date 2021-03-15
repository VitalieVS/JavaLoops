import java.util.*;
import java.io.*;

import static java.lang.Math.pow;


class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int memory = a + (int) Math.pow(2, 0) * b;

            System.out.print(memory + " ");

            for (int j = 1; j < n; j++) {
                memory = (int) (memory + Math.pow(2, j) * b);

                System.out.print(
                        memory + " "
                );
            }
            System.out.println();
        }
        in.close();
    }
}