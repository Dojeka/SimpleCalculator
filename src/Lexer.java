import java.util.ArrayList;

public class Lexer {
    private ArrayList<Token> tokens = new ArrayList<>();
    private enum Token {
        operand, plus, minus, multiply, divide, exponent,openingParenthesis, closingParenthesis, sin, cos, tan, factorial
    }

    public Lexer(){
    }

    public void lex(ArrayList<String> expression){
        //Iterate the expression and Tokenize
        for(String ch : expression){
            switch (ch){
                case "+": tokens.add(Token.plus);
                    System.out.println("Token: plus");
                    break;
                case "-": tokens.add(Token.minus);
                    System.out.println("Token: minus");
                    break;
                case "*": tokens.add(Token.multiply);
                    System.out.println("Token: multiply");
                    break;
                case "/": tokens.add(Token.divide);
                    System.out.println("Token: divide");
                    break;
                case "^": tokens.add(Token.exponent);
                    System.out.println("Token: exponent");
                    break;
                case "(": tokens.add(Token.openingParenthesis);
                    System.out.println("Token: opening Parathesis");
                    break;
                case ")": tokens.add(Token.closingParenthesis);
                    System.out.println("Token: closing Parenthesis");
                    break;
                case "!": tokens.add(Token.factorial);
                    break;
                case "Sin":
                case "SIN":
                case "sin": tokens.add(Token.sin);
                    System.out.println("Token: sin");
                    break;
                case "Tan":
                case "TAN":
                case "tan": tokens.add(Token.tan);
                    System.out.println("Token: tan");
                    break;
                case "Cos":
                case "COS":
                case "cos": tokens.add(Token.cos);
                    System.out.println("Token: cos");
                    break;
                default: tokens.add(Token.operand);
                    System.out.println("Token: operand");
                    break;
            }
        }
    }

}
