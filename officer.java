/**
 * officer
 */
public class officer extends staf {

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