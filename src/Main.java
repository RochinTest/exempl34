//Дана целая квадратная матрица п-го порядка. Определить, является ли
// она магическим квадратом, т.е. такой, в которой суммы элементов
// во всех строках и столбцах одинаковы.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 0;
        System.out.println("Введите размер порядок матрицы ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            N = sc.nextInt();
        }
        int[] str = new int[N];
        int[] stb = new int[N];
        int[][] mass = new int[N][N];
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < N; j++) {
                mass[i][j] = (int) (Math.random() * 2);
                System.out.print(" " + mass[i][j]);
                str[i] = str[i] + mass[i][j];
                stb[j] = stb[j] + mass[i][j];
            }
        }
        int n = 0;
        for (int i = 0; i < N - 1; i++) {

            if (str[i] == str[i + 1] && stb[i] == stb[i + 1] && str[i] == stb[i]) {
                n = 1;
            }

        }
        System.out.println();
        if (n == 1) {
            System.out.print("Магический квадрат найден");
        }
    }
}










