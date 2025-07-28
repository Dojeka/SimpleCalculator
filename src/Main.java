import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scWord = new Scanner(System.in);
        Parser parser = new Parser();
        Lexer lexer = new Lexer();

        String input;
        int choice;

        do {
            System.out.println("""
                    Welcome to the Simple Calculator\
                    
                    1. Solve a problem\
                    
                    0. End process""");

            choice = scInt.nextInt();

            switch (choice){
                case 1: System.out.println("Enter a problem to solve: ");
                    input = scWord.nextLine();
                    parser.parse(input);
                    lexer.lex(parser.terms);
                    parser.clear();
                    break;

                case 0: System.out.println("Understandable, have a great day.");
                    break;

                default: System.out.println("Incorrect Input. Try again!");
                    break;
            }

        }while(choice != 0);
    }
}
