public class CardPayment implements Payable{
   private String cardHolderName;
   CardPayment(String cardHolderName){
       this.cardHolderName = cardHolderName;
   }

    @Override
    public boolean processPayment(double amount) {
        if(amount > 0){
            System.out.printf("Payment Successful!!");
            return true;
        }
        throw new IllegalArgumentException("Invalid Payment");

    }
}
