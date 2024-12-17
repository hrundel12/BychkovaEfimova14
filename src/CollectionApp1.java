package collectionapp;

import java.util.LinkedList;

public class CollectionApp1 {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        System.out.println("Добавляем элементы в LinkedList:");
        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания"); // на конец списка
        states.addFirst("Испания");       // на начало списка
        states.add(1, "Италия");          // по индексу 1
        System.out.println(states);

        System.out.printf("\nРазмер списка: %d элементов\n", states.size());

        System.out.println("\nПолучаем элемент с индексом 1: " + states.get(1));

        System.out.println("\nЗаменяем элемент с индексом 1 на 'Дания':");
        states.set(1, "Дания");
        System.out.println(states);

        System.out.println("\nВыводим элементы с помощью цикла:");
        for (String state : states) {
            System.out.println(state);
        }

        System.out.println("\nПроверяем наличие 'Германия': " +
                (states.contains("Германия") ? "Содержит" : "Не содержит"));

        System.out.println("\nУдаляем 'Германия', первый и последний элементы:");
        states.remove("Германия");
        states.removeFirst();
        states.removeLast();
        System.out.println(states);

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        System.out.println("\nСписок объектов Person:");
        for (Person p : people) {
            System.out.println(p.getName());
        }

        System.out.println("\nУдаляем второй элемент:");
        people.remove(1);
        for (Person p : people) {
            System.out.println(p.getName());
        }

        Person first = people.getFirst();
        System.out.println("\nПервый элемент: " + first.getName());
    }
}

class Person {
    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }
}