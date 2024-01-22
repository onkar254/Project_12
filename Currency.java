import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        // Get user input for base and target currencies
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base currency code: ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency code: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Fetch real-time exchange rates from a hypothetical API (replace with actual
        // API)
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1) {
            System.out.println("Error fetching exchange rates. Please try again later.");
            return;
        }

        // Get user input for the amount to convert
        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        // Perform currency conversion
        double convertedAmount = amountToConvert * exchangeRate;

        // Display the result
        System.out.printf("%.2f %s is equal to %.2f %s%n", amountToConvert, baseCurrency, convertedAmount,
                targetCurrency);
    }

    // This method simulates fetching real-time exchange rates from an API
    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // Replace this with actual API call to get real-time exchange rates
        // For simplicity, let's assume a fixed exchange rate of 1.5 for testing
        // purposes
        // In a real-world scenario, you should use a reliable currency exchange API
        return 1.5;
    }
}
