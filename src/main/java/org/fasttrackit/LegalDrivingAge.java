package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        int age=getAgeFromUser();
        if(age>18)
            System.out.println("You are old enough to legally drive");
        else
            System.out.println("You are not old enough to legally drive");
    }

    private static int getAgeFromUser() {
        Scanner scanner=new Scanner(System.in);
        try{
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("You entered an invalid number. Try again");
            return getAgeFromUser();
        }
    }
}
