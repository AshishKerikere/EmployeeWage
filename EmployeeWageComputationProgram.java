public class EmployeeWageComputationProgram {
    public static void main(String[] args){

        int wage_Per_Hour = 20;
        int full_Day_Hour = 8;
        int wage_For_Day = 0;

        int worked_Hours;
        String attendance;
        int random = (int)Math.floor(Math.random()*2+1);

        if (random == 1){
            attendance = "Absent";
            worked_Hours = 0;
        }
        else{
            attendance = "Present";
            worked_Hours = full_Day_Hour;
        }

        wage_For_Day = worked_Hours * wage_Per_Hour;

        System.out.println("The employee is " +attendance);
        System.out.println("The Wage for the day is = " +wage_For_Day);
    }
}
