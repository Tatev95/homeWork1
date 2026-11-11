package homework.braceChecker;

public class Stack {
    private int[] array = new int[10];
    private int size = 0;

    public void add(char value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;

    }

    public char pop() {
        if (size == 0) {
            System.out.println("Array is empty");
            return 0;
        } else {
            return  (char) array[--size];
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print((char) array[i] + " ");
        }
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getByIndex(int index) {

        if (index >= 0 && index <= size - 1) {
            return array[index];
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

}

