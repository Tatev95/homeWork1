
package homework;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,25);
        Box myBox2 = new Box(2,3,9);

        double vol;

        vol = myBox1.volume();
        System.out.println(vol);

        System.out.println();
        vol = myBox2.volume();
        System.out.println(vol);

    }
}
