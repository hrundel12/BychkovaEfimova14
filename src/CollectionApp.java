import java.util.ArrayList;

public class CollectionApp {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();

        System.out.println("Добавляем элементы в ArrayList:");
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        System.out.println(states); // Выводим все элементы

        System.out.println("\nДобавляем 'Италия' на индекс 1:");
        states.add(1, "Италия");
        System.out.println(states);

        System.out.println("\nПолучаем элемент с индексом 1: " + states.get(1));

        System.out.println("\nЗаменяем элемент на индексе 1 на 'Дания':");
        states.set(1, "Дания");
        System.out.println(states);

        System.out.printf("\nРазмер списка: %d элементов\n", states.size());

        System.out.println("\nВыводим элементы с помощью цикла:");
        for (String state : states) {
            System.out.println(state);
        }

        System.out.println("\nПроверяем наличие 'Германия': " +
                (states.contains("Германия") ? "Содержит" : "Не содержит"));

        System.out.println("\nУдаляем 'Германия' и элемент с индексом 0:");
        states.remove("Германия");
        states.remove(0);
        System.out.println(states);

        System.out.println("\nПреобразуем в массив и выводим:");
        Object[] countries = states.toArray();
        for (Object country : countries) {
            System.out.println(country);
        }
    }
}