import java.util.Scanner;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class ComparingStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double discountPercent = 0.0;
        String shippingMethod = "";
        String customerType = "G";

        if (customerType.equals("R")) {
            discountPercent = 0.1;
            shippingMethod = "UPS";
        } else if (customerType.equals("C")) {
            discountPercent= 0.2;
            shippingMethod = "Bulk";

        } else {
            shippingMethod = "USPS";
        }
    }
}
