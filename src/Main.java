public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        System.out.println();
        System.out.println("Сумма кредита 1 000 000 рублей, ставка 9.9%, Срок 12 месяцев");
        System.out.println(service.calculate(1_000_000, 9.99,12));

        System.out.println();
        System.out.println("Сумма кредита 1 000 000 рублей, ставка 9.9%, Срок 24 месяцев");
        System.out.println(service.calculate(1_000_000, 9.99,24));

        System.out.println();
        System.out.println("Сумма кредита 1 000 000 рублей, ставка 9.9%, Срок 36 месяцев");
        System.out.println(service.calculate(1_000_000, 9.99,36));
    }
}