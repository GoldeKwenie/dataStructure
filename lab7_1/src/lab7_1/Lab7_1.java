
package lab7_1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Lab7_1 {

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter first time:");
        System.out.print("Hour (0-23): ");
        int hour1 = scanner.nextInt();
        System.out.print("Minute (0-59): ");
        int minute1 = scanner.nextInt();

       
        System.out.println("\nEnter second time:");
        System.out.print("Hour (0-23): ");
        int hour2 = scanner.nextInt();
        System.out.print("Minute (0-59): ");
        int minute2 = scanner.nextInt();

        
        Time t1 = new Time(hour1, minute1);
        Time t2 = new Time(hour2, minute2);

       
        System.out.println("\nFirst ");
        t1.displayTime();
        System.out.println("Second ");
        t2.displayTime();

       
        TimeComparison comparer = new TimeComparison();

        System.out.println("\n--- Comparison Result ---");

if (comparer.isGreater(t1, t2)) {
    System.out.printf("Time %02d:%02d is later.\n", t1.getHour(), t1.getMinute());
    System.out.printf("Time %02d:%02d is earlier.\n", t2.getHour(), t2.getMinute());
} else if (comparer.isLess(t1, t2)) {
    System.out.printf("Time %02d:%02d is earlier.\n", t1.getHour(), t1.getMinute());
    System.out.printf("Time %02d:%02d is later.\n", t2.getHour(), t2.getMinute());
} else {
    System.out.printf("Time %02d:%02d is equal to Time %02d:%02d.\n",
                      t1.getHour(), t1.getMinute(), t2.getHour(), t2.getMinute());
}

        scanner.close();
    }
}

    
    

