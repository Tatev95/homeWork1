package homework;

public class HomeWork1 {
    public static void main(String[] args) {
        //ex. 1
        int x = 10, y = 20;
        if (x > y) {
            System.out.println(x);
        }
        if (x < y) {
            System.out.println(y);
        }
        if (x == y) {
            System.out.println("the numbers are equal");
        }
        //ex. 2
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //ex.3

        int a = 5;
        int b = 7;
        int result = 0;
        System.out.println(result = a + b);


        // ex. 4
        int n = 3;
        for (int i = 1; i <= 10; i++) {
            int mult = i * n;
            System.out.println(i + "*" + n + "=" + mult);

        }
    }
}
