package ie.gmit.pm;

/*
* Paulius Miliunas
* Lab test for Software with test
* 09/03/2020
*/

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList <Employee> employeeArrayList = new ArrayList<>();


    public void addEmployee(Employee employee){
            if(employeeArrayList.contains(employee)){

                System.out.println("Found duplicated entry");
                throw new IllegalArgumentException("Employee already in the list");

            }else{
                employeeArrayList.add(employee);
                System.out.println("Employee was added to the list");
            }

    }

    public void deleteEmployee(int employeeNumber){
        boolean notice = true;
        for (int i = 0; i < employeeArrayList.size();i++){
            if((employeeArrayList.get(i)).getEmployeeNumber() == employeeNumber){
                employeeArrayList.remove(i);
                System.out.println("Employee deleted from list");
                break;
            }else{
                notice = false;
            }
            if(!notice){
                System.out.println("No matching employee is found");
            }
        }
    }

    public int getListSize(){
        return employeeArrayList.size();
    }
}
