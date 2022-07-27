import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        Scanner ticket = new Scanner(System.in);
        long replenishmentAmount;
        System.out.print("Введите сумму пополнения счета: ");
        replenishmentAmount = ticket.nextInt();
        if (replenishmentAmount >= 101) {;
            long bonuses = replenishmentAmount/100;
            System.out.print("Ваш баланс: " + (replenishmentAmount + initialAmount + bonuses));
            System.out.print("\nКоличество бонусных баллов на счету: " + replenishmentAmount / 100);
        }
        else {;
            System.out.print("Ваш баланс: " + (replenishmentAmount + initialAmount ));
            System.out.print("\nКоличество бонусных баллов на счету: " + 0);
        }
    }
}
