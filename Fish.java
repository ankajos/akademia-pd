package com.company;

public class Fish extends Animal {
    private int numberOfFins;

    public Fish(String name, int yearOfBirth, TypeAnimal type, int numberOfFins){
        super(name,yearOfBirth,type);
        this.numberOfFins = numberOfFins;
    }
    public int getNumberOfFins(){
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins){
        this.numberOfFins = numberOfFins;
    }

    @Override
    public String toString(){
        return  super.getTypeAnimal() + " " + super.getName() +
                " wiek " + super.getAgeOfAnimal() + " liczba płetw " + getNumberOfFins();
    }

    @Override
    public void sound(){
        System.out.println("dzieci i ryby głosu nie mają XD");
    }
}
