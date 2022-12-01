package task_zoo_remove;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add(0,"Cat");
        animals.add(1,"Dog");
        animals.add(2,"Crocodile");
        animals.add(3,"Flamingo");
        animals.add(4,"Lion");
        animals.add(5,"Elephant");
        animals.add(6,"Lama");
        animals.add(7,"Sheep");

        System.out.println("Елементи масиву до видалення: " + animals);
        System.out.println("Розмір до видалення: " + animals.size());

        animals.remove(3);
        animals.remove(5 - 1);
        animals.remove(7 - 2);

        System.out.println("Елементи масиву після видалення: " + animals);
        System.out.println("Розмір після видалення: " + animals.size());
    }
}
