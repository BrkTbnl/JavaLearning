package com.brktbnl.javalearning1;

public class Variables {
    public static void main(String[] args) {

        //Variables
        // integer (tam sayilar)

        int age = 20;
        System.out.println(10* age );

        int x = 5;
        int y = 11;
        long MyLong = 10;
        System.out.println(MyLong/5);


        System.out.println(y / x);

        // Double - Float (kesirli sayilar icin kullaniliyor ama tam sayilari da .0 seklinde yazman gerekiyor)

        double z = 5.0;
        double a = 11;

        System.out.println(a/z);
        float MyFloat = 10.0f;

        // ikinci ders

        double pi = 3.14;

        int r = 5;

        double sonuc = 2 * pi * r;
        System.out.println(sonuc);

        //String

        String name = "James";
        String surname = "Hetfield";

        System.out.println(name);
        System.out.println(surname);

        String fullname = name + " " + surname;
        System.out.println(fullname);

        //Boolean

        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        // Degisken ve sabit FINAL
        final int myInteger = 5;

        System.out.println("myInteger: " + myInteger);

        //myInteger = 4;
        System.out.println("myInteger: " + myInteger);
    }

    public static class Arrays {
    }
}
