public class CreditPaymentService {
    public double calculete(double credit, double interestRate, double creditMonths) {
        double yearPercent = interestRate / 100 / 12;
        double monthPercent = 1 + yearPercent;
        double monthPay = credit * (yearPercent * (Math.pow(monthPercent, creditMonths) / (Math.pow(monthPercent, creditMonths) - 1)));
        return monthPay;
    }
}
