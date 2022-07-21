import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x = 100;
        Scanner ticket = new Scanner(System.in);
        long var_num;
        System.out.print("Введите сумму пополнения счета: ");
        var_num = ticket.nextInt();
        if (var_num > 100) {
            System.out.print("Ваш баланс: " + (var_num + x));
            System.out.print("\nКоличество бонусных баллов на счету: " + (var_num + x)/100);
        }
    }
}