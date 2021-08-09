package exeption;

//food order site

import java.util.LinkedList;
import java.util.Scanner;

public class Program {

    private static Scanner input = new Scanner(System.in);
    private static LinkedList<Food> orderfoods=new LinkedList<>();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Enter number of menu");
        System.out.println("1. Pizza\n2. Snack\n3. Drinks\n4. Bag\n5.Exit");
        int menu = input.nextInt();
        while (menu != 5) {
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
                case 4: {
                    viewBag();
                } break;
                default:
                    System.out.println("You enter wrong data");
            }

            System.out.println("Enter number of menu");
            System.out.println("1. Pizza\n2. Snack\n3. Drinks\n4. Bag\n5.Exit");
            menu = input.nextInt();
        }
    }

    public static void pizzaMenu(){
        System.out.println("Choose pizza you wish to order");
        System.out.println("1. Villages\n" +
                "2. Hawaiian\n" +
                "3. Hunter\n" +
                "4. Pepperoni\n" +
                "5. Go back");
        int menu = input.nextInt();
        while (menu!=5){
            System.out.println("Pizzas size (use numbers starts from 1)");
            Pizza.getPizzasSize();
            System.out.println("And prices");
            int price;
            switch (menu){
                case 1: {
                    Pizza.getAllPrices(20);
                    price=20;
                }break;
                case 2:{
                    Pizza.getAllPrices(18);
                    price=18;
                }break;
                case 3:{
                    Pizza.getAllPrices(23);
                    price=23;
                }break;
                case 4:{
                    Pizza.getAllPrices(15);
                    price=15;
                }break;
            }
            System.out.println();
            int size=input.nextInt();

        }
    }

    public static void snackMenu(){

    }

    public static void drinksMenu(){

    }

    public static void viewBag(){

    }
}
