
package lab7_2;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab7 {

    
    public static void main(String[] args) {
       
        Scanner scr = new Scanner(System.in);
        ArrayList<Person> person = new ArrayList<>();
        
        System.out.println("How many students would you like to input? ");
        int students = scr.nextInt();
        
        for ( int i = 0; i < students; i++) {
            System.out.println("Details for Student " + (i + 1) + ":\n");  
           
            System.out.println("Name: ");
            String name = scr.next();
            
            System.out.println("Age: ");
            int age = scr.nextInt();
            
            System.out.println("Gender");
            String gender = scr.next();
            
            System.out.println("Grade: ");
            double grade = scr.nextDouble();
            System.out.println("\n");
            
            person.add(new Student(name,age,gender, grade));  
            
           
        }
        
        System.out.println("How many teachers would you like to input? ");
        int techer = scr.nextInt();
        
        for ( int i = 0; i < students; i++) {
            System.out.println("Details for Teacher " + (i + 1) + ":\n");  
           
            System.out.println("Name: ");
            String name = scr.next();
            
            System.out.println("Age: ");
            int age = scr.nextInt();
            
            System.out.println("Gender");
            String gender = scr.next();
            
            System.out.println("Salary: ");
            double salary = scr.nextDouble();
            System.out.println("\n");
            
            person.add(new Teacher (name,age,gender, salary));
        
    }
        System.out.println("===Students and Teachers Information===");
        for (int i = 0; i < person.size(); i++) {
            Person persons = person.get(i);
            
            if (persons instanceof Student) {
                System.out.println("\n");
                System.out.println("Student " +( i+1) + ":"); 
                
            } else if (persons instanceof Teacher) {
                System.out.println("\n");
                System.out.println("Teacher: " +(i+1 - students) + ":");
            }
            persons.displayInformation();
        }
    
        scr.close();
}
   
}