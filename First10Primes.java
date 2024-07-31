public class First10Primes {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int count = 0; // To count the number of primes found
        int num = 2;   // Starting number to check for primality
        
        System.out.println("First 10 prime numbers are:");
        
        // Loop to find and print the first 10 prime numbers
        while (count < 10) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
