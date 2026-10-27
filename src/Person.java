public class Person {
    private int personId;
    private String name;
    private  String email;

    Person(int _personId,String _name,String _email){
            if(_name == null || _name.trim().isEmpty() ) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }

            name = _name;
            personId = _personId;
            email = _email;




    }

    public void getName(String _name){
        name = _name;
    }
    public void getId(int id){
        personId = id;
    }

    public void getEmail(String _email){
        email = _email;
    }

    public void displayDetails(){
        System.out.printf("ID:"+this.personId);
        System.out.printf("Name:" + this.name);
        System.out.println("Email:"+this.email);
    }

}
