interface Payment {
    void pay();  
}

class CreditCard implements Payment {
   
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Payment payment = new CreditCard();
        
        
        payment.pay();  
    }
}