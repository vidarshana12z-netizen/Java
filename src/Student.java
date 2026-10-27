public class Student extends Person{

    private String degreeProgram;
    private int academicYear;

    Student(int _personId, String _name, String _email,String _degreeProgram,int _academicYear) {
        super(_personId, _name, _email);
        this.degreeProgram = _degreeProgram;

        if (academicYear < 1 || academicYear > 4) {
            throw new IllegalArgumentException("Academic year must be between 1 and 4.");
        }else{
            this.academicYear = _academicYear;
        }

    }

    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.printf("Degree program :" + this.degreeProgram);
        System.out.printf("Academic Year:" + this.academicYear);
    }
}
