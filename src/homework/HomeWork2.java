package homework;

public class HomeWork2 {
    public static void main(String[] args) {
        //ex 1.
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
//ex.2
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print('#');
            }
            System.out.println();
        }


        //ex.3
        for (int i = 0; i <= 5; i++) {
            for (int g = 5; g > i; g--) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('+');
            }
            System.out.println();
        }

        System.out.println();

        //ex.4
        for (int i = 0; i <= 5; i++) {

            for (int g = 0; g < i; g++) {
                System.out.print(' ');
            }
            for (int j = 5; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }

        //ex.5


        for (int i = 0; i <= 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int k = 0; k < i - 1; k++) {
                System.out.print(' ');
            }
            for (int j = 5; j > i; j--) {
                System.out.print(" *");
            }

            System.out.println();
        }

        //erkchap zangvacner
        int[][] twoD = new int[4][5];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println(" ");
        }


        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

}

