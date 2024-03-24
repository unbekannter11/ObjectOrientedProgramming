package src.JavaBasicPrograms;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        boolean isprimedeneme = isPrime(9);
        System.out.println("isPrime method = " + isprimedeneme);


        primeBetween(5, 13);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int m = scanner.nextInt();
        primeBetween(n,m);

    }

    static void  prime(int n){
        int flag = 0;
        if(n <=1){
            System.out.println(n);
        }else{
            for(int i = 2; i <= n-1; i++){
                if((n % i) == 0 ){
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n + " is prime number");
            }
        }
    }


    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    static void primeBetween(int n, int m){
        for(int i = n; i <= m; i++){
            if(isPrime(i)){
                if(i < m){
                    System.out.print(i + ",");
                }else {
                    System.out.println(i);
                }
            }
        }
    }
}
