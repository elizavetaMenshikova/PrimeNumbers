//A prime number
//Write a Java program to check if a given number is prime or not.
// Remember, a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc.
// Be prepared for cross, e.g. checking till the square root of a number, etc.

import java.util.Random;

public class PrimeNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Случайное число: " + number);
        System.out.println(isPrime(number) ? "Число простое" : "Число не простое");
    }

    public static boolean isPrime(int number) {
        if (number < 1) {
            System.out.println("Число должно быть больше 0");
            throw new IllegalArgumentException();
        }
        if (number < 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
