import java.util.Scanner;

class staf  {

    int cod1, cod2, cod3, cod4, cod5, cod6, cod7, cod8;
    String name1, name2, name3, name4,name5,name6, name7, name8;

    staf(){

        cod1 = 1;
        name1 = "Mr.P.A.P.Jayathilaka";

        cod2 = 2;
        name2 = "Miss.K.C.H.Perera";

        cod3 = 3;
        name3 = "Mr.J.P.Kriyawasam";

        cod4 = 4;
        name4 = "Mr.P.K.Kumarasinha";

        cod5 = 5;
        name5 = "Mr.J.J.Liyanage";

        cod6 = 6;
        name6 = "Miss.K.L.Tharuka";

        cod7 = 7;
        name7 = "Miss.Y.K.Gunasinha";

        cod8 = 8;
        name8 = "Mr.T.H.Guathilaka";

    }

    public void getNameCode(){
        System.out.println("Code (emp_*id) = " + cod1 + "\n" + "Name = " + name1 + "\n");
        System.out.println("Code (emp_*id) = " + cod2 + "\n" + "Name = " + name2 + "\n");
        System.out.println("Code (emp_*id) = " + cod3 + "\n" + "Name = " + name3 + "\n");
        System.out.println("Code (emp_*id) = " + cod4 + "\n" + "Name = " + name4 + "\n");
        System.out.println("Code (emp_*id) = " + cod5 + "\n" + "Name = " + name5 + "\n");
        System.out.println("Code (emp_*id) = " + cod6 + "\n" + "Name = " + name6 + "\n");
        System.out.println("Code (emp_*id) = " + cod7 + "\n" + "Name = " + name7 + "\n");
        System.out.println("Code (emp_*id) = " + cod8 + "\n" + "Name = " + name8 + "\n");

        System.out.println("--------------------------------------------------" + "\n");
    }
}


/**
 * Teacher
 */
class Teacher extends staf {

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


/**
 * officer
 */
class officer extends staf {

    String grade1;
    String grade2;
    String grade3;

    officer() {
        grade1 = "Chief marketing officer (CMO)";
        grade2 = "Chief financial officer (CFO)";
        grade3 = "Chief technology officer (CTO)";
    }

    public void getOfficer(){
        System.out.println("emp_*id - " + cod2 + "\n" + "Type of Officer = " + grade1 + "\n");
        System.out.println("emp_*id - " + cod3 + "\n" + "Type of Officer = " + grade2 + "\n");
        System.out.println("emp_*id - " + cod5 + "\n" + "Type of Officer = " + grade3 + "\n");

        System.out.println("--------------------------------------------------" + "\n");
    }  
    
}

/**
 * typist
 */
class typist extends staf {

    String speed1, speed2, speed3,speed4,speed5,speed6, speed7, speed8;

    typist(){
        speed1 = "Excellent"; 
        speed2 = "Good";       
        speed3 = "Bad";        
        speed4 = "Bad";       
        speed5 = "Excellent"; 
        speed6 = "Good";      
        speed7 = "Bad";       
        speed8 = "Excellent"; 
    }

    /*

    speed1 = cod1 (emp_*id 1)
    speed2 = cod2 (emp_*id 2)
    speed3 = cod3 (emp_*id 3)
    speed4 = cod4 (emp_*id 4)
    speed5 = cod5 (emp_*id 5)
    speed6 = cod6 (emp_*id 6)
    speed7 = cod7 (emp_*id 7)
    speed8 = cod8 (emp_*id 8)
    
     */

    public void getTypist(){
        System.out.println("emp_*id - " + cod1 + "\n" + "Speed = " + speed1 + "\n");
        System.out.println("emp_*id - " + cod4 + "\n" + "Speed = " + speed2 + "\n");
        System.out.println("emp_*id - " + cod6 + "\n" + "Speed = " + speed3 + "\n");
        System.out.println("emp_*id - " + cod2 + "\n" + "Speed = " + speed4 + "\n");
        System.out.println("emp_*id - " + cod3 + "\n" + "Speed = " + speed5 + "\n");
        System.out.println("emp_*id - " + cod5 + "\n" + "Speed = " + speed6 + "\n");
        System.out.println("emp_*id - " + cod7 + "\n" + "Speed = " + speed7 + "\n");
        System.out.println("emp_*id - " + cod8 + "\n" + "Speed = " + speed8 + "\n");

        System.out.println("--------------------------------------------------" + "\n");
    }
    
}

/**
 * casual
 */
class casual extends typist {

    int dalySalaryExcellent, dalySalaryGood, dalySalaryBad;

    casual(){

        dalySalaryExcellent = 30000;
        dalySalaryGood = 25000;
        dalySalaryBad = 20000;
        
    }

    public void getCasual(){
        /*
        speed1 = cod1 (emp_*id 1)
        */

        if (speed1 == "Excellent") {

            System.out.println("emp_*id - " + cod1 + "\n" + "Basic Salary = " + dalySalaryExcellent + "\n");

        }else if (speed1 == "Good") {
            
            System.out.println("emp_*id - " + cod1 + "\n" + "Basic Salary = " + dalySalaryGood + "\n");

        }else if (speed1 == "Bad") {
            
            System.out.println("emp_*id - " + cod1 + "\n" + "Basic Salary = " + dalySalaryBad + "\n");

        }else {
            System.out.println(speed1 + " ? Not Valid");
        }


        /*
        speed2 = cod2 (emp_*id 2)
        */

        if (speed2 == "Excellent") {

            System.out.println("emp_*id - " + cod2 + "\n" + "Basic Salary = " + dalySalaryExcellent + "\n");

        }else if (speed2 == "Good") {
            
            System.out.println("emp_*id - " + cod2 + "\n" + "Basic Salary = " + dalySalaryGood + "\n");

        }else if (speed2 == "Bad") {
            
            System.out.println("emp_*id - " + cod2 + "\n" + "Basic Salary = " + dalySalaryBad + "\n");

        }else {
            System.out.println(speed2 + " ? Not Valid");
        }
        

        /*
        speed3 = cod3 (emp_*id 3)
        */

        if (speed3 == "Excellent") {

            System.out.println("emp_*id - " + cod3 + "\n" + "Basic Salary = " + dalySalaryExcellent + "\n");

        }else if (speed3 == "Good") {
            
            System.out.println("emp_*id - " + cod3 + "\n" + "Basic Salary = " + dalySalaryGood + "\n");

        }else if (speed3 == "Bad") {
            
            System.out.println("emp_*id - " + cod3 + "\n" + "Basic Salary = " + dalySalaryBad + "\n");

        }else {
            System.out.println(speed3 + " ? Not Valid");
        }


        /*
        speed4 = cod4 (emp_*id 4)
        */

        if (speed4 == "Excellent") {

            System.out.println("emp_*id - " + cod4 + "\n" + "Basic Salary = " + dalySalaryExcellent + "\n");

        }else if (speed4 == "Good") {
            
            System.out.println("emp_*id - " + cod4 + "\n" + "Basic Salary = " + dalySalaryGood + "\n");

        }else if (speed4 == "Bad") {
            
            System.out.println("emp_*id - " + cod4 + "\n" + "Basic Salary = " + dalySalaryBad + "\n");

        }else {
            System.out.println(speed4 + " ? Not Valid");
        }


        /*
        speed5 = cod5 (emp_*id 5)
        */

        if (speed5 == "Excellent") {

            System.out.println("emp_*id - " + cod5 + "\n" + "Basic Salary = " + dalySalaryExcellent + "\n");

        }else if (speed5 == "Good") {
            
            System.out.println("emp_*id - " + cod5 + "\n" + "Basic Salary = " + dalySalaryGood + "\n");

        }else if (speed5 == "Bad") {
            
            System.out.println("emp_*id - " + cod5 + "\n" + "Basic Salary = " + dalySalaryBad + "\n");

        }else {
            System.out.println(speed5 + " ? Not Valid");
        }

        /*
        speed6 = cod6 (emp_*id 6)
        */

        if (speed6 == "Excellent") {

            System.out.println("emp_*id - " + cod6 + "\n" + "Basic Salary = " + dalySalaryExcellent + "\n");

        }else if (speed6 == "Good") {
            
            System.out.println("emp_*id - " + cod6 + "\n" + "Basic Salary = " + dalySalaryGood + "\n");

        }else if (speed6 == "Bad") {
            
            System.out.println("emp_*id - " + cod6 + "\n" + "Basic Salary = " + dalySalaryBad + "\n");

        }else {
            System.out.println(speed6 + " ? Not Valid");
        }


        /*
        speed7 = cod7 (emp_*id 7)
        */

        if (speed7 == "Excellent") {

            System.out.println("emp_*id - " + cod7 + "\n" + "Basic Salary = " + dalySalaryExcellent + "\n");

        }else if (speed7 == "Good") {
            
            System.out.println("emp_*id - " + cod7 + "\n" + "Basic Salary = " + dalySalaryGood + "\n");

        }else if (speed7 == "Bad") {
            
            System.out.println("emp_*id - " + cod7 + "\n" + "Basic Salary = " + dalySalaryBad + "\n");

        }else {
            System.out.println(speed7 + " ? Not Valid");
        }

        /*
        speed8 = cod8 (emp_*id 8)
        */

        if (speed8 == "Excellent") {

            System.out.println("emp_*id - " + cod8 + "\n" + "Basic Salary = " + dalySalaryExcellent + "\n");

        }else if (speed8 == "Good") {
            
            System.out.println("emp_*id - " + cod8 + "\n" + "Basic Salary = " + dalySalaryGood + "\n");

        }else if (speed8 == "Bad") {
            
            System.out.println("emp_*id - " + cod8 + "\n" + "Basic Salary = " + dalySalaryBad + "\n");

        }else {
            System.out.println(speed8 + " ? Not Valid");
        }

        System.out.println("--------------------------------------------------" + "\n");
    }
}

/**
 * ragular
 */
class ragular extends typist {

    int basicSalaryExcellent, basicSalaryGood, basicSalaryBad;

    ragular(){

        basicSalaryExcellent = 200000;
        basicSalaryGood = 150000;
        basicSalaryBad = 100000;
        
    }

    public void getragularSalary(){

        /*
        speed1 = cod1 (emp_*id 1)
        */

        if (speed1 == "Excellent") {

            System.out.println("emp_*id - " + cod1 + "\n" + "Basic Salary = " + basicSalaryExcellent + "\n");

        }else if (speed1 == "Good") {
            
            System.out.println("emp_*id - " + cod1 + "\n" + "Basic Salary = " + basicSalaryGood + "\n");

        }else if (speed1 == "Bad") {
            
            System.out.println("emp_*id - " + cod1 + "\n" + "Basic Salary = " + basicSalaryBad + "\n");

        }else {
            System.out.println(speed1 + " ? Not Valid");
        }


        /*
        speed2 = cod2 (emp_*id 2)
        */

        if (speed2 == "Excellent") {

            System.out.println("emp_*id - " + cod2 + "\n" + "Basic Salary = " + basicSalaryExcellent + "\n");

        }else if (speed2 == "Good") {
            
            System.out.println("emp_*id - " + cod2 + "\n" + "Basic Salary = " + basicSalaryGood + "\n");

        }else if (speed2 == "Bad") {
            
            System.out.println("emp_*id - " + cod2 + "\n" + "Basic Salary = " + basicSalaryBad + "\n");

        }else {
            System.out.println(speed2 + " ? Not Valid");
        }
        

        /*
        speed3 = cod3 (emp_*id 3)
        */

        if (speed3 == "Excellent") {

            System.out.println("emp_*id - " + cod3 + "\n" + "Basic Salary = " + basicSalaryExcellent + "\n");

        }else if (speed3 == "Good") {
            
            System.out.println("emp_*id - " + cod3 + "\n" + "Basic Salary = " + basicSalaryGood + "\n");

        }else if (speed3 == "Bad") {
            
            System.out.println("emp_*id - " + cod3 + "\n" + "Basic Salary = " + basicSalaryBad + "\n");

        }else {
            System.out.println(speed3 + " ? Not Valid");
        }


        /*
        speed4 = cod4 (emp_*id 4)
        */

        if (speed4 == "Excellent") {

            System.out.println("emp_*id - " + cod4 + "\n" + "Basic Salary = " + basicSalaryExcellent + "\n");

        }else if (speed4 == "Good") {
            
            System.out.println("emp_*id - " + cod4 + "\n" + "Basic Salary = " + basicSalaryGood + "\n");

        }else if (speed4 == "Bad") {
            
            System.out.println("emp_*id - " + cod4 + "\n" + "Basic Salary = " + basicSalaryBad + "\n");

        }else {
            System.out.println(speed4 + " ? Not Valid");
        }


        /*
        speed5 = cod5 (emp_*id 5)
        */

        if (speed5 == "Excellent") {

            System.out.println("emp_*id - " + cod5 + "\n" + "Basic Salary = " + basicSalaryExcellent + "\n");

        }else if (speed5 == "Good") {
            
            System.out.println("emp_*id - " + cod5 + "\n" + "Basic Salary = " + basicSalaryGood + "\n");

        }else if (speed5 == "Bad") {
            
            System.out.println("emp_*id - " + cod5 + "\n" + "Basic Salary = " + basicSalaryBad + "\n");

        }else {
            System.out.println(speed5 + " ? Not Valid");
        }

        /*
        speed6 = cod6 (emp_*id 6)
        */

        if (speed6 == "Excellent") {

            System.out.println("emp_*id - " + cod6 + "\n" + "Basic Salary = " + basicSalaryExcellent + "\n");

        }else if (speed6 == "Good") {
            
            System.out.println("emp_*id - " + cod6 + "\n" + "Basic Salary = " + basicSalaryGood + "\n");

        }else if (speed6 == "Bad") {
            
            System.out.println("emp_*id - " + cod6 + "\n" + "Basic Salary = " + basicSalaryBad + "\n");

        }else {
            System.out.println(speed6 + " ? Not Valid");
        }


        /*
        speed7 = cod7 (emp_*id 7)
        */

        if (speed7 == "Excellent") {

            System.out.println("emp_*id - " + cod7 + "\n" + "Basic Salary = " + basicSalaryExcellent + "\n");

        }else if (speed7 == "Good") {
            
            System.out.println("emp_*id - " + cod7 + "\n" + "Basic Salary = " + basicSalaryGood + "\n");

        }else if (speed7 == "Bad") {
            
            System.out.println("emp_*id - " + cod7 + "\n" + "Basic Salary = " + basicSalaryBad + "\n");

        }else {
            System.out.println(speed7 + " ? Not Valid");
        }

        /*
        speed8 = cod8 (emp_*id 8)
        */

        if (speed8 == "Excellent") {

            System.out.println("emp_*id - " + cod8 + "\n" + "Basic Salary = " + basicSalaryExcellent + "\n");

        }else if (speed8 == "Good") {
            
            System.out.println("emp_*id - " + cod8 + "\n" + "Basic Salary = " + basicSalaryGood + "\n");

        }else if (speed8 == "Bad") {
            
            System.out.println("emp_*id - " + cod8 + "\n" + "Basic Salary = " + basicSalaryBad + "\n");

        }else {
            System.out.println(speed8 + " ? Not Valid");
        }

        System.out.println("--------------------------------------------------" + "\n");
    }
}


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