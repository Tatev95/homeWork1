package homework.dynamicarray;

class Parent {
    int num;
    Parent(int num) {
        this.num = num;
    }
}

class Child extends Parent {
    Child(int num) {
        super(num);
    }
}

public   class Test {
    public static void main(String[] args) {
        Child c = new Child(20);
        int result = c.num;
        System.out.println(result);
    }
}