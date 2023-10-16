package AH3;
import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){

    Scanner console = new Scanner(System.in);
    int num;
    System.out.println("Enter the max number..");
    num = console.nextInt();

    for (int i=1; i<num; i++){
        if (i%3==0)
            System.out.print("Fizz");
        if (i%5==0)
            System.out.println("Buzz");
        if (i%3==0 && i%5==0)
            System.out.println("FizzBuzz");
        System.out.print(i);
        }
    }
}
