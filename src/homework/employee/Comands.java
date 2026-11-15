package homework.employee;

public interface Comands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEES = "2";
    String SEARCH_EMPLOYEE_BY_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY = "4";
    String SEARCH_EMPLOYEE_BY_MIN_SALARY = "5";
    String DELETE_EMPLOYEE_BY_ID = "6";

    String ADD_COMPANY = "7";
    String PRINT_ALL_COMPANIES = "8";
    String SEARCH_COMPANY_BY_ID = "9";
    String SEARCH_EMPLOYEE_BY_COMPANY_ID = "10";
    String CHANGE_EMPLOYEES_COMPANY = "11";
    String PRINT_EMPLOYEE_COMPANY = "12";
    String COUNT_EMPLOYEES_BY_COMPANY = "13";
    String CALCULATE_TOTAL_SALARY_BY_COMPANY = "14";
    String FIND_EMPLOYEE_WITH_HIGHEST_SALARY = "15";
    String DELETE_COMPANY = "16";


    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_EMPLOYEE + " for add Employee");
        System.out.println("Please input " + PRINT_ALL_EMPLOYEES + " for print all Employee");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for search Employee by id");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY + " for search Employee by company");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_MIN_SALARY + " for search Employee by minimum salary");
        System.out.println("Please input " + DELETE_EMPLOYEE_BY_ID + " for DELETING Employee by ID");

        System.out.println("Please input " + ADD_COMPANY + " for Adding Company");
        System.out.println("Please input " + PRINT_ALL_COMPANIES + " for print all Companies");
        System.out.println("Please input " + SEARCH_COMPANY_BY_ID + " for searching  Company by ID");

        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY_ID + " for searching  Employee by Company ID");
        System.out.println("Please input" + CHANGE_EMPLOYEES_COMPANY + " Employees ID and New Compomany's ID");
        System.out.println("Please input" + PRINT_EMPLOYEE_COMPANY + " For show Employee's Company");

        //BONUS EX-S
        System.out.println("Please input" + COUNT_EMPLOYEES_BY_COMPANY + " For count Employees by Company");
        System.out.println("Please input" + CALCULATE_TOTAL_SALARY_BY_COMPANY + " TO Calculate Total Salary By Company");
        System.out.println("Please input" + FIND_EMPLOYEE_WITH_HIGHEST_SALARY + " To show Employee with Highest Salary");
        System.out.println("Please input" + DELETE_COMPANY + " For Delete Company");

    }

}
