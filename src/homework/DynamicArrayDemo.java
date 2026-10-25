package homework;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();


        //Թեստ 1 — Ավելացնել էլեմենտներ
        for (int i = 1; i <= 5; i++) {
            da.add(i);
        }
        da.print();

        //Թեստ 2 — Զանգվածի մեծացում
        for (int i = 1; i <= 15; i++) {
            da.add(i);
        }
        da.print();

        // Թեստ 3 — Կրկնակի մեծացում
        for (int i = 1; i <= 25; i++) {
            da.add(i);
        }
        da.print();

        //Թեստ 4 — Ինդեքսով ստանալ էլեմենտ


        System.out.println();
        System.out.println(da.getByIndex(0));
        System.out.println(da.getByIndex(44));
        System.out.println(da.getByIndex(-1));
    }
}
