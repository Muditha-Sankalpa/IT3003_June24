import java.util.Scanner;
public class GroceryBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] itemNames = new String[n];
        double[] itemPrices = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            itemNames[i] = scanner.nextLine();
            
            System.out.print("Enter item price: ");
            itemPrices[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        
        double totalBill = 0;
        double highestPrice = itemPrices[0];
        int expensiveCount = 0;
        int normalCount = 0;
        
        for (int i = 0; i < n; i++) {
            totalBill += itemPrices[i];
            
            if (itemPrices[i] > highestPrice) {
                highestPrice = itemPrices[i];
            }
            
            if (itemPrices[i] >= 1000) {
                expensiveCount++;
            } else {
                normalCount++;
            }
        }
        
        System.out.println();
        System.out.println("--- Customer Bill Summary ---");
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Highest Price: " + highestPrice);
        System.out.println("Expensive Items: " + expensiveCount);
        System.out.println("Normal Items: " + normalCount);
        scanner.close();
    }
}