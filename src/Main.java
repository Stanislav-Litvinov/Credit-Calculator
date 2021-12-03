public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculator = new CreditPaymentService();
        String monthPayString = "Ежемесячный платеж ";

        double user1 = calculator.calculete(1_000_000, 9.99, 12);
        System.out.println(monthPayString + user1);

        double user2 = calculator.calculete(300_000, 9, 6);
        System.out.println(monthPayString + user2);

        double user3 = calculator.calculete(4_087_000, 7.5, 24);
        System.out.println(monthPayString + user3);

        double user4 = calculator.calculete(11_000_000, 6.5, 240);
        System.out.println(monthPayString + user4);

    }
}
