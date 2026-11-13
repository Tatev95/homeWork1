package homework.employee.storage;

import homework.employee.model.Employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[3];
    private int size = 0;


    public void add(Employee emp) {
        boolean isFoundEmployee = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getEmplyeeId().equalsIgnoreCase(emp.getEmplyeeId())) {
                isFoundEmployee = true;
            }
        }
        if (!isFoundEmployee) {
            if (size == array.length) {
                extend();
            }
            array[size++] = emp;
        } else System.out.println("Տվյալ id- ով աշխատակից կա արդեն");

    }
    public void deleteEmployeeById(String  id){
        for (int i = 0; i < size; i++) {
            if (array[i].getEmplyeeId().equalsIgnoreCase(id)) {
                System.out.println();
                for (int j = i+1; j < size-1; j++) {
                    array[j] = array[j+1];
                }
                size--;
                System.out.println("Empoyee Deleted");
                return;
            }

            System.out.println(array[i]);

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
            if (array[i].getEmplyeeId().equalsIgnoreCase(id)) {
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
            if (array[i].getSalary() <= minSalary) {
                System.out.println(array[i] + " ");
                isFoundEmployee = true;
            }
        }
        if (!isFoundEmployee) {
            System.out.println("No employees found for company " + minSalary);
        }
    }

}
