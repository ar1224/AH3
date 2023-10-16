package AH3;
import java.util.Scanner;

import AH2.solutions;

public class fizzBuzz {
    public static void main(String[] args){

    Scanner console = new Scanner(System.in);
    int num;
    System.out.println("Enter a max number..");
    num = console.nextInt();

    for (int i=0; i<num; i++){
        if (i%3==0)
            System.out.print("fizz");
        if (i%5==0)
            System.out.println("buzz");
        
        System.out.println(i);
        }

    }

}
