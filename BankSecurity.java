final class BankSecurity {
    private final String BANK_NAME = "ABC International Bank";

    private final String customerName;
    private final String accountNumber;
    public BankSecurity(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }
    public String getBankName() {
        return BANK_NAME;
    }  
    public String getCustomerName() {
        return customerName;
    } 
    public String getAccountNumber() {
        return accountNumber;
    }
    public final void displaySecurityMessage() {
        System.out.println("Secure Banking Access Enabled.");
    }
    public static void main(String[] args) {
        BankSecurity security = new BankSecurity("Nimall Perera", "ACC1001");
        System.out.println("Bank Name:" + security.getBankName());
        System.out.println("Customer Name: " + security.getCustomerName());
        System.out.println("Account Number:" + security.getAccountNumber());
        security.displaySecurityMessage();
    }
}