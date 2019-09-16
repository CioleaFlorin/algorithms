package org.fasttrackit;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {

        System.out.println("What is your current age?");
        Scanner scanner= new Scanner(System.in);
        int currentAge = scanner.nextInt();

        System.out.println("At what age would you like to retire?");
        Scanner scanner1= new Scanner(System.in);
        int retirementAge = scanner1.nextInt();

        System.out.println("You have "+ (retirementAge-currentAge)+ " years left until you can retire.");

        LocalDate currentDate = LocalDate.now();

        System.out.println("It's " + currentDate.getYear() +" so you can retire in " + (currentDate.getYear()+(retirementAge-currentAge) ) );



    }


}
