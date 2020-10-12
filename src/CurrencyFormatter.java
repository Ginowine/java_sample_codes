import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = numberFormat.format(payment);

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = numberFormat1.format(payment);

        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = numberFormat2.format(payment);

        System.out.println("US: " + us);
        //System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
