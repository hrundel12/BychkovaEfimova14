import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для записи в файл:");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) { // output.txt - имя файла
            writer.write(input);
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}