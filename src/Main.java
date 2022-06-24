public class Main {
    public static void main(String[] args) {
        int wallet = 100; // счет клиента 100 рублей;
        int payment = 1100; // сумма пополнения счета;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int total = wallet + payment + bonus;

        System.out.println(" У Вас на счету " + total + " рублей(я)");
        System.out.println(" Бонусных рублей на счету: " + bonus);


    }
}
