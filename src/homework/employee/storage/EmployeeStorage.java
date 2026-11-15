package homework.employee.storage;

import homework.employee.model.Employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[3];
    private int size = 0;


    public void add(Employee emp) {
        boolean isFoundEmployee = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeId().equalsIgnoreCase(emp.getEmployeeId())) {
                isFoundEmployee = true;
            }
        }
        if (!isFoundEmployee) {
            if (size == array.length) {
                extend();
            }
            array[size++] = emp;
            System.out.println("Employee added!!!");
        } else System.out.println("Տվյալ id- ով աշխատակից կա արդեն");

    }

    public void deleteEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeId().equalsIgnoreCase(id)) {
                System.out.println();
                for (int j = i ; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                System.out.println("Empoyee Deleted");
                return;
            }
                    }

    }

    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }


    public void print() {
        if (size == 0) {
            System.out.println("Աշխատակիցներ չկան");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }


    public void searchById(String id) {
        boolean isFoundEmployee = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeId().equalsIgnoreCase(id)) {
                System.out.println(array[i] + " ");
                isFoundEmployee = true;
            }
        }
        if (!isFoundEmployee) {
            System.out.println("Employee with ID" + id + " not found");
        }
    }

    public void searchByCompany(String company) {
        boolean isFoundEmployee = false;

        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().equalsIgnoreCase(company)) {
                System.out.println(array[i] + " ");
                isFoundEmployee = true;
            }
        }
        if (!isFoundEmployee) {
            System.out.println("No employees found for company " + company);
        }
    }

    public void searchBySalary(int minSalary) {
        boolean isFoundEmployee = false;

        for (int i = 0; i < size; i++) {
            if (array[i].getSalary() >= minSalary) {
                System.out.println(array[i] + " ");
                isFoundEmployee = true;
            }
        }
        if (!isFoundEmployee) {
            System.out.println("No employees found for company " + minSalary);
        }
    }

}
