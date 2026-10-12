package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        //int[] numbers = {10, 20, 30, 40, 50, 60};
        //int[] numbers = {10, 20, 30};

        int numLength = numbers.length;


        //Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները
        for (int i = 0; i < numLength; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //Խնդիր 2 — Տպել առաջին էլեմենտը
        System.out.println("First element:" + numbers[0]);

        //Խնդիր 3 — Տպել վերջին էլեմենտը
        System.out.println("Last element:" + numbers[numLength - 1]);

        //Խնդիր 4 — Տպել զանգվածի երկարությունը
        System.out.println("Array length:" + numLength);

        //Խնդիր 5 — Գտնել ամենափոքր թիվը
        int minValue = numbers[0];
        for (int i = 1; i < numLength; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Minimum number:" + minValue);

        //Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
        //Եթե զանգվածի երկարությունը փոքր է կամ հավասար 2-ի, տպել՝
        //Եթե զանգվածի երկարությունը կենտ է, տպել մեջտեղի մեկ էլեմենտը։

        if (numLength <= 2) {
            System.out.println("Can't print middle values\n");
        } else {
            int midIndex = numbers.length / 2;
            if (numLength % 2 != 0) {
                System.out.println("Middle element:" + numbers[midIndex]);
            } else {
                int firstMidIndex = midIndex - 1;
                System.out.println("Middle elements:" + numbers[firstMidIndex] + ", " + numbers[midIndex]);
            }

        }

        //Խնդիր 7 — Հաշվել զույգ թվերի քան ակը
        int evenNums = 0;
        for (int i = 0; i < numLength; i++) {
            if (numbers[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println("Even numbers count:" + evenNums);

        //Խնդիր 8 — Հաշվել կենտ թվերի քանակը
        int oddNums = 0;
        for (int i = 0; i < numLength; i++) {
            if (numbers[i] % 2 != 0) {
                oddNums++;
            }
        }
        System.out.println("Odd  numbers count:" + oddNums);

        //Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը
        int sum = 0;
        for (int i = 0; i < numLength; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        //Խնդիր 10 — Հաշվել միջին թվաբանականը
        if (numLength != 0) {
            double doubleLength = (double) numLength;
            double average = sum / doubleLength;
            System.out.println("Average:" + average);
        }

        //4. Լրացուցիչ առաջադրանքներ

        //Bonus 1 — Գտնել ամենամեծ թիվը
        int maxValue = numbers[0];
        for (int i = 0; i < numLength; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("maximum value ie:" + maxValue);

        //Bonus 2 — Հաշվել դրական և բացասական թվերը
        //Հաշվել և տպել՝

        //Քանի դրական թիվ կա զանգվածում։
        //Քանի բացասական թիվ կա զանգվածում։
        //Քանի զրո կա զանգվածում։

        int posNumsCount = 0;
        int negNumsCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < numLength; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
            } else if (numbers[i] < 0) {
                negNumsCount++;
            } else {
                posNumsCount++;
            }
        }
        System.out.println("negative numbers  count is:" + negNumsCount);
        System.out.println("positive numbers  count is:" + posNumsCount);
        System.out.println("there are:" + zeroCount + " zeros in numbers array");


        //Bonus 3 — Տպել զանգվածը հակառակ հերթականությամբ

        for (int i = numLength - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
