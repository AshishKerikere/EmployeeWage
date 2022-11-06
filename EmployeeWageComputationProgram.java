public class EmployeeWageComputationProgram {
    public static void main(String[] args){

        int wage_Per_Hour = 20;
        int full_Day_Hour = 8;
        int half_Day_Hour = 4;
        int wage_For_Day = 0;

        int worked_Hours = 0;
        String attendance = "";
        int random = (int)Math.floor(Math.random()*3+1);

        switch(random){
            case 1: worked_Hours = 0;
                    attendance = "Absent";
                    break;
            case 2: worked_Hours = half_Day_Hour;
                    attendance = "Present for Half Day";
                    break;
            case 3: worked_Hours = full_Day_Hour;
                    attendance = "Present for Full Day";
                    break;
        }
        wage_For_Day = worked_Hours * wage_Per_Hour;

        System.out.println("The employee is " +attendance);
        System.out.println("The Wage for the day is = " +wage_For_Day);
    }
}
