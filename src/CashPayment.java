public class CashPayment implements Payable{

    @Override
    public boolean processPayment(double amount) {
        if(amount > 0){
            System.out.printf("Payment Successful!!");
            return true;
        }
        throw new IllegalArgumentException("Invalid Payment");

    }
}
