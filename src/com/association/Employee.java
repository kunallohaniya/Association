package com.association;

public class Employee {
    String name;
    String eid;
    EmployeeAddress eaddress; // aggrigation
//    here eaddress is now global. we can use it anywhere in our class

    Employee(String name, String eid) {
        this.name=name;
        this.eid=eid;
        eaddress = new EmployeeAddress("Sector-16","Faridabad",121002);//association
    }

    void showEmployee() {
        System.out.println("Employee Name : " + name + " | E-ID: " + eid);
        System.out.println(eaddress.street + " " + eaddress.city + " " + eaddress.pincode);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("kunal","305RWI");
        employee.showEmployee();
    }
}
