/**
 * typist
 */
public class typist extends staf {

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
