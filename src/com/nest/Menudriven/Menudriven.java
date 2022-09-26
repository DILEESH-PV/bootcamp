package com.nest.Menudriven;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Menudriven {
    public static void main(String[] args) {
        int choice;
        System.out.println("hello");
        while (true)
        {
            System.out.println("Select an option");
            System.out.println("1.Add student");
            System.out.println("2.Search student");
            System.out.println("3.Delete student");
            System.out.println("4.View all student");
            System.out.println("4.Exit");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Add student selected");
                    break;
                case 2:
                    System.out.println("search student selected");
                    break;
                case 3:
                    System.out.println("delete student selected");
                    break;
                case 4:
                    System.out.println("View all student selected");
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
