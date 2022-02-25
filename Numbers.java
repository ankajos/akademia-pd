package com.company;

public class Numbers {
    private int[] numbers;

    public Numbers (int[] numbers){
        this.numbers = numbers;
    }

    public double add(Lambda1 lambda) {
        return lambda.add(numbers);
    }
    public double avg(Lambda2 lambda) {
        return lambda.avg(numbers);
    }
    public void show(Lambda3 lambda) {
        lambda.show(numbers);
    }
}
