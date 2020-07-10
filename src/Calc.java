import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Введите числа (от 1 до 10 или от I до X)  и знак операции (+, -, *, /)");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {
            List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
            Next.next(list.get(0), list.get(1), list.get(2));
        } catch (Exception e) {
            System.out.println("Неверный ввод");
        }
        System.exit(0);
    }
}
