package homework.employee;

import homework.employee.model.Company;
import homework.employee.model.Employee;
import homework.employee.storage.CompanyStorage;
import homework.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements Comands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        initData();

        while (isRun) {
            Comands.printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchEmployeeById();
                    break;

                case ADD_COMPANY:
                    addCompany();
                    break;

                case SEARCH_COMPANY_BY_ID:
                    searchCompanyById();
                    break;

                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    searchEmployeeByCompany();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    searchEmployeeByCompanyId();
                    break;


                case SEARCH_EMPLOYEE_BY_MIN_SALARY:
                    searchEmployeeByMinSalary();
                    break;
                case DELETE_EMPLOYEE_BY_ID:
                    deleteEmployee();
                    break;
                case CHANGE_EMPLOYEES_COMPANY:
                    changeEmployeesCompany();
                    break;
                case PRINT_EMPLOYEE_COMPANY:
                    printEmployeeCompany();
                    break;
                case COUNT_EMPLOYEES_BY_COMPANY:
                    countEmployeesByCompany();
                    break;
                case CALCULATE_TOTAL_SALARY_BY_COMPANY:
                    calculateTotalSalary();
                    break;

                case FIND_EMPLOYEE_WITH_HIGHEST_SALARY:
                    findEmloyeeWithHighestSalary();
                    break;

                case DELETE_COMPANY:
                    deletCompany();
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");

            }

        }
    }


    private static void addCompany() {
        System.out.println("Please input company id name,industry,country");

        String companyDataStr = scanner.nextLine();
        String[] companyDataArr = companyDataStr.split(",");

        Company comp = new Company();

        comp.setCompanyId(companyDataArr[0]);
        comp.setName(companyDataArr[1]);
        comp.setIndustry(companyDataArr[2]);
        comp.setCountry(companyDataArr[3]);

        companyStorage.add(comp);

        System.out.println("Company added!");

    }

    private static void searchEmployeeById() {
        System.out.println("Please input employee id");
        String id = scanner.nextLine();
        employeeStorage.searchById(id);
    }

    private static void searchCompanyById() {
        System.out.println("Please input Company id");
        String id = scanner.nextLine();
        companyStorage.searchById(id);
    }

    private static void countEmployeesByCompany() {
        System.out.println("Please input Company id");
        String id = scanner.nextLine();
        employeeStorage.getEmployeesByCompanyId(id);
    }

    private static void calculateTotalSalary() {
        System.out.println("Please input Company id for calculate total salary");
        String id = scanner.nextLine();
        employeeStorage.calculateTotalSalary(id);
    }


    private static void printEmployeeCompany() {
        System.out.println("Please input Employee id");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(id);
        if (employee == null) {
            System.out.println("Նման id-ով աշխատակից չի գտնվել");
        }
        System.out.println(employee.getCompany());

    }

    private static void searchEmployeeByMinSalary() {
        System.out.println("Input minimum salary range");
        String minSal = scanner.nextLine();
        int minimumSalaryValue = Integer.parseInt(minSal);
        employeeStorage.searchBySalary(minimumSalaryValue);
    }

    private static void deleteEmployee() {
        System.out.println("Please input employee's id for DELETING");
        String employeeId = scanner.nextLine();
        employeeStorage.deleteEmployeeById(employeeId);
    }

    private static void deletCompany() {
        System.out.println("Please input Company's id for DELETING");
        String company = scanner.nextLine();
        companyStorage.deleteCompanyById(company);
    }

    private static void searchEmployeeByCompany() {
        System.out.println("Please input Company name");
        String company = scanner.nextLine();
        employeeStorage.searchByCompanyByName(company);
    }

    private static void searchEmployeeByCompanyId() {
        System.out.println("Please input Company Id to show All Employees");
        String id = scanner.nextLine();
        employeeStorage.searchEmployeesByCompanyId(id);
    }

    private static void findEmloyeeWithHighestSalary() {
        employeeStorage.findHighestSlaryEmployee();
    }

    private static void initData() {
        Company ItSpace = new Company("1", "It Space", "IT", "Armenia");
        Company MC = new Company("2", "MC", "Sales", "Armenia");

        companyStorage.add(ItSpace);
        companyStorage.add(MC);

        Employee employee1 = new Employee("po1", "poxosyan", "11", 12, ItSpace, "dev");
        Employee employee2 = new Employee("po2", "poxosyan", "22", 12, MC, "sales");

        employeeStorage.add(employee1);
        employeeStorage.add(employee2);

    }

    public static void changeEmployeesCompany() {
        System.out.println("Please input EmployeeID");
        String empId = scanner.nextLine();

        System.out.println("Please input new Company ID");
        String compId = scanner.nextLine();
        Company newComp = companyStorage.getCompanyById(compId);

        if (newComp == null) {
            System.out.println("New company not Found");
            return;
        }
        employeeStorage.changeEmployeeCompany(empId, newComp);

    }

    private static void addEmployee() {
        System.out.println("Please input name");
        String employeeName = scanner.nextLine();

        System.out.println("Please input surname");
        String employeeSurName = scanner.nextLine();

        System.out.println("Please input id");
        String employeeId = scanner.nextLine();


        int employeeSalary = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Please input salary");

            if (scanner.hasNextInt()) {
                employeeSalary = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Please enter numbers only!");
            }
            scanner.nextLine();
        }
        System.out.println("Please input Company Id");

        String employeeCompany = scanner.nextLine();
        Company company = companyStorage.getCompanyById(employeeCompany);
        if (company == null) {
            System.out.println("please input valid company id");
            return;
        }


        System.out.println("Please input position");
        String employeePosition = scanner.nextLine();


        Employee employee = new Employee(
                employeeName,
                employeeSurName,
                employeeId,
                employeeSalary,
                company,
                employeePosition

        );
        employeeStorage.add(employee);

    }

}

