package com.company;

import java.util.List;

public class Zoo {
    private String name;
    private int yearOfEstablishment;
    private List<Animal> animals;

    //konstruktor
    public Zoo(String name, int yearOfEstablishment, List<Animal> animals) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.animals = animals;
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void showAnimals(){
        for(Animal animal : this.animals){
            System.out.println(animal);
        }
    }
    public int countAnimals(){
        return this.animals.size();
    }
    private int avgAge(){
        int sum = 0;
        for (Animal animal : this.animals){
            sum = sum + animal.getAgeOfAnimal();
        }
        return sum / this.countAnimals();
    }
    public List<Animal> getAnimals(){
        return animals;
    }
    public void showInfo(){
        System.out.println(" Informacje o Zoo");
        System.out.println("nazwa: " + this.name);
        System.out.println("rok założenia: " + this.yearOfEstablishment);
        System.out.println("średni wiek zwierząt: " + this.avgAge());
    }

}

