package homework.braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();

        char closeBrace = ' ';
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '[' || text.charAt(i) == '{' || text.charAt(i) == '(') {
                stack.add(text.charAt(i));
            }
            if (text.charAt(i) == ']' || text.charAt(i) == '}' || text.charAt(i) == ')') {
                if (stack.getSize() > 0) {
                    char lastBrace = stack.pop();
                    switch (lastBrace) {
                        case '[':
                            closeBrace = ']';
                            if (text.charAt(i) != closeBrace) {
                                System.out.println("Սխալ է, պետք է փակվեր " + closeBrace);
                                return;
                            }
                            break;
                        case '(':
                            closeBrace = ')';
                            if (text.charAt(i) != closeBrace) {
                                System.out.println("Սխալ է, պետք է փակվեր " + closeBrace);
                                return;
                            }
                            break;
                        case '{':
                            closeBrace = '}';
                            if (text.charAt(i) != closeBrace) {
                                System.out.println("Սխալ է, պետք է փակվեր " + closeBrace);
                                return;
                            }
                            break;
                        default:
                            System.out.println("սխալ փակագիծ");
                            return;
                    }

                } else {
                    System.out.println("սխալ փակված փակագիծ");
                    System.out.println("սխալ է փակվել" + i + "-րդ ինդեքսում");
                    return;
                }
            }
        }
        if (stack.getSize() == 0) {
            System.out.println("ճիշտ է");
        }
        if (stack.getSize() > 0) {
            System.out.println("կա չփակվող փակագիծ");
        }
    }

}
