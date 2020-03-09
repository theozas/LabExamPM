package ie.gmit.pm;

/*
 * Paulius Miliunas
 * Lab test for Software with test
 * 09/03/2020
 */


public class Employee {

    private String name;
    private Integer employeeNumber;

    public Employee(String name, int employeeNumber) {
        if(name.length() > 5) {
            this.name = name;
        }else{
            throw new IllegalArgumentException("Employee mane is invalid");
        }
        if(employeeNumber > 10000 ) {
            this.employeeNumber = employeeNumber;
        }else{
            throw new IllegalArgumentException("Employee number is invalid");
        }
    }

    public String getName() {
        return name;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

}
