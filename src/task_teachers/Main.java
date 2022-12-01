package task_teachers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add(0,"Rachel");
        teachers.add(1,"Monica");
        teachers.add(2,"Phoebe");
        teachers.add(3,"Joey");
        teachers.add(4,"Chandler");
        teachers.add(5,"Ross");

        System.out.println("Найкращий вчитель, індекс: " + teachers.indexOf("Rachel"));
        System.out.println("Найгірший вчитель, індекс: " + teachers.indexOf("Phoebe"));
    }
}
