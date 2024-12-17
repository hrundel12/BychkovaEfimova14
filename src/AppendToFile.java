import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для добавления в конец файла:");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt", true)) { // true - добавляет текст в конец файла
            writer.write("\n" + input);
            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            System.out.println("Ошибка добавления текста в файл: " + e.getMessage());
        }
    }
}