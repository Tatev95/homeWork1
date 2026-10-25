package homework;

public class Test {
    static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println(count);
        int[] numbers = new int[5];
        System.out.println(numbers.length);

        String str = "Hello";
        str += " World!";
        System.out.println(str);

        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println(fruits[1]);
        String strr = "Java";
        System.out.println(strr.length());

//        final int x = 10;
//        x = 20;
        String greeting = "Hello";
        greeting += " World!";
        System.out.println(greeting);
    }
}
