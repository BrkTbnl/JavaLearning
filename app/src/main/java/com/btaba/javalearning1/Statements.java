package com.brktbnl.javalearning1;

public class Statements {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        int y = 4;

        System.out.println(x>y);
        System.out.println(y>x);

        y = 30;

        System.out.println(x>y);  //dogru veya yanlissa bize yazi olarak verir boolean ceviriyor bunun icin.
        System.out.println(x>=y); //buyuk esit mu
        System.out.println(x==y); //esit mi
        System.out.println(x!=y); //Esit degil midir?

        // and && iki taraf ta dogru ise dogru 1 tanesi bile yanlissa yanlis verir
        // Or || iki taraftan birinin dogru olmasi true almamiz icin yeterli oluyor.

        x = 4;
        y = 4;
        int z = 5;

        System.out.println(x<y && y<z);
        System.out.println(x>y || y<z);
        System.out.println(x>y || y>z);

        // if statements

        if (x < y) {
            System.out.println("y is bigger");
        } else if (x > y) {
            System.out.println("x is bigger");
        } else {
            System.out.println("x = y");
        }

        //switch

        int day = 2;
        String dayString = "";
/*
        if (day == 1) {
            dayString = "monday";
        } else if (day == 2) {
            dayString = "Tuesday";
        } else if (day == 3) {
            dayString = "Wednesday";
        } else {
            dayString = "Sunday";
        }


        System.out.println(dayString);
 */


        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Sunday";
                break;

        }
        System.out.println(dayString);



    }


}
