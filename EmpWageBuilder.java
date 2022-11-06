interface EmpWageBuilderTemplate {
    int N;
    int employee_Wagesof_MultipleCompanies[];
    Company company[];
    public void EmpWageBuilder(int N);
    public void companyDetails(String company_Name,int wage, int hours, int days, int index);
    public int employeeWage(String Name);
    public void company_Details_Access(String name);

}

public class EmpWageBuilder implements EmpWageBuilderTemplate {
    int N;
    int employee_Wagesof_MultipleCompanies[];
    Company company[];

    public void EmpWageBuilder(int N) {
        this.N = N;
        employee_Wagesof_MultipleCompanies = new int[N];
        company = new Company[N];
    }

    public void companyDetails(String company_Name, int wage, int hours, int days, int index) {
        company[index - 1] = new Company(String company_Name, int wage, int hours, int days)
    }

    public int employeeWage(String Name) {
        int index_Of_Company;
        for (int i = 0; i < N; i++) {
            if (company[i].name_ofthe_Company == Name) {
                index_Of_Company = i;
                break;
            }
        }
        int wage_Per_Hour = company[index_Of_Company].wage_Per_Hour;
        int full_Day_Hour = 8;
        int half_Day_Hour = 4;

        int wage_For_Day = 0;
        int monthly_Wage = 0;

        int worked_Hours = 0;
        int monthly_Hours = 0;

        int working_Days_In_Month = 0;

        while (monthly_Hours < company[index_Of_Company].max_Working_Hours && working_Days_In_Month < company[index_Of_Company].max_Working_days) {
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
        company[index_Of_Company].total_Wage_Paid = monthly_Wage;
        employee_Wagesof_MultipleCompanies[index_Of_Company] = monthly_Wage;
        return monthly_Wage;
    }

    public void company_Details_Access() {
        System.out.println("Company Name" + "\t" + "CompanyWage");
        for (int i = 0; i < N; i++) {
            System.out.println(+company[i].name_ofthe_Company + "\t " + employee_Wagesof_MultipleCompanies[i]);
        }
    }

    
}
