package com.Bridglabz;

import java.util.Scanner;

public class EmployeeWage {
    int sal,id,total_sal;
    String name;
    public void sal(int sal){

        total_sal=sal*12;

    }
    public void display(){
        System.out.println("name of the employee is " +name);
        System.out.println("total sal of the employee is " +total_sal);
        System.out.println("id of the employee is "+id);

    }
    public static void main(String[] args) {
        EmployeeWage e= new EmployeeWage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the emp:");
        e.name=sc.next();
        System.out.println("Enter salary of the emp:");
        e.sal=sc.nextInt();
        System.out.println("Enter Id of the employee:");
        e.id=sc.nextInt();
        e.sal(e.sal);
        e.display();
    }

}
