public class EmployeeWageComputationProgram {
    public static void main(String[] args){

        String attendance;
        int random = (int)Math.floor(Math.random()*2+1);

        if (random == 1){
            attendance = "Absent";
        }
        else{
            attendance = "Present";
        }

        System.out.println("The employee is " +attendance);
    }
}
