import java.util.Scanner;
public class EmployeeWageComputationProgram {
    public static void main(String[] args) {

        System.out.println("Enter the Number of Companies");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Company company[] = new Company[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter the company " + (i + 1) + " th name");
            String company_Name = scanner.next();
            System.out.println("Enter the company " + (i + 1) + " Wage Per Hour");
            int wage_Per_Hour = scanner.nextInt();
            System.out.println("Enter the company " + (i + 1) + " Maximum Working Hours");
            int max_Working_Hours = scanner.nextInt();
            System.out.println("Enter the company " + (i + 1) + " Maximum Working Days");
            int max_Working_days = scanner.nextInt();

            company[i] = new Company(company_Name, wage_Per_Hour, max_Working_Hours, max_Working_days);
            System.out.println("The Monthly wage of Company " + (i + 1) + " = " + employeeWage(company[i]));
        }
    }

    static int employeeWage(Company company) {
        int wage_Per_Hour = company.wage_Per_Hour;
        int full_Day_Hour = 8;
        int half_Day_Hour = 4;

        int wage_For_Day = 0;
        int monthly_Wage = 0;

        int worked_Hours = 0;
        int monthly_Hours = 0;

        int working_Days_In_Month = 0;

        while (monthly_Hours < company.max_Working_Hours && working_Days_In_Month < company.max_Working_days) {
            int random = (int) Math.floor(Math.random() * 3 + 1);
            switch (random) {
                case 1:
                    worked_Hours = 0;
                    break;
                case 2:
                    worked_Hours = half_Day_Hour;
                    break;
                case 3:
                    worked_Hours = full_Day_Hour;
                    break;
            }
            wage_For_Day = worked_Hours * wage_Per_Hour;

            monthly_Hours = monthly_Hours + worked_Hours;
            monthly_Wage = monthly_Wage + wage_For_Day;

            working_Days_In_Month++;
        }
        company.total_Wage_Paid = monthly_Wage;
        return monthly_Wage;
    }
}
