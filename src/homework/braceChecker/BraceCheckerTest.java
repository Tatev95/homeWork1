package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        //test cases
        String text = "{Hello from [java]}";
//        String text = "{Hello from (jav)}";
//        String text = "{[()]}";
//        String text = "Hello java";
//        String text = "Hello [java)";
//        String text = "Hello (java]";
//        String text = "{[(])}";
//        String text = "hello from java]";
//        String text = "{hello java";
//        String text = "((()))";
//        String text = "(()";

        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
