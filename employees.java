import java.util.Scanner;
/**
 * employees
 */
public class employees {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        System.out.println("\n");
        System.out.print("What information do you want to get Database"+ "\n" + "\n" + "1 Staf information\n2 Teacher's Information\n3 Type of Officer\n4 Performance\n5 Basic Salary\n6 Daly Salary\n7 All Information" + "\n" + "\n" + "Enter the Number in front of the information you need above: ");
        int number = myScanner.nextInt();
        System.out.println("\n");

        Teacher myTeacher = new Teacher();
        typist myTypist = new typist();
        officer myOfficer = new officer();
        casual myCasual = new casual();
        ragular myRegular = new ragular();


        if (number == 1) {
            System.out.println("STAFF" + "\n");
            myTypist.getNameCode();
        }

        else if (number == 2) {
            System.out.println("TEACHERS" + "\n");
            myTeacher.getSubjectClass();
        }
        else if (number == 3) {
            System.out.println("TYPE OF OFFICER" + "\n");
            myOfficer.getOfficer();
        }
        else if (number == 4) {
            System.out.println("PORFORMANCE" + "\n");
            myTypist.getTypist();
        }
        else if (number == 5) {
            System.out.println("BASIC SALARY" + "\n");
            myRegular.getragularSalary();
        }
        else if (number == 6) {
            System.out.println("DALY SALARY" + "\n");
            myCasual.getCasual();
        
        }
        else if (number == 7) {
            System.out.println("STAFF" + "\n");
            myTypist.getNameCode();

            System.out.println("TEACHERS" + "\n");
            myTeacher.getSubjectClass();

            System.out.println("TYPE OF OFFICER" + "\n");
            myOfficer.getOfficer();

            System.out.println("PORFORMANCE" + "\n");
            myTypist.getTypist();

            System.out.println("BASIC SALARY" + "\n");
            myRegular.getragularSalary();

            System.out.println("DALY SALARY" + "\n");
            myCasual.getCasual();
        }

        else{
            System.out.println("Sorry!\nYou Enter Incorrect Number Please try again!");
        }
        
    }
}