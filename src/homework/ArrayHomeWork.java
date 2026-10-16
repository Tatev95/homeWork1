package homework;

public class ArrayHomeWork {
    public static void main(String[] args) {
        //Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը

        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }
        System.out.println("Count of" + n + ":" + count);

        //Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
        int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        int lengthNums2 = numbers2.length;
        for (int i = 0; i < lengthNums2 / 2; i++) {
            int num = numbers2[i];
            numbers2[i] = numbers2[lengthNums2 - 1 - i];
            numbers2[lengthNums2 - 1 - i] = num;
        }
        ;

        for (int i = 0; i < lengthNums2; i++) {
            System.out.print(numbers2[i] + " ");
        }

        //for (int i= numbers2.length-1; i >0; i--){
        //  System.out.print(numbers2[i] + " ");
        //}

        System.out.println();


        //Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը
        int[] nums = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            boolean founded = false;

            for (int j = i + 1; j < nums.length; j++) {
                for (int k = 0; k < i; k++) {
                    if (nums[i] == nums[k]) founded = true;
                }
                if (nums[i] == nums[j] && !found && !founded) {
                    num++;
                    found = true;
                }
            }
        }
        System.out.println("Repeated numbers count:" + num);

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'ե', 'է', 'ը', 'ի', 'ո', 'օ'};
        int vowlesCount = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    vowlesCount++;
                }
            }
        }
        System.out.println("vowels" + ": " + vowlesCount);

        //⭐ Լրացուցիչ առաջադրանքներ (Bonus)

        //Bonus 1 — Գտնել երկրորդ ամենամեծ թիվը

        //int[] numbers4 = {4, 9, 2, 15, 7, 15, 3, 11, 6};
        int[] numbers4 = {13, 12, 11, 10, 15} ;
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < numbers4.length; i++) {
            if (numbers4[i] > max) {
                max = numbers4[i];
                for (int j = 0; j < numbers4.length; j++) {
                    if (numbers4[j] < max && numbers4[j] > secondMax) {
                        secondMax = numbers4[j];

                    }
                }
            }
        }
        System.out.println(secondMax + "secondMax");

        //Bonus 2 — Հեռացնել կրկնվող թվերը

        int[] uniqeNumbers = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};
        for (int i = 0; i < uniqeNumbers.length; i++) {
            boolean founded = false;
            for (int j = 0; j < i; j++) {
                if (uniqeNumbers[i] == uniqeNumbers[j]) founded = true;
            }
            if (!founded) {
                System.out.print(uniqeNumbers[i] + " ");
            }

        }
        System.out.println();
        //Bonus 3 — Գտնել ամենաշատ կրկնվող թիվը
        int[] numbersRepeat = {3, 6, 3, 8, 9, 6, 2, 3, 5};

        int frequentNum = 0;
        int mostFrequentNumber = 0;

        for (int i = 0; i < numbersRepeat.length; i++) {
            boolean founded = false;
            int countNum = 1;

            for (int k = 0; k < i; k++) {
                if (numbersRepeat[i] == numbersRepeat[k]) founded = true;
            }
            if (!founded) {
                for (int j = i + 1; j < numbersRepeat.length; j++) {
                    if (numbersRepeat[i] == numbersRepeat[j]) {
                        countNum++;
                    }
                }

            }
            if (countNum > frequentNum) {
                frequentNum = countNum;
                mostFrequentNumber = numbersRepeat[i];
            }
        }

        System.out.println("Repeated number is " + mostFrequentNumber);
        System.out.println("Repeatition count is: " + frequentNum);
    }
}
