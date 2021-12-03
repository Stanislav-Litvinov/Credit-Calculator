public class CreditPaymentService {
    public double calculete(double credit, double interestRate, double creditMonths) {
        double yearMonth = 12;
        double percent = 100;
        double yearPercent = interestRate / percent / yearMonth;
        double monthPercent = 1 + yearPercent;
        double monthPay = credit * (yearPercent * (Math.pow(monthPercent, creditMonths) / (Math.pow(monthPercent, creditMonths) - 1)));
        return monthPay;
    }
}
