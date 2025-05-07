package com.plurasight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {

    @Test
    void punchIn_expectingHours() {
        //arrange
        Employee employee = new Employee();

        double expectedHoursWorked = 5.0;

        //act
        employee.punchIn(2.0); //this is the one being tested


        employee.punchOut(7.0); //this one doesn't get touched


        double actualHoursWorked = employee.getHoursWorked(employee.getStartTime(), employee.getEndTime());

         //assert
        assertEquals(expectedHoursWorked, actualHoursWorked);
    }

    @Test
    void punchOut() {
        //arrange
        Employee employee = new Employee();

        double expectedHoursWorked = 5.0;

        //act
        employee.punchIn(0.0); //this one doesn't get touched


        employee.punchOut(5.0); //this is the one getting tested


        double actualHoursWorked = employee.getHoursWorked(employee.getStartTime(), employee.getEndTime());

        //assert
        assertEquals(expectedHoursWorked, actualHoursWorked);
    }
}