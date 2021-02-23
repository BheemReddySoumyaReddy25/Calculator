package com.myepam.app;

import java.util.*;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        double n1 = sc.nextDouble();
        System.out.println("Enter second number :");
        double n2 = sc.nextDouble();
        System.out.println("Enter any one this (+,-,*,/ )");
        char exp = sc.next().charAt(0);
        Calculator cal = new Calculator(n1,n2,exp);
        cal.eval();
        cal.disp();
        sc.close();
    }
}
