public class EmployeeWageComputationProgram {
    public static void main(String[] args){

        int wage_Per_Hour = 20;
        int full_Day_Hour = 8;
        int half_Day_Hour = 4;
        int wage_For_Day = 0;

        int worked_Hours;
        String attendance;
        int random = (int)Math.floor(Math.random()*3+1);

        if (random == 1){
            attendance = "Absent";
            worked_Hours = 0;
        }
        else if(random == 2){
            attendance = "Present for Half Day";
            worked_Hours = half_Day_Hour;
        }
        else{
            attendance = "Present for Full Day";
            worked_Hours = full_Day_Hour;
        }
        wage_For_Day = worked_Hours * wage_Per_Hour;

        System.out.println("The employee is " +attendance);
        System.out.println("The Wage for the day is = " +wage_For_Day);
    }
}
