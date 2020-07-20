package BankApplication;

import java.util.Scanner;

public class Application {


    void getUserInfo(){
        Scanner sc = new Scanner(System.in);
        UserBio userbio = new UserBio();
        System.out.println("Please Enter your Name :");
        userbio.setName(sc.nextLine());
        System.out.println("Please Enter your email :");
        userbio.setEmail(sc.nextLine());
        System.out.println("Please Enter you address :");
        userbio.setAddress(sc.nextLine());
        System.out.println("Please Enter the Password :");
        userbio.setPassword(sc.nextLine());
        userbio.generateAccNumber();
        userbio.generateUserName();
        System.out.println("You Have Entered the Below Values, Please verify Before submitting the application");
        System.out.println("\nName :" + userbio.getName() + "\nUserName : " +  "\nEmail : " + userbio.getEmail() + "\nAddress : " + userbio.getAddress() + "\nPassword : " + userbio.getPassword() + "\nAcc.No : " + userbio.getAccountNumber());
        System.out.println("to Process the Application enter Y to re-enter the information enter N");
        String proceed = sc.nextLine();
        if(proceed == "N"){
            getUserInfo();
        }
    }

    public static void main(String[] args) {

    Application app = new Application();
    app.getUserInfo();

    }


}
