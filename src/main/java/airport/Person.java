package airport;

public class Person {

    String name ;
    int age;

    void printIntro(String name, int age){

        System.out.println("Hi, my name is "+ name +" and I am " + age +" years old");
    }

    public static void main (String [] args) {
        System.out.println("Test");

        Person myObj = new Person();
        myObj.printIntro("Nav", 30);
    }

}
