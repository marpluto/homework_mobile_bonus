public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1200;
        int newBalance;
        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        newBalance = balance + payment + bonus;
        System.out.println("Текущий баланс: " + newBalance);
        System.out.println("Количетсво бонусов: " + bonus);
    }
}