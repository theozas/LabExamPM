package ie.gmit.pm;

/*
 * Paulius Miliunas
 * Lab test for Software with test
 * 09/03/2020
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmployeeListTest {

    @Test
    void testAddEmployee(){
        Employee employee = new Employee("Paulius",123456);
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(employee);
        assertEquals(1,employeeList.getListSize());
    }

    @Test
    void testAddDublicatedEmployee(){
        Employee employee = new Employee("Paulius",123456);
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(employee);
        assertThrows(IllegalArgumentException.class, ()-> employeeList.addEmployee(employee));
    }

    @Test
    void testDeleteEmployee(){
        Employee employee = new Employee("Paulius",123456);
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(employee);
        employeeList.deleteEmployee(123456);
        assertEquals(0,employeeList.getListSize());
    }

    @Test
    void testDeleteNotListedEmployee(){
        Employee employee = new Employee("Paulius",123456);
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(employee);
        employeeList.deleteEmployee(12345);
        assertEquals(1,employeeList.getListSize());
    }

}
