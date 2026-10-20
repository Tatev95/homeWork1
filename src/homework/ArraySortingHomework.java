package homework;

public class ArraySortingHomework {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 8, -7, -3, 21, 7, 0, 15, 2, 9};
        //📝 Խնդիր 1 — Սորտավորել զանգվածը փոքրից մեծ (Ascending Order)

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tempAsc = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempAsc;
                }
            }

        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        //📝 Խնդիր 2 — Սորտավորել զանգվածը մեծից փոքր (Descending Order)

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int tempDesc = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = tempDesc;
                }
            }
        }

        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
