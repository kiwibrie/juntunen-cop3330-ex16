package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int age = myApp.promptAge();

        String msg = myApp.checkAge(age);

        myApp.printOutput(msg);
    }

    public void printOutput(String msg){
        System.out.print(msg);
    }

    public String checkAge(int age){
        return age > 15
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";
    }

    public int promptAge(){
        System.out.print("What is your age? ");
        return Integer.parseInt(in.nextLine());
    }
}