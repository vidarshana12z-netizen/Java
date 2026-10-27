public class Registration {
    private int registrationId;
    private Student s;
    private Event e;
    private boolean paymentStatus;


    Registration(int registrationId,Student s, Event e,boolean paymentStatus){
        if(e.isStudentAlreadyInEvent(s)){
            throw new IllegalArgumentException("Student already in the Event");
        }

        this.registrationId = registrationId;
        this.s = s;
        this.e = e;
        this.paymentStatus = paymentStatus;
    }

    public void completeRegistration(Payable paymentMethod){
        int amount = e.calculateRegisterFee();
        if(paymentMethod.processPayment(amount)){
            paymentStatus = true;
        }
    }

    public void displayRegistrationDetails(){
        System.out.printf("Registration Id:" + registrationId);
        s.displayDetails();
        e.displayEventDetails();
        System.out.printf("Payment Status:" + paymentStatus);

    }
}
