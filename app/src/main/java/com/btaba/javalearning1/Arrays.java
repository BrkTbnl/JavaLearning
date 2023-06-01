package com.brktbnl.javalearning1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {
//Arrays
        String[] myStringArray = new String[4];//string dizisi olusturur
        myStringArray[0] = "james";
        myStringArray[1] = "lars";
        myStringArray[2] = "kirk";
        myStringArray[3] = "rob";

        System.out.println(myStringArray[0]);

        int[] myIntegerArray = new int[4];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;
        myIntegerArray[3] = 80;

        System.out.println(myIntegerArray[0]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[2]);

        //Lists
        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(0,"Kirk");


        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));

        //Set (list gibi calisiyor ama icerisindeki elemanlar tekrar edemiyor.

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("James");
        mySet.add("Kirk");
        mySet.add("Lars");
        mySet.add("James");

        System.out.println(mySet.size());

        //HashMAp

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("Name", "james");
        myHashMap.put("Instrument", "guitar");

        System.out.println(myHashMap.get("Name"));
        System.out.println(myHashMap.get("Instrument"));

        HashMap<String, Integer>  mySecondMap = new HashMap<String, Integer>();

        mySecondMap.put("Yuzme",100);
        mySecondMap.put("kosma",200);
        mySecondMap.put("yurume",300);
        mySecondMap.put("bisiklet",120);
        mySecondMap.put("paten",140);

        System.out.println(mySecondMap.get("kosma"));





    }
}
