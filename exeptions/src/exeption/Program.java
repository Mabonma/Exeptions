package exeption;

//food order site

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        try {
            System.out.println("Registration new account");
            System.out.println("Enter your name");
            Scanner input = new Scanner(System.in);
            String name = input.next();
            System.out.println("Enter surname");
            String surname = input.next();
            System.out.println("Enter your phone number (+375#####-##-##");
            String phone = input.next();
            if (!phone.matches("^\\+375(\\s+)?\\(?(17|29|33|44)\\)?(\\s+)?[0-9]{3}-[0-9]{2}-[0-9]{2}$")){
                throw new PhoneNumberException("Illegal phone number");
            }
            boolean sex = checkSex();
        } catch (PhoneNumberException | SexException e) {
            System.out.println(e.getMessage());
        }
    }

    //true - male, false - female
    public static boolean checkSex() throws SexException {
        System.out.println("Enter your sex (m/f)");
        Scanner input = new Scanner(System.in);
        char sex = input.next().toLowerCase(Locale.ROOT).charAt(0);
        switch (sex){
            case 'm': return true;
            case 'f': return false;
            default: throw new SexException("Wrong sex");
        }
    }
}
