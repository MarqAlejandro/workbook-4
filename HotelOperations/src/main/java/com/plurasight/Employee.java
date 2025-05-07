package com.plurasight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double overtimeHoursWorked;
    private double startTime;
    private double endTime;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = 0;
        this.endTime = 0;
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
        this.startTime = 0;
        this.endTime = 0;
    }


    public void punchIn(double time){
        setStartTime(time);
    }

    public void punchIn(LocalTime time){
        this.startTime = Double.parseDouble(String.valueOf(time));
    }

    public LocalTime punchIn(){
        return LocalTime.parse(String.valueOf(startTime));
    }


    public void punchOut(double time){
        setEndTime(time);
    }
    public void punchOut(LocalTime time){
        this.endTime = Double.parseDouble(String.valueOf(time));
    }

    public LocalTime punchOut(){
        return LocalTime.parse(String.valueOf(endTime));
    }

    public double getHoursWorked(double startTime, double endTime){
        return endTime - startTime;
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

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }
}
