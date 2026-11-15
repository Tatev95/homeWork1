package homework.employee.storage;

import homework.employee.model.Company;
import homework.employee.model.Employee;

public class CompanyStorage {

    private Company[] array = new Company[3];
    private int size = 0;

    public void add(Company comp) {
        boolean isFoundCompany = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getCompanyId().equalsIgnoreCase(comp.getCompanyId())) {
                isFoundCompany = true;
            }
        }
        if (!isFoundCompany) {
            if (size == array.length) {
                extend();
            }
            array[size++] = comp;
            System.out.println("Company added!!!");
        } else System.out.println("Տվյալ id- ով կազմակերություն կա արդեն");

    }

    public Company getCompanyByName(String companyName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equalsIgnoreCase(companyName)) {
                return array[i];
            }
        }
        return null;
    }


    public Company getCompanyById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (array[i].getCompanyId().equalsIgnoreCase(companyId)) {
                return array[i];
            }
        }
        return null;
    }


    public void deleteCompanyById(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getCompanyId().equalsIgnoreCase(id)) {
                System.out.println();
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                System.out.println("Company Deleted");
                return;
            }
        }

    }

    private void extend() {
        Company[] tmp = new Company[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }


    public void print() {
        if (size == 0) {
            System.out.println("Կազմակերպություննր չկան");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public void searchById(String id) {
        boolean isFoundCompany = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getCompanyId().equalsIgnoreCase(id)) {
                System.out.println(array[i] + " ");
                isFoundCompany = true;
            }
        }
        if (!isFoundCompany) {
            System.out.println("Company with ID" + id + " not found");
        }
    }
}

