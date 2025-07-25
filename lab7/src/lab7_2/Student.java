/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_2;


 public class Student extends Person {
    private double grade;

    public Student(String name, int age, String gender,double grade) {
        super(name, age, gender);
        this.grade = grade;
    }
    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Grade: " + grade);
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }
    
    
    
}
