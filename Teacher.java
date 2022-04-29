/**
 * Teacher
 */
public class Teacher extends staf {

    String subject1, subject2, subject3, subject4, subject5;
    String class1, class2, class3, class4, class5;

    Teacher(){
        subject1 = "Object Oriented Programming";
        class1 = "8B";

        subject2 = "Computer Networks";
        class2 = "4A";

        subject3 = "Database Systems";
        class3 = "5C";

        subject4 = "Engineering Mathematics";
        class4 = "8A";

        subject5 = "E-Commerce & ERP";
        class5 = "2C";
    }

    public void getSubjectClass(){
        System.out.println("emp_*id - " + cod1 + "\n" + "Subject = " + subject1 + "\n" + "Class = " + class1 + "\n");
        System.out.println("emp_*id - " + cod4 + "\n" + "Subject = " + subject2 + "\n" + "Class = " + class2 + "\n");
        System.out.println("emp_*id - " + cod6 + "\n" + "Subject = " + subject3 + "\n" + "Class = " + class3 + "\n");
        System.out.println("emp_*id - " + cod7 + "\n" + "Subject = " + subject4 + "\n" + "Class = " + class4 + "\n");
        System.out.println("emp_*id - " + cod8 + "\n" + "Subject = " + subject5 + "\n" + "Class = " + class5 + "\n");

        System.out.println("--------------------------------------------------" + "\n");
    }
    
}