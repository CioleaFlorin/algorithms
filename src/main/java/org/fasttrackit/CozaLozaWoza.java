package org.fasttrackit;

public class CozaLozaWoza {

    public static void main(String[] args) {
        int c=0;
        for(int i=1; i<=10;i++)
        {
            for(int j=i+c;j<=i*11 ; j++){

                if(j%5==0 && j%3==0)
                    System.out.print("CozaLoza ");
                else if(j%3==0)
                    System.out.print("Coza ");
                else if(j%5==0)
                    System.out.print("Loza ");
                else if(j%7==0)
                    System.out.print("Woza ");
                else
                    System.out.print(j+" ");
            }
            System.out.println();
            c=c+10;


        }


    }
}
