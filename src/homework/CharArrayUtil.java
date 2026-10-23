package homework;

public class CharArrayUtil {

    //methods part
    public static int calcSimvols(char[] mainArray, char[] compareArray) {
        int simvolCount = 0;
        for (int i = 0; i < mainArray.length; i++) {
            for (int j = 0; j < compareArray.length; j++) {
                if (mainArray[i] == compareArray[j]) simvolCount++;
            }
        }
        return simvolCount;
    }

    public static char[] reverseArray(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char firstEl = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = firstEl;
        }
        return array;

    }

    public static char[] toUpperCase(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'a' && array[i] <= 'z') {
                array[i] -= 32;
            }
        }
        ;
        return array;

    }

    public static char[] toLowerCase(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] += 32;
            }
        }
        ;
        return array;

    }

    public static char[] replaceChar(char[] array, char replacing, char replacedChar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == replacing) {
                array[i] = replacedChar;
            }
        }
        ;
        return array;

    }

    public static boolean isPalindrome(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;

    }

    public static boolean isEqual(char[] first, char[] second) {
        if (first.length != second.length) {
            System.out.println("Arrays are NOT equal");
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                System.out.println("arrays are NOTt equal");
                return false;
            }

        }
        return true;
    }


    //end of methods part
    public static void main(String[] args) {

        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        int length = chars.length;
        //Խնդիր 1 — Տպել բոլոր սիմվոլները

        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        //Խնդիր 2 — Հաշվել սիմվոլների քանակը
        int charCount = 0;
        for (int i = 0; i <= length; i++) {
            charCount = +i;
        }
        System.out.println("Characters count:" + charCount);

        //Տպել նաև զանգվածի առաջին և վերջին սիմվոլները։
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[length - 1]);

        //Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը

        char c = 'a';
        int charACount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == c) charACount++;
        }
        System.out.println("Character " + " " + c + " " + "count: " + charACount);


        // Խնդիր 4 — Հաշվել ձայնավորների քանակը
//1-ին տարբերակ
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int vowelsCount = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) vowelsCount++;
            }
        }
        System.out.println("Vowels count:" + vowelsCount);
//2-րդ տարբերակ

        System.out.println(calcSimvols(chars, vowels) + " " + "Vowels count in a method");

        //Խնդիր 5 — Հաշվել բաղաձայնների քանակը
        char[] consonant = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z',
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        //1-ին տարբերակ
        int consonantCount = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < consonant.length; j++) {
                if (chars[i] == consonant[j]) consonantCount++;
            }
        }
        System.out.println("consonant count:" + consonantCount);

        //2-րդ տարբերակ
        System.out.println(calcSimvols(chars, consonant) + " " + "consonant count in a method");


        //Խնդիր 6 — Հաշվել բացատների քանակը

        char[] spaces = {' '};
        //1-ին տարբերակ
        int spacesCount = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < spaces.length; j++) {
                if (chars[i] == spaces[j]) spacesCount++;
            }
        }

        System.out.println("spaces count:" + spacesCount);

        //2-րդ տարբերակ
        System.out.println(calcSimvols(chars, spaces) + " " + "spaces count in a method");

        //Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)
        char[] copyArray = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            copyArray[i] = chars[i];

        }
        reverseArray(copyArray);
        for (int i = 0; i < copyArray.length; i++) {
            System.out.print(copyArray[i]);
        }

        System.out.println();
        //Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը

        //upperCase

        char[] resultUpper = toUpperCase(chars);

        for (int i = 0; i < resultUpper.length; i++) {
            System.out.print(resultUpper[i]);
        }

        //lowerCase
        char[] resultLower = toLowerCase(chars);

        for (int i = 0; i < resultLower.length; i++) {
            System.out.print(resultLower[i]);
        }
        System.out.println();
        //Խնդիր 9 — Փոխարինել տրված սիմվոլը


        char[] resultReplace = replaceChar(chars, 'a', '*');

        for (int i = 0; i < resultReplace.length; i++) {
            System.out.print(resultReplace[i]);
        }

        System.out.println();
        //Խնդիր 10 — Ստուգել Palindrome-ը
        char[] charsPalindrome = {'l', 'e', 'v', 'e', 'l',};

        System.out.println("Is palindrome :" + isPalindrome((charsPalindrome)));

        System.out.println();

        // ⭐ 4. Լրացուցիչ առաջադրանքներ (Bonus)

        // Bonus 1 — Գտնել սիմվոլի առաջին հանդիպման ինդեքսը
        char[] charsIndex = {'s', 'b', 'c', 'a', 'd', 'a'};
        char target = 'a';
        boolean isFound = false;
        for (int i = 0; i < charsIndex.length; i++) {
            if (charsIndex[i] == target) {
                System.out.print("first index is:" + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("first index is:" + -1);
        }

        System.out.println();

        //Bonus 2 — Համեմատել երկու char զանգված
        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};


        System.out.println("arrays are equal :" + isEqual(first, second));

        //Bonus 3 — Հեռացնել կրկնվող սիմվոլները

        char[] repeatChars = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        for (int i = 0; i < repeatChars.length; i++) {
            boolean isRepeat = false;

            for (int j = 0; j < i; j++) {
                if (repeatChars[i] == repeatChars[j]) {
                    isRepeat = true;
                }
                ;
            }
            if (!isRepeat) {
                System.out.print(repeatChars[i]);
            }
        }
    }
}




