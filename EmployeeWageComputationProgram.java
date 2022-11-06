public class EmployeeWageComputationProgram {
    public static void main(String[] args){

        int wage_Per_Hour = 20;
        int full_Day_Hour = 8;
        int half_Day_Hour = 4;

        int wage_For_Day = 0;
        int monthly_Wage = 0;

        int worked_Hours = 0;
        int monthly_Hours = 0;

        int working_Days_In_Month = 0;

        while(monthly_Hours < 100 && working_Days_In_Month < 20) {
            int random = (int)Math.floor(Math.random()*3+1);
            switch (random) {
                case 1: worked_Hours = 0;
                        break;
                case 2: worked_Hours = half_Day_Hour;
                        break;
                case 3: worked_Hours = full_Day_Hour;
                        break;
            }
            wage_For_Day = worked_Hours * wage_Per_Hour;

            monthly_Hours = monthly_Hours + worked_Hours;
            monthly_Wage = monthly_Wage + wage_For_Day;

            working_Days_In_Month++;
        }

        System.out.println("The Wage for month is = " +monthly_Wage);
        System.out.println("The Total Number of Working Days in this Month " +working_Days_In_Month);
        System.out.println("The Total Number of Working Hours in this Month " +monthly_Hours);
    }
}
