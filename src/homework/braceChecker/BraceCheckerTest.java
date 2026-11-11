package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        //test cases
        String text = "{Hello from [java]}";

        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
