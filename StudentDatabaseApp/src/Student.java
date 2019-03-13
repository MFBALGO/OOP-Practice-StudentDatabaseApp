
import java.util.ArrayList;
import java.util.Scanner;


public class Student {
    private String firstName;
    private String lastName;
    private int yearLevel;
    private String studentID;
    private ArrayList<String> courses = new ArrayList<String>();
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: Create use with unique ID and prompts the user to enroll
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter Last Name: ");
        this.lastName = in.nextLine();
        System.out.println("Level: \n1- Freshmen\n2- Sophomore\n3- Junior\n4- Senior");
        this.yearLevel = in.nextInt();
        
        setStudentID();
        enroll();
    }
    
    //Generate ID
    private void setStudentID(){
        id++;
        this.studentID = yearLevel + "" + id;
    }
    
    
    //Enroll in courses
    public void enroll(){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Enter course to enroll (Q to quit): ");
            String course = in.nextLine();
            if (course.equals("Q")){
                break;
            }
            else{ courses.add(course); }
        }
        
        tuitionBalance = courses.size()*costOfCourse;
    }
    
    public void viewBalance(){
        System.out.println("your balance is : $" + tuitionBalance);
    }
    
    public void payTuition(){
        System.out.println("Enter Payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        viewBalance();
    }
    
    public void showInfo(){
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID: " + studentID);
        System.out.println("Courses Enrolled: " + courses.toString());
        System.out.println("Balance: " + tuitionBalance);
    }
}
