/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_golde;

import java.util.Random;
import java.util.Scanner;


public class Lab1_golde {

     private int[] array;
     private int size;
    

    public Lab1_golde(int initialSize) {
        array = new int[initialSize];
        size = 0; 
    }


    public long insert(int value) {
        long startTime = System.nanoTime();
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = value;
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long delete(int value) {
        long startTime = System.nanoTime();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }


    public long search(int value) {
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                long endTime = System.nanoTime();
                return endTime - startTime; 
            }
        }
        long endTime = System.nanoTime();
        return endTime - startTime; 
    }

    public void printArray() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int initialSize = 10;
        Lab1_golde arrOps = new Lab1_golde(initialSize);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Print Array");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    long insertTime = arrOps.insert(insertValue);
                    System.out.println("Insert time: " + insertTime + " ns");
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    long deleteTime = arrOps.delete(deleteValue);
                    System.out.println("Delete time: " + deleteTime + " ns");
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();
                    long searchTime = arrOps.search(searchValue);
                    System.out.println("Search time: " + searchTime + " ns");
                    break;
                case 4:
                    arrOps.printArray();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}