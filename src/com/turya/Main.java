package com.turya;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double BMI, weight, height;

        System.out.println("Enter weight in Kg: ");
        weight = input.nextDouble();

        System.out.println("Enter height  in meters: ");
        height  = input.nextDouble();

        BMI = weight / Math.pow(height, 2);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Your Body Mass Index is" + df.format(BMI));

        if(BMI<18.5){
            System.out.println("Your are Underweight");
        }
        if(BMI>18.5 && BMI<24.9){
            System.out.println("Your are Normal");
        }
        if(BMI>25 && BMI<29.9){
            System.out.println("Your are Overweight");
        }
        if(BMI>=30){
            System.out.println("Your are Obese");
        }

    }

}