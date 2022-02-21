package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== homework 1 ============================");
        int val_integer = 250;
        String val_string = "Akademia jest super!";
        double val_double = 1.234555;

        System.out.println("Zmienna val_integer ma wartość: " + val_integer);
        System.out.println("Zmienna val_string ma wartość: " + val_string);
        System.out.println("Zmienna val_double ma wartość: " + val_double);
        System.out.println("===========================================");

        System.out.println("=== homework 2 ============================");
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < table.length; i++) {
            if (table[i] % 2 == 0) {
                System.out.println("Liczba " + table[i] + " jest parzysta.");
            } else {
                System.out.println(table[i]);
            }
        }
        System.out.println("===========================================");

        System.out.println("=== homework 3 ============================");
        int x = 1;
        int sum = 0;

        while (x <= 500) {
            sum = sum + x;
            x++;
        }
        System.out.println("Suma liczb od 1 do 500 to:  " + sum);
        System.out.println("===========================================");

        System.out.println("=== homework 4 ============================");
        char[] gradetab = {'A', 'B', 'C'};
        char grade = 'A';
        int[] scoretab = {4, 5, 6, 3, 2};
        double average = 0;
        double suma = 0;

        for (int i = 0; i < scoretab.length; i++) {
            suma = suma + scoretab[i];
        }
        average = suma / scoretab.length;
        System.out.println("średnia punktów to:  " + average);

        if (average >= 4) {
            grade = gradetab[0];
        } else if (average < 4 && average >= 3) {
            grade = gradetab[1];
        } else if (average < 3) {
            grade = gradetab[2];
        }
        System.out.println("ocena to:  " + grade);
        switch (grade) {
            case 'A':
                System.out.println("super!");
                break;
            case 'B':
                System.out.println("średnio ;-)");
                break;
            case 'C':
                System.out.println("słabo :-(");
                break;
            default:
                System.out.println("coś nie tak");
        }

        System.out.println("===========================================");
        System.out.println("=== homework 5 ============================");
        Main main = new Main();
        double[] tab = {-3.3,-2.2,0,-2.345};
        double[] absTab = main.absValue(tab);
        System.out.println("Wartości bezwzględne to:");
        for(double elem : absTab ){
            System.out.println(elem);
        }

        System.out.println("===========================================");
        System.out.println("=== homework 6 ============================");
        String name1 = "Jerzy";
        String name2 = "Maja";

        System.out.println(name1 + " to: " + main.checkGender(name1));
        System.out.println(name2 + " to: " + main.checkGender(name2));
    }
    private static double[] absValue(double[] tab) {
        double[] abstab = new double [tab.length];
        int i =0;
        while(i < tab.length) {
            abstab[i] = Math.abs(tab[i]);
            i++;
        }
        return abstab;
    }
    private enum Gender {MAN, WOMAN};
    private static Gender checkGender(String name) {
        Gender gender;
        if (name.endsWith("a")) {
            gender = Gender.WOMAN;
        }
        else {
            gender = Gender.MAN;
        }
        return gender;
    }
}
