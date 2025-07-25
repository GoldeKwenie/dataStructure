/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_2;

/**
 *
 * @author Asus
 */
public class Teacher extends Person {
    public double salary;
    
    public Teacher(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }
    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Salary: " + salary);
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    
}
