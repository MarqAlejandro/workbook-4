package com.plurasight;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double overtimeHoursWorked;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        if(hoursWorked > 40)
        {
            this.overtimeHoursWorked = hoursWorked - 40;
        }

    }

    public Employee() {
        this.employeeID = 0;
        this.name = "user";
        this.department = "place";
        this.payRate = 0;
        this.hoursWorked = 0;
        this.overtimeHoursWorked = 0;
    }

    public double getTotalPay(){
        double overtimeChecker = getOvertimeHours();
       if(overtimeChecker <= 0){
           return getRegularHours();
       }
       else{
           return getRegularHours() + overtimeChecker;
       }
    }

    public double getRegularHours(){
        return payRate*hoursWorked;
    }
    public double getOvertimeHours(){
        return payRate*1.5*overtimeHoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getOvertimeHoursWorked() {
        return overtimeHoursWorked;
    }

    public void setOvertimeHoursWorked(double overtimeHoursWorked) {
        this.overtimeHoursWorked = overtimeHoursWorked;
    }
}
