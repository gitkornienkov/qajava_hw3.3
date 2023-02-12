public class CreditPaymentService {
// Формула расчета доступна на сайте https://finuslugi.ru/navigator/kredity/stat_annuitetnye_i_differentsirovannye_platezhi
    public int calculate(int loan, double rate, int termMonth) {
        double monthlyPayment;
        monthlyPayment =loan * (((rate / 12 / 100) * Math.pow((1 + (rate / 12 / 100)), termMonth)) / (Math.pow((1 + rate / 12 / 100), termMonth) - 1));

        return (int)monthlyPayment;
    }
}