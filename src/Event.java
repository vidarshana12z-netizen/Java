import java.util.ArrayList;
import java.util.List;

public abstract class Event {
    private int eventId;
    private String title;
    private String date;
    private String venue;
    private int capacity;
    private List<Student> registeredStudents;

    Event(int eventId,String title,String data,String venue,int capacity){
        this.eventId = eventId;
        this.title = title;
        this.date = data;
        this.venue = venue;

        registeredStudents= new ArrayList<>();

        if (capacity <= 0) {
            throw new IllegalArgumentException("Event capacity must be greater than zero.");
        }else{
            this.capacity = capacity;
        }


    }

    public void getTitle(int eventId){
        this.eventId = eventId;
    }

    public void getData(String date){
        this.date = date;
    }

    public void getVenue(String venue){
        this.venue= venue;
    }

    public void registerStudent(Student s){
        if(capacity >= registeredStudents.size()){
            registeredStudents.add(s);

        }else{
            throw new IllegalArgumentException("Capacity Exceed!!");
        }

    }

    public void displayEventDetails(){
        System.out.printf("Event Id:"+eventId);
        System.out.printf("Event title:"+title);
        System.out.printf("Event Data:"+date);
        System.out.printf("Event Venue:"+venue);
    }

    public boolean isStudentAlreadyInEvent(Student ss){
        if(registeredStudents.contains(ss)){
            return true;
        }
        return false;

    }

    public abstract int calculateRegisterFee();
}
