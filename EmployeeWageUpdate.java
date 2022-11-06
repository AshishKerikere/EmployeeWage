import java.util.Scanner;
public class EmployeeWageUpdate {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Companies");
        int N = scanner.nextInt(System.in);

        EmpWageBuilder employeeWageBuilder = new EmpWageBuilder(N);

        for(int i = 1; i <= N; i++){
            System.out.print("Enter the company " +i +" th name");
            String company_Name = scanner.next();
            System.out.println("Enter the company " +i +" Wage Per Hour");
            int wage_Per_Hour = scanner.nextInt();
            System.out.println("Enter the company " + i + " Maximum Working Hours");
            int max_Working_Hours = scanner.nextInt();
            System.out.println("Enter the company " + i + " Maximum Working Days");
            int max_Working_days = scanner.nextInt();

            employeeWageBuilder.companyDetails(String company_Name,int wage_Per_Hour, int max_Working_Hours, int max_Working_days, int i);
        }
        System.out.println("Enter the Name of the Company");
        String company_Name = scanner.next();

        System.out.println("The company " +company_Name +" Employee Wage is = " +employeeWageBuilder.employeeWage(String company_Name));

        employeeWageBuilder.company_Details_Access();

    }
}
