package ru.lesson6.cource1;

public class Cat extends Animal {
    void run() {
        int distance = 50;
        if (distance >= 200) {
            System.out.println("cat runs 200 meter");
        } else {
            System.out.println("cat ran your distance");
        }
    }

    void swim() {
        System.out.println("Cat cannon swim");
    }
}

