package main;

import java.util.Scanner;

public class Calc {
    private int result;
    private String selectedOperation;

    public void start(){
        System.out.println("Calc is up and running!");

        do {

        showMenu();

        selectedOperation = readInput("Choice operation: ");

        switch (selectedOperation){
            case "+":
                add(readNumer("Please, input digit"));
                break;
            case "-":
                deduct(readNumer("Please, input digit"));
                break;
            case "*":
                multiply(readNumer("Please, input digit"));
                break;
            case "/":
                devide(readNumer("Please, input digit"));
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
        } while (!selectedOperation.equalsIgnoreCase("q"));
     }

    private void showMenu(){
        System.out.println("+ Add");
        System.out.println("- Deduct");
        System.out.println("* Multiply");
        System.out.println("/ Divide");
        System.out.println("Q Quit");
        System.out.println("Your currrent value is: " + result);
    }

     private void quit(){

     }

    private void add(int userNumber){
         result += userNumber;
     }

    private void deduct(int userNumber){
        result -= userNumber;
    }

    private void multiply(int userNumber){
        result *= userNumber;
    }


    private void devide(int userNumber){
        if (userNumber != 0) {
            result /= userNumber;
        }
        else {
            System.out.println("You cannot divide by zero!");
        }
    }

    private int readNumer (String message) {
     /*
     String digit = readInput(message);
     for (int i = 0; i < digit.length(); i++){
            if (digit.charAt(i) < 48 || digit.charAt(i) > 57){
                return 0;
            }
        }
        */
        int result = 0;
        boolean isValied = false;

        do {
            try {
                result = Integer.valueOf(readInput(message));
                isValied = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }  while (!isValied);
        return result;
    }

    private String readInput(String message){
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    public int getResult(){
        return result;
    }

    public void setResult(int result){
        this.result = result;
    }
}