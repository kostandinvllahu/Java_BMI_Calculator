/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_calculator;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {
        System.out.println("====BMI CALCULATOR====");
        int age;
        String gender = null;
        int option = 0;
        double height = 0;
        double inch = 0;
        double kg = 0;

        Scanner x = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = x.nextInt();

        System.out.println("Select your gender : ");
        System.out.println("1.Male");
        System.out.println("2.Female");
        option = x.nextInt();
        switch (option) {
            case 1:
                gender = "Male";
                break;

            case 2:
                gender = "Female";
                break;
        }
        // System.out.println(gender);

        System.out.println("Select the metric system: ");
        System.out.println("1.Metric");
        System.out.println("2.Inch");
        option = x.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter your height in Metric: ");
                height = x.nextInt();
                break;

            case 2:
                System.out.println("Enter your height in inch: ");
                inch = x.nextDouble();
                break;
        }
        //METRIC SYSTEM
        if (option == 1) {
            System.out.println("Enter weight in kg: ");
            kg = x.nextInt();
            double total = (kg / height) / height;
            double sum = total * 10000;
            System.out.println("====RESULT====");
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + kg);
            System.out.println("BMI: " + (int) sum);
            System.out.println("====BMI Categories====");
            System.out.println("Underweight = <18.5");
            System.out.println("Normal weight = 18.5–24.9");
            System.out.println("Overweight = 25–29.9");
            System.out.println("Obesity = BMI of 30 or greater");
        } else {
            //FEET SYSTEM
            if (option == 2) {
                System.out.println("Enter your weight in lbs");
                kg = x.nextDouble();
                double total = (kg / inch) / inch;
                double sum = total * 703;
                System.out.println("====RESULT====");
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
                System.out.println("Height: " + inch);
                System.out.println("Weight: " + kg);
                System.out.println("BMI: " + (int) sum);
                System.out.println("====BMI Categories====");
                System.out.println("Underweight = <18.5");
                System.out.println("Normal weight = 18.5–24.9");
                System.out.println("Overweight = 25–29.9");
                System.out.println("Obesity = BMI of 30 or greater");

                /* Stack<Integer>stk = new Stack<Integer>();
        stk.push(2);
        stk.push(3);
        stk.push(4);
        System.out.println(stk.pop());
        System.out.println(stk.peek());
            }*/
            }
        }
    }
}
