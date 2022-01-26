package ru.lesson6666.oop;

public class DemoApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.run();
        animal.swim();
        cat.run();
        cat.swim();
        dog.run();
        dog.swim();

        Animal [] animals = {animal,cat,dog};
        int i = 0;
        do {
            i = i +1;
        } while (i<animals.length);
        System.out.println("Количесвто животных в массиве равно" + " " + i);

    }

}
