public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculator = new CreditPaymentService();
        String monthPayString = "Ежемесячный платеж ";

        double user1 = calculator.calculete(1_000_000, 9.99, 12);
        System.out.println(monthPayString + user1);

        double user2 = calculator.calculete(1_000_000, 9.99, 24);
        System.out.println(monthPayString + user2);

        double user3 = calculator.calculete(1_000_000, 9.99, 36);
        System.out.println(monthPayString + user3);

    }
}
