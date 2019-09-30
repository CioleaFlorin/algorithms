package org.fasttrackit;

import javax.swing.*;

public class LogicalOp {
    public int var;

    public void firstEx(int x){
        if(x<100)
            for(int i=x; i<=100; i++)
                System.out.print(i+ " ");
        else
            System.out.println("You entered an incorrect number");
        System.out.println();
    }

    public void secondEx(int x){
        if(x>-100)
            for(int i=x;i>=-100;i--)
                System.out.print(i+ " ");
            else
            System.out.println("You entered an incorrect number");
        System.out.println();
    }


    public void thirdEx(int x, int y){
        for(int i=x; i<=y; i++)
            System.out.print(i+ " ");

        System.out.println();
    }

    public void fourthEx(int x, int y){
        if(x>y)
            thirdEx(y,x);
        else
            thirdEx(x,y);
    }

    public void fifthEx(){
        for(int i=2; i<=100; i=i+2)
            System.out.print(i+" ");
        System.out.println();
    }

    public void sixthEx() {
        for (int i = 1; i < 100; i = i + 2)
            System.out.print(i+ " ");
        System.out.println();
    }

    public int seventhEx(int x){
        int sum=0;
        for(int i=x; i<=100;i++)
            sum=sum+i;
        return sum;
    }

    public int eighthEx(int x){
        int count=0;
        int sum=0;
        for(int i=x;i<=100;i++){
            count++;
            sum=sum+i;
        }
        return (sum/count);
    }

    public void ninethEx(){
        for(int i=7;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
            if(i==5)
                System.out.println();}

    }
}

