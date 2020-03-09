package ie.gmit.pm;

/*
 * Paulius Miliunas
 * Lab test for Software with test
 * 09/03/2020
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmployeeTest {

    @Test
    void testConstructorArgumentsOKName(){
        Employee employee = new Employee("Paulius",123456);
        assertEquals("Paulius", employee.getName());
    }

    @Test
    void testConstructorArgumentsOKNumber(){
        Employee employee = new Employee("Paulius",123456);
        assertEquals(123456, employee.getEmployeeNumber());
    }


    @Test
    void testConstructorArgumentsBadName(){
        assertThrows(IllegalArgumentException.class, () ->
                new Employee("Paul",123456));
    }

    @Test
    void testConstructorArgumentsBadNumber(){
        assertThrows(IllegalArgumentException.class, () ->
                new Employee("Paulius",1234));
    }

}
