package exeption;

//food order site

import java.util.LinkedList;
import java.util.Scanner;

public class Program {

    private LinkedList<Food> orderfoods=new LinkedList<>();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Enter number of menu");
        System.out.println("1. Pizza\n2. Snack\n3. Drinks\n4.Exit");
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();
        while (menu != 4) {
            switch (menu){
                case 1:{
                    pizzaMenu();
                }break;
                case 2:{
                    snackMenu();
                }break;
                case 3:{
                    drinksMenu();
                } break;
                default:
                    System.out.println("You enter wrong data");
            }


            System.out.println("Enter number of menu");
            System.out.println("1. Pizza\n2. Snack\n3. Drinks\n4.Exit");
            menu = input.nextInt();
        }
    }

    public static void pizzaMenu(){

    }

    public static void snackMenu(){

    }

    public static void drinksMenu(){

    }
}
