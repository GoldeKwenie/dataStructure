/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_golde;

/**
 *
 * @author aeron
 */
public class Lab2_GOLDE {


    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] inputs = {10, 5, 30, 35, 40}; 

        System.out.println("Input | Recursive Time (ms) | Iterative Time (ms) | Observation");
        System.out.println("------|---------------------|---------------------|------------");

        for (int input : inputs) {
            // Recursive
            long startTimeRecursive = System.nanoTime();
            long resultRecursive = fibonacciRecursive(input);
            long endTimeRecursive = System.nanoTime();
            double durationRecursiveMs = (endTimeRecursive - startTimeRecursive) / 1000000.0;

            // Iterative
            long startTimeIterative = System.nanoTime();
            long resultIterative = fibonacciIterative(input);
            long endTimeIterative = System.nanoTime();
            double durationIterativeMs = (endTimeIterative - startTimeIterative) / 1000000.0;

            String observation = "";
            if (durationRecursiveMs > durationIterativeMs * 10) {
                observation = "Recursive is significantly slower";
            } else {
                observation = "Iterative is faster";
            }

            System.out.printf("%5d | %19.2f | %19.2f | %s%n",
                    input, durationRecursiveMs, durationIterativeMs, observation);
        }
    }
}