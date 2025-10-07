
package first_examination;

import java.util.Scanner;


public class FIRST_EXAMINATION {

  
    public static void main(String[] args) {
        Scanner scr = new Scanner( System.in);
        
        String Remarks;
        
        System.out.println("How many student will you input? ");
        int num = Integer.parseInt(scr.nextLine());
        
         
        String [][] Student = new String[num][5];
        for (int i = 0; i < num; i++) {
        
        System.out.println("============================================");
        
         System.out.println("Student Name: ");
         Student[i][0] = scr.nextLine();
        
        System.out.println("Address: ");
        Student[i][1] = scr.nextLine();
        
        System.out.println("Grade Level: ");
        Student[i][2] = scr.nextLine();
        
        System.out.println("Gender: ");
        Student[i][3] = scr.nextLine();
        
        System.out.println("GWA (General Weighted Average): ");
        Student[i][4] = scr.nextLine();
        
        }
        
            System.out.println("\n===== STUDENT INFORMATION =====\n");
        
        for (int i = 0; i < num; i++) {
            String Name = Student[i][0];
            String Address = Student[i][1];
            int Grade = Integer.parseInt(Student[i][2]);
            String Gender = Student[i][3];
            int GWA = Integer.parseInt(Student[i][4]);
            
             if (GWA >= 75) {
            Remarks = "PASSED";
             } else {
            Remarks = "FAILED";
             }
        
            System.out.println("Full Name: " + Name);
            System.out.println("Address: " + Address);
            System.out.println("Grade Level: " + Grade);
            System.out.println("Gender: " + Gender);
            System.out.println("GWA (General Weighted Average): " + GWA);
            System.out.println("Remarks: " + Remarks);
            System.out.println("\n");
        }
    }
    }
    
