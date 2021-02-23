package com.myepam.app;

public class Calculator{
    private double n1,n2;
    private char exp;
    private double result;
    public Calculator(double n1, double n2,char exp){
        this.n1 = n1;
        this.n2 = n2;
        this.exp = exp;
    }
    public void eval(){
        if(exp == '+')
            result =  n1+n2;
        else if(exp =='-')
            result = n1-n2;
        else if(exp == '*')
            result = n1*n2;
        else if(exp == '/')
            result = n1/n2;        
    }
    public void disp(){
        System.out.println("The output result is : "+result);
    }
}