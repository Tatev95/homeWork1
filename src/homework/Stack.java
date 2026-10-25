package homework;

public class Stack {
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;

    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
