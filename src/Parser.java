import java.util.ArrayList;

public class Parser {
    public ArrayList<String> terms = new ArrayList<>();
    private final StringBuilder word = new StringBuilder();

    public Parser() {
    }

    public void clear() {
        terms.clear();
    }

    public void parse(String expression) {
        for(int i = 0; i < expression.length(); i ++){
            char c = expression.charAt(i);

            if (isSymbol(c)){
                word.append(c);
                terms.add(word.toString());
                word.setLength(0);
            //Check if there is more than one digit in the operand
            }else if (Character.isDigit(c)) {
                word.append(c);
                if (i + 1 >= expression.length() || !Character.isDigit(expression.charAt(i + 1))){
                    terms.add(word.toString());
                    word.setLength(0);
                }
            //Check for alphabetical variables and/or operations like sin
            }else if (Character.isAlphabetic(c)) {
                word.append(c);
                if (i+1 >= expression.length() || !Character.isAlphabetic(expression.charAt(i + 1))){
                    terms.add(word.toString());
                    word.setLength(0);
                }
            }
        }
    }

    private boolean isSymbol(char c){
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '%' ||
                c == '=' || c == '>' || c == '<' || c == '^' || c == '!' || c == '(' || c == ')');
    }

    private boolean isTrig(String id){
        return(id.equalsIgnoreCase("Sin") || id.equalsIgnoreCase("Cos") || id.equalsIgnoreCase("Tan")
        );
    }
}