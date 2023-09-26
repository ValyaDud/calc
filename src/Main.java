import java.util.Scanner;

public class Main {

 public static void main (String[]args) {
     System.out.println("Hello!");
     Scanner scanner = new Scanner(System.in);
     System.out.println("Input a number 1");
     System.out.println("Input a number 2");

     int num1 = scanner.nextInt();
     int num2 = scanner.nextInt();

     int sum = (num1+num2);
     int subtract = (num1-num2);
     int multiplication= (num1*num2);
     int division = (num1/num2);

     System.out.printf("Your result sum:  %d \n",sum);
     System.out.printf("Your result subtract:  %d \n",subtract);
     System.out.printf("Your result multiplication:  %d \n",multiplication);
     System.out.printf("Your result division:  %d \n",division);
     scanner.close();

 }


}