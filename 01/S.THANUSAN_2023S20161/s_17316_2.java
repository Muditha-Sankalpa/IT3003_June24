import java.util.Scanner;

public class s_17316_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        int choice;
    
        do {
            System.out.print("1.Deposit 2.Withdraw 3.Check Balance 4.Exit Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    balance = deposit(balance, sc);
                    break;
                case 2:
                    balance = withdraw(balance, sc);
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
            }
        } while (choice != 4); 

        sc.close();
    }


    public static double deposit(double balance, Scanner sc) {
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposit Successful");
		System.out.println("Total Balance" + balance);
        return balance; 
    }

    
    public static double withdraw(double balance, Scanner sc) {
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
			System.out.println("Total Balance" + balance);
        }
        return balance;
    }
}