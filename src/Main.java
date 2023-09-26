import java.util.Scanner;

public class Main {

 public static void main (String[]args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Hello! It's a calc.");
     System.out.println("Input a number 1");
     int num1 = scanner.nextInt();
     System.out.println("Input a number 2");
     int num2 = scanner.nextInt();
     int sum = num1+num2;
     int substract = num1-num2;
     System.out.println("Enter 1 if you want to get the sum. \nEnter 2 if you want to get the difference ");
     int a = scanner.nextInt();

    if (a == 1) {
        System.out.printf("Your result sum num1+num2: %d \n", sum);
    }else {
        System.out.printf("Your result substract num1-num2 : %d \n" , substract);
    }
    System.out.println("It's all. Thank you!");
     scanner.close();


 }


}