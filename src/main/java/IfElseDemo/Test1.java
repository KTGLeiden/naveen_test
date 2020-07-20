package IfElseDemo;

public class Test1 {


    public void printPyramid(int size) {
        for(int i = 1; i <= size; i++) {
            for(int j = 0; j<i; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void main (String [] args) {
        Test1 myObj = new Test1();
        myObj.printPyramid(5);
    }
}