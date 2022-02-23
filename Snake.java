package com.company;

public class Snake extends Animal {
    private boolean poisonous; // jadowity

    public Snake(String name, int yearOfBirth, TypeAnimal type, boolean poisonous){
        super(name,yearOfBirth,type);
        this.poisonous = poisonous;
    }

    public boolean getPoisonous(){
        return poisonous;
    }

    public void setPoisonous(boolean poisonous){
        this.poisonous = poisonous;
    }

    @Override
    public String toString(){
        return  super.getTypeAnimal() + " " + super.getName() + " wiek " + super.getAgeOfAnimal() + " jadowity " + getPoisonous();
    }

    @Override
    public void sound(){
        System.out.println("ssssssss...");
    }
}

