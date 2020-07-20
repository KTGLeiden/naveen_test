package IfElseDemo;
import java.util.Scanner;

public class NumberGuessing{

    int x = (int)(Math.random()*((10-1)+1))+1;
    boolean val;

    boolean guess(int y) {
        if (x != y) {
            if(Math.abs(x-y) == 1){
                System.out.println("Guess is too close");
            }
            else if(y < x){
                System.out.println("Guess is too low");
            }
            else if(y>x){
                System.out.println("Guess is too high");
            }
            val = false;
        }
        else{
            val = true;
        }
        return val;
    }

    public static void main (String [] args) {
        NumberGuessing myObj = new NumberGuessing();
            int count = 1;
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter first number- ");
            int y= sc.nextInt();
            while(myObj.guess(y) == false){
                count++;
                System.out.print("Please try again :");
                y= sc.nextInt();
            }
                System.out.println("Cheers You won in " + count + " times guess");
        }
}