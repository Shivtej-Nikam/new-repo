import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting three numbers from the user
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        // Finding the largest of the three numbers
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Displaying the largest number
        System.out.println("The largest number is: " + largest);

        // Displaying the sum of the largest number (since it's just one number, it's the same as the number itself)
        System.out.println("The sum of the largest number is: " + largest);
    }
}
