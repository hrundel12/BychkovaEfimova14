import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceFileContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новый текст для замены содержимого файла:");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt", false)) { // false - файл перезаписывается
            writer.write(input);
            System.out.println("Содержимое файла успешно заменено.");
        } catch (IOException e) {
            System.out.println("Ошибка замены содержимого файла: " + e.getMessage());
        }
    }
}