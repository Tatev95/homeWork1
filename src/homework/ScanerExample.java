package homework;

import java.util.Scanner;

public class ScanerExample {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Student student = new Student(name);
        System.out.println(student.name + "name is");

    }
}
