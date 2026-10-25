package homework;

import java.util.Scanner;

public class StrigExample {
    public static void main(String[] args) {
        String name = "poxos";
        String name1 = "poxos";
        String nameSurname = "poxos poxosyan";
        Scanner scaner = new Scanner(System.in);
        String nameSurName = scaner.nextLine();

        String[] splitName = nameSurName.split(" ");  //kktre prabelov
        System.out.println(splitName[0]);
        System.out.println(splitName[1]);


        //String karox enq sarqel NAEV aranc new

//        String name2 = new String("poxos");
//        System.out.println(name.equals(name1));  //chisht e Stringy stugel equalsov
//
        char c = nameSurname.charAt(6);//ktpe 6rd SIMVOLy
//        System.out.println(c);
//        for (int i = 0; i < name.length(); i++) {
//            System.out.print(name.charAt(i));
        //}  //for franq stringi vra, tpenq
        String subString = nameSurname.substring(6);
        //ktpe 6rd indexic sksac, karox enq naev asel 6-8tpir, 2 param
        System.out.println(subString);


    }
}
