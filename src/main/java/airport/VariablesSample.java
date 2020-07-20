package airport;

import jdk.internal.dynalink.beans.StaticClass;

public class VariablesSample {
    int number = 8;
    int number2 = 9;
    int result = number * number2;

   int multiply(int num1, int num2){
        result = num1*num2;
        System.out.println("Multiplication of two numbers : " + result);
        return result;
    }

    String name = "Naveen";

    void printName(){
        System.out.println("Name is : " + name);
    }

    int age = 30;

    void printBio(){
        System.out.println("Hi, I am " + name + " and I am " + age + " Years Old");
    }

    boolean test = false;

    void printTest(){
        System.out.println("Value of test is " + test);
    }

    void setTest(boolean val){
        this.test = val;
    }

    public static void main (String [] args) {
        System.out.println("Test");

            VariablesSample myObj = new VariablesSample();
            int productOfTwo = myObj.multiply(35,45);
    }

}
