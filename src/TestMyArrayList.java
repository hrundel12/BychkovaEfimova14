class MyArrayList<T> {
    private Object[] elements;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    // Конструктор
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Добавление элемента
    public void add(T value) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = value;
    }

    // Добавление элемента по индексу
    public void add(int index, T value) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (size == elements.length) resize();

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = value;
        size++;
    }

    // Получение элемента по индексу
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (T) elements[index];
    }

    // Удаление элемента по индексу
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    // Получение размера списка
    public int size() {
        return size;
    }

    // Увеличение размера массива
    private void resize() {
        int newSize = elements.length * 2;
        Object[] newArray = new Object[newSize];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    // Вывод всех элементов
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
}

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();

        System.out.println("Добавляем элементы:");
        myList.add("Германия");
        myList.add("Франция");
        myList.add("Великобритания");
        myList.add(1, "Испания");

        System.out.println("\nСодержимое списка:");
        myList.printAll();

        System.out.println("\nПолучаем элемент с индексом 1: " + myList.get(1));

        System.out.println("\nУдаляем элемент с индексом 1:");
        myList.remove(1);
        myList.printAll();

        System.out.println("\nРазмер списка: " + myList.size());
    }
}