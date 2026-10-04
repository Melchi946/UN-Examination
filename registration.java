public class registration {
    // central configuration
    static int ExamYear;
    static double RegistrationFee;
    static String GradingPolicy;

    //student details
    String StudentName;
    String NameOfSchool;

    // default values
    String RegistrationStatus;
    String ExamCenter;

    //static initialization block
    //executes once when the class is loaded
    static {
        ExamYear = 2025;
        RegistrationFee = 10000;
        GradingPolicy = "A= Excellent, B= Very Good C= Good";
        System.out.println("Exam Year = " +ExamYear);
        System.out.println("Registration Fee = " +RegistrationFee);
        System.out.println("Grading Policy = " +GradingPolicy);
    }
    //instance initialization block
    //executes every time an object is created
    {
        RegistrationStatus = "registered";
        ExamCenter = "IUEA";
    }
    // constructor
    public registration(String studentName, String NameOfSchool){
        this.StudentName = studentName;
        this.NameOfSchool = NameOfSchool;
    }
    public void displayRegInfo(){
        System.out.println("Student =" +StudentName);
        System.out.println("School Name = " +NameOfSchool);
        System.out.println("Registration Status = " +RegistrationStatus);
        System.out.println("Examination Center = " +ExamCenter);
    }
    public static void main(String[] args) {
        registration st1 = new registration("Yvan","Hope Africa");
        registration st2 = new registration("Bruce","Gitega high School");
        registration st3 = new registration("Anas","Kampala school");
        System.out.println("====== Student 1 information ======");
        st1.displayRegInfo();
        System.out.println("====== Student 2 information ======");
        st2.displayRegInfo();
        System.out.println("====== Student 3 information ======");
        st3.displayRegInfo();
    }
}

