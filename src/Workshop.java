public class Workshop extends Event{
    private String instructorName;
    private int durationHours;

    Workshop(int eventId, String title, String data, String venue, int capacity, int durationHours,String instructorName) {
        super(eventId, title, data, venue, capacity);
        this.instructorName = instructorName;
        this.durationHours = durationHours;

    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.printf("Instructor Name:"+instructorName);
        System.out.printf("Duration Hour:"+durationHours);
    }

    @Override
    public int calculateRegisterFee() {
        int registrationFee = 1500;
        return registrationFee;
    }
}
