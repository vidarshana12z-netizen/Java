
public class SocialEvent extends Event {
    private String eventType;
    private boolean isIncludesRefreshments;


    SocialEvent(int eventId, String title, String data, String venue, int capacity,String eventType,boolean isIncludesRefreshments) {
        super(eventId, title, data, venue, capacity);
        this.eventType = eventType;
        this.isIncludesRefreshments = isIncludesRefreshments;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.printf("Event Type:"+eventType);
        System.out.printf("Includes Refreshments :" + isIncludesRefreshments);
    }

    @Override
    public int calculateRegisterFee() {
        if(isIncludesRefreshments){
            return 800;
        }
        return 500;
    }
}
