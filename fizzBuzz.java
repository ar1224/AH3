package AH3;
import java.util.Scanner;

public class fizzBuzz {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num;
        System.out.println("Enter a max number..");
        num = console.nextInt();

        for (int i=1; i<=num; i++){
            String string = "";
            if(i%3==0)string+="Fizz";
            if(i%5==0)string+="Buzz";
            if(string=="")string+=i;
            System.out.print(string + " ");
            }
            
    }
}

