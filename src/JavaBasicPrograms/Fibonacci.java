package src.JavaBasicPrograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Give a number for the method fibo :");
        int count = s.nextInt();
        fibo(count);
        System.out.println(" ");

        System.out.println("Fibo with Recursion : ");
        System.out.print(fiboRecursion(5));
        System.out.println(" ");
        printFiboRecursion(5);

    }


// Fibonacci Series in Java without using recursion
// en iyi yaklasim
    public static void fibo(int n) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2); // İlk iki elemanı yazdır

        for(int i = 1; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    /*
    public int fiboInt(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.println("fibo Integer");
        System.out.print(n1 + " " + n2); // İlk iki sayıyı yazdır

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(" ");
        return 0; // Örnek olarak 0 döndürülüyor, burada son Fibonacci sayısını döndürebilirsiniz.
    }

    public static void fiboStatic() {

        int n1 = 0, n2 = 1, n3;

        System.out.print("fiboStatic Give a number for the Fibonacci Series : ");
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        System.out.println();
        System.out.print(n1 + " " + n2);

        for(int i = 2; i <  count; i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public void fibo() {

        int n1 = 0, n2 = 1, n3;

        System.out.print("Give a number for the Fibonacci Series : ");
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        System.out.println();
        System.out.print(n1 + " " + n2);

        for(int i = 2; i <  count; i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(" ");
    }

     */

    //Fibonacci Series in Java with using recursion

    public static int fiboRecursion(int n){
        if(n==0 | n == 1){
            return n;
        }
        else{
            return fiboRecursion(n-1) + fiboRecursion(n-2);

        }

    }

    public static void printFiboRecursion(int n){
        for(int i = 0; i <= n; i++){
            System.out.print(fiboRecursion(i) + " ");
        }
    }
}

class FibonacciExample2 {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        int count=10;
       System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }
}
