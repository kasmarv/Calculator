import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Введите числа (от 1 до 10 или от I до X)  и знак операции (+, -, *, /)");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> list = new ArrayList<>();
        try {
            for (String temp : s.split(" ")) {
                list.add(temp);
            }
            Next.next(list.get(0), list.get(1), list.get(2));
        } catch (Exception e) {
            System.out.println("Неверный ввод");
        }
        System.exit(0);
    }
}
