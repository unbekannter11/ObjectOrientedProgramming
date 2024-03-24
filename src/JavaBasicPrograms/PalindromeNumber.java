package src.JavaBasicPrograms;

public class PalindromeNumber {
    public static void main(String[] args) {


        PalindromeNumber p = new PalindromeNumber();
        p.numberPalindrome(10);
        PalindromeNumber.numberPalindrome(12);
        PalindromeNumber.numberPalindrome(454);

        System.out.println("*******************");
        int number = 12345;
        int reversed = reverse(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);

        System.out.println("*******************");
        numberToString(12);
        numberToString(121);


    }



    // way1
    static void numberPalindrome(int n){
        int original = n;
        int rest;
        int sum = 0;
        while (n != 0){
            rest = n % 10;
            sum = (sum * 10) + rest;
            n = n / 10;
        }
        if (original == sum){
            System.out.println(original + " is palindrome number");
        }else {
            System.out.println(original + " is not palindrome number");
        }
    }

    // way2
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Son basamağı al
            reversed = reversed * 10 + digit; // Ters çevrilmiş sayıyı güncelle
            number /= 10; // Sayının son basamağını at
        }
        return reversed;
    }

    // way3
     static void numberToString(int n) {

        // convert a number to string
        String numberString = String.valueOf(n);

        // reverse a String
        String reversedString = new StringBuilder(numberString).reverse().toString();

        // convert reversed String to Integer
        int reversedNumber = Integer.parseInt(reversedString);


        if(n == reversedNumber) {
            System.out.println(n + " is palindrome number// numberToString method");
        }else{
            System.out.println(n + " is not palindrome number// numberToString method");

        }
    }
}


