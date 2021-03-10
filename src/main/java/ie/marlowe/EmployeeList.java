package ie.marlowe;

import java.util.ArrayList;

public class EmployeeList extends Employee {
    private ArrayList<Employee> empList;

    public EmployeeList() {
        this.empList = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        if (empList.contains(employee.getEmpNumb())) {
            throw new IllegalArgumentException("Employee already existed");
        } else {
            empList.add(employee);
        }
    }

    public void deleteEmployee(String EmployeeNumber){
        if(empList.contains(EmployeeNumber)){
            empList.remove(EmployeeNumber);
            System.out.println("Employee deleted from the list");
        } else {
            throw new IllegalArgumentException("No matching Employee found");
        }
    }

    public void listSize(){
        for(int i = 0; i<this.empList.size(); i++){
            System.out.println(i);
        }
    }
}
