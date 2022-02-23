package com.company;
import java.util.Objects;

public class Animal implements Speakable{
    public enum TypeAnimal {REPTILE, AMPHIBIAN, MAMMAL, FISH};
    private String name;
    private int yearOfBirth;
    private TypeAnimal type;
    private static int currentYear = 2022;

    // getters setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public TypeAnimal getTypeAnimal(){
        return type;
    }
    public void setTypeAnimal(TypeAnimal type){
        this.type = type;
    }

    public int getAgeOfAnimal(){
        return currentYear - yearOfBirth;
    }
    //konstruktor
    public Animal( String name, int yearOfBirth, TypeAnimal type){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.type = type;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        Animal animal = (Animal) o;
        return name == animal.name && yearOfBirth == animal.yearOfBirth && type == animal.type;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, yearOfBirth, type);
    }

    @Override
    public String toString()
    {
        return  getTypeAnimal() + " " + getName() + " wiek " + getAgeOfAnimal();
    }
    @Override
    public void sound(){
        System.out.println("...");
    }
}
