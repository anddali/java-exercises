package exercises;

import java.util.Scanner;


enum Direction{
    NORTH, SOUTH, EAST, WEST;
}

public class ConditionalLogic {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        //preAndPostDifference();
        //booleanLogicShortCircuitOps();
        //compareStrings();

        /*
        System.out.println("Enter age limit and age:");
        int ageLimit = sc.nextInt();
        int age = sc.nextInt();
        String message = admitToFilm(ageLimit,age) ? "Can be admitted!":"Cannot be admited";
        System.out.println(message);
        */

        //ternaryOperator();
        //switchVowelOrConsonant();
        //ifMonth();
        //ifGrade();
        //switchEnumType();
        //ifTemperature();
        switchDaysInMonth();
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
    private static boolean admitToFilm(int ageLimit, int age){
        return (age>=ageLimit) ? true:false;
    }
    private static void ternaryOperator(){
        boolean isHappy = true;
        String mood = isHappy ? "I am happy!" : "I am not Happy!";
        System.out.println(mood);

        System.out.println("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int minVal = (x>y) ? y : x;
        System.out.println("Min val is: " + minVal);
    }
    private static void switchVowelOrConsonant(){
        System.out.println("Enter a character: ");
        char letter = sc.next().charAt(0);
        switch(letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 65:
            case 69:
            case 73:
            case 79:
            case 85:
            case 89:
                System.out.println(letter + " is a vowel!");
                break;
            default:
                System.out.println(letter + " is a consonant!");

        }
    }
    private static void ifMonth(){
        final int JAN=1, FEB=2, MAR=3, APR=4, MAY=5, JUN=6, JUL=7, AUG=8, SEP=9,
                OCT=10, NOV=11, DEC=12;

        String m;
        System.out.print("Enter month number: ");
        m = sc.next();
        try {
            int month = Integer.parseInt(m);
            if (month == JAN)
                System.out.println("January");
            else if (month == FEB)
                System.out.println("February");
            else if (month == MAR)
                System.out.println("March");
            else if (month == APR)
                System.out.println("April");
            else if (month == MAY)
                System.out.println("May");
            else if (month == JUN)
                System.out.println("June");
            else if (month == JUL)
                System.out.println("July");
            else if (month == AUG)
                System.out.println("August");
            else if (month == SEP)
                System.out.println("September");
            else if (month == OCT)
                System.out.println("October");
            else if (month == NOV)
                System.out.println("November");
            else if (month == DEC)
                System.out.println("December");
            else
                System.out.println("Index out of range!");
        }catch(Exception e){
            System.out.println("Exception!!!");
            System.out.println(e);
        }
    }
    private static void ifGrade(){
        String m;
        System.out.print("Enter grade (0..100): ");
        m = sc.next();
        try {
            int grade = Integer.parseInt(m);
            if(grade>100 || grade<0)
                System.out.println("Out of range!");
            else if(grade>=70 && grade<=100)
                System.out.println("A");
            else if(grade>=60)
                System.out.println("B");
            else if(grade>=50)
                System.out.println("C");
            else if(grade>=40)
                System.out.println("D");
            else
                System.out.println("Fail!");

        }catch(Exception e){
            System.out.println("Exception!!!");
            System.out.println(e);
        }
    }
    private static void switchEnumType(){
        Direction theWay = null;
        System.out.print("Enter direction (N,S,E,W): ");
        String input = sc.next();
        input = input.toUpperCase();
        switch (input){
            case "N":
                theWay = Direction.NORTH;
                break;
            case "S":
                theWay = Direction.SOUTH;
                break;
            case "E":
                theWay = Direction.EAST;
                break;
            case "W":
                theWay = Direction.WEST;
                break;
            default:
                System.out.println(input + " is not recognised!");
        }
        try {
            switch (theWay) {
                case NORTH:
                    System.out.println("Santy...");
                    break;
                case SOUTH:
                    System.out.println("Penguins...");
                    break;
                case EAST:
                    System.out.println("The land of rising sun...");
                    break;
                case WEST:
                    System.out.println("Hollywood...");
                    break;
            }
        }catch(Exception e){
            System.out.println("theWay is null, can not switch.");
        }
    }
    private static void ifTemperature(){
        int temperature = 0;
        final int COLD = 0,
                MILD = 15,
                WARM = 20,
                VERY_WARM = 25,
                HOT = 30;
        System.out.print("Enter temperature (integer): ");
        try{
            temperature = sc.nextInt();
            if(temperature<=COLD)
                System.out.println("cold");
            else if(temperature>COLD && temperature<MILD)
                System.out.println("a little cold but OK");
            else if(temperature>=MILD && temperature<WARM)
                System.out.println("mild");
            else if(temperature>=WARM && temperature<VERY_WARM)
                System.out.println("warm");
            else if(temperature>=VERY_WARM && temperature<HOT)
                System.out.println("very warm");
            else
                System.out.println("hot");
        }catch(Exception e){
            System.out.println("Exception");
            System.out.println(e);
        }
    }
    private static void switchDaysInMonth(){
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        int numDays = 0;
        final int JAN=1, FEB=2, MAR=3, APR=4,
                MAY=5, JUN=6, JUL=7, AUG=8,
                SEP=9, OCT=10, NOV=11, DEC=12;
        switch (month){
            case JAN:
            case MAR:
            case MAY:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                numDays = 31;
                break;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                numDays = 30;
                break;
            case FEB:
                if (year%400==0 || (year%4==0 && year%100!=0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
        }
        System.out.println("number of days: " + numDays);
    }

}
