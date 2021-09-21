package exercises;

import java.util.Scanner;

public class ConditionalLogic {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        //preAndPostDifference();
        //booleanLogicShortCircuitOps();
        compareStrings();
    }
    private static void preAndPostDifference(){
        int x = 5;
        int y = 10;
        System.out.println("The value of x is " + x);
        System.out.println("The value of ++x is " + ++x);
        System.out.println("The value of x++ is " + x++);
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println("The value of --y is " + --y);
        System.out.println("The value of y-- is " + y--);
        System.out.println("The value of y is " + y);
    }
    private static void booleanLogicShortCircuitOps(){
        int num1;
        int num2;

        System.out.println("Enter the 2 numbers: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 < 0 && num2++ < 0)
            System.out.println(num2);
        else if(num1 > 0 && num2++ > 0)
            System.out.println(num2);
        else if (num1 == 0 || num2++ == 0)
            System.out.println(num2);
        else if (num1 < 0 || num2++ < 0)
            System.out.println(num2);

        System.out.println(num2);
    }
    private static void booleanBitwiseOps(){
        int num1;
        int num2;

        System.out.println("Enter the 2 numbers: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 < 0 & num2++ < 0)
            System.out.println(num2);
        else if(num1 > 0 & num2++ > 0)
            System.out.println(num2);
        else if (num1 == 0 | num2++ == 0)
            System.out.println(num2);
        else if (num1 < 0 | num2++ < 0)
            System.out.println(num2);

        System.out.println(num2);
    }
    private static void compareStrings(){
        String s1;
        String s2;
        System.out.println("Enter two strings: ");
        s1 = sc.next();
        s2 = sc.next();

        System.out.println("Using == returns " + (s1 == s2));
        System.out.println("Using equals() returns " + s1.equals(s2));

        String name1 = "Sean";
        String name2 = "Sean";
        System.out.println("Using == returns " + (name1 == name2));
    }
    private static boolean admitToFilm(int arg1, int arg2){
        return true;
    }
    private static void ternaryOperator(){

    }
    private static void ifMonth(){

    }
    private static void ifGrade(){

    }
    private static void switchMathOperation(){

    }
    private static void switchEnumType(){

    }
    private static void ifTemperature(){

    }
    private static void switchDaysInMonth(){

    }

}
