import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! It's a calc.");
        while (true) {
            System.out.println("Input a number 1");
            int num1 = scanner.nextInt();
            System.out.println("Input a number 2");
            int num2 = scanner.nextInt();
            System.out.println("Enter + if you want to get the sum. \n" +
                    "Enter - if you want to get the difference.\n" +
                    "Enter * if you want to get " + "multiplication.\n" +
                    "Enter / if you want to get the division");
            char a = scanner.next().charAt(0);
            switch (a) {
                case '+':
                    sum(num1,num2);
                    break;
                case '-':
                    substract(num1,num2);
                    break;
                case '*':
                    multipl(num1,num2);
                    break;
                case '/':
                    division(num1,num2);
                    break;
                default:
                    System.out.println("Error");
            }
            System.out.println("\nDo you want to run the calculator again? Enter 1 to continue, 2 to finish.");
            int b = scanner.nextInt();
            if (b == 2) break;
        }
        System.out.println("\nIt's all. Thank you!");
        scanner.close();
    }
    static void sum (int a, int b) {
        System.out.printf("+: %d", a+b);
    }
    static void substract (int a, int b){
        System.out.printf("-: %d", a-b);
    }
    static void multipl (int a, int b){
        System.out.printf("*: %d", a*b);
    }
    static void division (int a, int b){
        System.out.printf("/: %.2f", (float) a/b);
    }
}