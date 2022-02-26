package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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

        double[] tab = {-3.3, -2.2, 0, -2.345};
        double[] absTab = absValue(tab);
        System.out.println("Wartości bezwzględne to:");
        for (double elem : absTab) {
            System.out.println(elem);
        }

        System.out.println("===========================================");
        System.out.println("=== homework 6 ============================");
        String name1 = "Jerzy";
        String name2 = "Maja";

        System.out.println(name1 + " to: " + checkGender(name1));
        System.out.println(name2 + " to: " + checkGender(name2));

        System.out.println("===========================================");
        System.out.println("=== ZOO ============================");
        System.out.println("===========================================");

        Animal animal1 = new Animal("Kobra", 2000, Animal.TypeAnimal.REPTILE);
        Animal animal2 = new Animal("Żaba", 2020, Animal.TypeAnimal.AMPHIBIAN);
        Animal animal3 = new Animal("Żółw morski", 1978, Animal.TypeAnimal.REPTILE);
        Animal animal4 = new Animal("Kobra", 2000, Animal.TypeAnimal.REPTILE);

        System.out.println("Zwierzę 1: " + animal1.getName() + " ma lat " + animal1.getAgeOfAnimal());
        System.out.println("===========================================");
        if (animal1.equals(animal4)) {
            System.out.println("te same zwierzaki");
        } else {
            System.out.println("różne zwierzaki");
        }
        System.out.println("===========================================");
        System.out.println(animal1.hashCode());
        System.out.println(animal4.hashCode());
        System.out.println("===========================================");
        System.out.println(animal2.toString());
        System.out.println("===========================================");
        Zoo zoo1 = new Zoo("Krakowskie", 1940, new ArrayList<>());
        Zoo zoo2 = new Zoo("Wrocławskie", 1960, new ArrayList<>());
        zoo1.addAnimal(animal1);
        zoo1.addAnimal(animal2);
        System.out.println("===========================================");
        zoo2.addAnimal(animal3);
        zoo2.addAnimal(animal4);

        zoo1.showInfo();
        zoo2.showInfo();
        System.out.println("===========================================");
        System.out.println(" Zwierzęta w Zoo1:");
        zoo1.showAnimals();
        System.out.println(" Zwierzęta w Zoo2:");
        zoo2.showAnimals();
        System.out.println("===========================================");
        System.out.println(" Ilość zwierząt w Zoo1: " + zoo1.countAnimals());
        System.out.println(" Ilość zwierząt w Zoo2: " + zoo2.countAnimals());

        //dziedziczenie
        System.out.println("===========================================");
        Animal snake1 = new Snake("Grzechotnik", 2010, Animal.TypeAnimal.AMPHIBIAN, true);
        System.out.println(snake1.toString());
        Animal dog1 = new Dog("Spaniel", 2010, Animal.TypeAnimal.MAMMAL, Dog.DogBreed.COCKERSPANIEL);
        System.out.println(dog1.toString());
        Animal fish1 = new Fish("Flądra", 2010, Animal.TypeAnimal.FISH, 5);
        System.out.println(fish1.toString());

        // interfejs Speakable
        System.out.println("===========================================");
        System.out.println(" Dźwięki zwierząt:");

        fish1.sound();
        dog1.sound();
        snake1.sound();

        System.out.println("===========================================");
        System.out.println(" Dźwięki zwierząt w pętli:");
        List<Speakable> soundsOfAnimals = new ArrayList<Speakable>();

        soundsOfAnimals.add(dog1);
        soundsOfAnimals.add(snake1);
        soundsOfAnimals.add(fish1);

        for (Speakable s : soundsOfAnimals) {
            s.sound();
        }


        // lambdy
        System.out.println("===========================================");
        System.out.println("=== LAMBDY ================================");
        System.out.println("===========================================");

        Numbers numbers = new Numbers( new int[] {-1,2,50,100});

        Lambda1 lambda1 = (int[] nums) -> {
            int sum1 = 0;
            for (int i=0; i<nums.length; i++){
                sum1 += nums[i];
            }
            return sum1;
        };

        System.out.println("suma liczb to " + numbers.add(lambda1));

        Lambda2 lambda2 = (int[] nums) -> lambda1.add(nums) / nums.length;

        System.out.println("średnia liczb to " + numbers.avg(lambda2));

        Lambda3 lambda3 = (int[] nums) -> {
            for (int i=0; i<nums.length; i++){
                if ( nums[i] > 2){
                    System.out.print(nums[i] + " ");
                }
            }
        };
        System.out.print("liczby większe od 2 to ");
        numbers.show(lambda3);

        // wyjątki, streamy
        System.out.println("\n===========================================");
        System.out.println("=== ZOO dla chętnych ======================");
        System.out.println("===========================================");

        // stworzenie nowego Zoo
        Zoo naszeZoo = new Zoo("łódzkie", 1960, new ArrayList<>());

        naszeZoo.addAnimal(animal1);
        naszeZoo.addAnimal(animal2);
        naszeZoo.addAnimal(animal3);
        naszeZoo.addAnimal(animal4);

        convertAnimalsToTxt(naszeZoo);
    }

    // metody do homework5 homework6
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

    private static void convertAnimalsToTxt(Zoo zoo){
        File file = new File("C:\\Users\\ankaj\\animals.txt");
        try {
            if (!file.exists()) {
                System.out.println("File dees not exist. Will be created now.");
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            for(Animal animal : zoo.getAnimals()) {
                printWriter.println(animal.getName());
            }
            System.out.println("Animals names written to file.");
            printWriter.close();
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }

}


